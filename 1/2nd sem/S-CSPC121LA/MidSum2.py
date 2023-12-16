continue_execution = "Y"
word_list = []

while continue_execution in ("Y", "y"):
    word = input("Enter a word: ")
    word_list.append(word)
    continue_execution = input("Try again? Y/y or N/n: ")

print("Inputted words:", word_list)
print("Total number of words:", len(word_list))
