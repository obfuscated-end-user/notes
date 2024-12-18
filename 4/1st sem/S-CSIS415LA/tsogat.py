import torch
import torch.nn as nn
import torch.optim as optim
from transformers import pipeline, AutoModelForSequenceClassification, AutoTokenizer
from sklearn.metrics import accuracy_score
from sklearn.model_selection import train_test_split
import random

# Define a small conversational dataset
dataset = [
    {"text": "Hello, how are you?", "intent": "greeting"},
    {"text": "What's your name?", "intent": "question"},
    {"text": "I'm feeling sad today.", "intent": "emotion"},
    {"text": "Can you tell me a joke?", "intent": "entertainment"},
    {"text": "Goodbye, see you later!", "intent": "greeting"},
    {"text": "How old are you?", "intent": "question"},
    {"text": "I'm feeling happy today.", "intent": "emotion"},
    {"text": "Can you recommend a movie?", "intent": "entertainment"},
    # Add more examples here...
]

# Define a dictionary that maps intent names to class labels
intent_to_label = {
    "greeting": 0,
    "question": 1,
    "emotion": 2,
    "entertainment": 3
}

# Create the labels tensor
labels = []
for example in dataset:
    labels.append(intent_to_label[example["intent"]])

# Split the dataset into training and validation sets
train_texts, val_texts, train_labels, val_labels = train_test_split([example["text"] for example in dataset], labels, test_size=0.2, random_state=42)

# Load pre-trained BERT model and tokenizer
model_name = "bert-base-uncased"
model = AutoModelForSequenceClassification.from_pretrained(model_name, num_labels=4)
tokenizer = AutoTokenizer.from_pretrained(model_name)

# Convert text data to numerical values using tokenizer
train_encodings = tokenizer(train_texts, truncation=True, padding=True)
val_encodings = tokenizer(val_texts, truncation=True, padding=True)

# Create tensors for input IDs, attention masks, and labels
train_input_ids = torch.tensor(train_encodings['input_ids'])
train_attention_mask = torch.tensor(train_encodings['attention_mask'])
train_labels = torch.tensor(train_labels)

val_input_ids = torch.tensor(val_encodings['input_ids'])
val_attention_mask = torch.tensor(val_encodings['attention_mask'])
val_labels = torch.tensor(val_labels)

# Define a custom dataset class for our data
class ConversationalDataset(torch.utils.data.Dataset):
    def __init__(self, input_ids, attention_mask, labels):
        self.input_ids = input_ids
        self.attention_mask = attention_mask
        self.labels = labels

    def __getitem__(self, idx):
        return {
            'input_ids': self.input_ids[idx],
            'attention_mask': self.attention_mask[idx],
            'labels': self.labels[idx]
        }

    def __len__(self):
        return len(self.labels)

# Create dataset instances for training and validation
train_dataset = ConversationalDataset(train_input_ids, train_attention_mask, train_labels)
val_dataset = ConversationalDataset(val_input_ids, val_attention_mask, val_labels)

# Create data loaders for training and validation
batch_size = 16
train_loader = torch.utils.data.DataLoader(train_dataset, batch_size=batch_size, shuffle=True)
val_loader = torch.utils.data.DataLoader(val_dataset, batch_size=batch_size, shuffle=False)

# Set the device (GPU or CPU)
device = torch.device("cuda" if torch.cuda.is_available() else "cpu")
model.to(device)

# Define the optimizer and loss function
optimizer = optim.Adam(model.parameters(), lr=1e-5)
criterion = nn.CrossEntropyLoss()

# Train the model
for epoch in range(5):
    model.train()
    total_loss = 0
    for batch in train_loader:
        input_ids = batch['input_ids'].to(device)
        attention_mask = batch['attention_mask'].to(device)
        labels = batch['labels'].to(device)

        optimizer.zero_grad()

        outputs = model(input_ids, attention_mask=attention_mask)
        loss = criterion(outputs.logits, labels)

        loss.backward()
        optimizer.step()

        total_loss += loss.item()
    print(f"Epoch {epoch+1}, Loss: {total_loss / len(train_loader)}")

    model.eval()
    with torch.no_grad():
        total_correct = 0
        for batch in val_loader:
            input_ids = batch['input_ids'].to(device)
            attention_mask = batch['attention_mask'].to(device)
            labels = batch['labels'].to(device)

            outputs = model(input_ids, attention_mask=attention_mask)
            _, predicted = torch.max(outputs.logits, dim=1)
            total_correct += (predicted == labels).sum().item()

        accuracy = accuracy_score(val_labels.cpu().numpy(), predicted.cpu().numpy())
        print(f"Epoch {epoch+1}, Val Accuracy: {accuracy:.4f}")

# Use a pre-trained NER model for entity extraction
ner_model = pipeline("ner", model="bert-base-uncased")

def extract_entities(text):
    entities = ner_model(text)
    entity_list = [(entity["word"], entity["score"], entity["entity"]) for entity in entities]
    return entity_list

# Test the intent recognition model
def recognize_intent(text):
    encoding = tokenizer.encode_plus(
        text,
        max_length=512,
        padding="max_length",
        truncation=True,
        return_attention_mask=True,
        return_tensors="pt"
    )
    input_ids = encoding["input_ids"].flatten()
    attention_mask = encoding["attention_mask"].flatten()

    input_ids = input_ids.to(device)
    attention_mask = attention_mask.to(device)

    outputs = model(input_ids.unsqueeze(0), attention_mask=attention_mask.unsqueeze(0))
    _, predicted = torch.max(outputs.logits, dim=1)
    intent = list(intent_to_label.keys())[list(intent_to_label.values()).index(predicted.item())]
    return intent

# Test the entity extraction model
text = "I want to book a flight from New York to Los Angeles."
entities = extract_entities(text)
print("Entities:", entities)

# Test the intent recognition model
intent = recognize_intent(text)
print("Intent:", intent)
