name = input("Enter your name: ")
card_num = input("Input credit card number: ")
card_num_hidden = card_num[:4] + "*#" * len(card_num[4:-4]) + card_num[-4:]

print(f"Hi {name}!")
if len(card_num) <= 8:
    print(f"You inputted {card_num} which is Invalid!")
    print("It must be a number with more than eight digits.")
    print("Please Try Again...")
else:
    print(f"Your credit card no. is: {card_num_hidden}")
