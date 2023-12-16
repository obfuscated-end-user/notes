print("Primary Colors: RED BLUE YELLOW".center(80, " "))
print("Secondary Colors: PURPLE ORANGE GREEN".center(80, " "), "\n")

print("When Mixed:")
print("red  + blue   = purple")
print("red  + yellow = orange")
print("blue + yellow = green\n")

print("=" * 80, "\n")

first_color = input("Choose your first color.:\t\t")
second_color = input("What is your second color?:\t\t")
mixed_color = ""  # result

if first_color == "red":
    if second_color == "blue":
        mixed_color = "purple"
        print(f"Your result is {mixed_color}")
    elif second_color == "yellow":
        mixed_color = "orange"
        print(f"Your result is {mixed_color}")
    elif second_color == first_color:
        print(f"Your result is {first_color}")
    else:
        print("That is not a primary color!")
elif first_color == "blue":
    if second_color == "red":
        mixed_color = "purple"
        print(f"Your result is {mixed_color}")
    elif second_color == "yellow":
        mixed_color = "green"
        print(f"Your result is {mixed_color}")
    elif second_color == first_color:
        print(f"Your result is {first_color}")
    else:
        print("That is not a primary color!")
elif first_color == "yellow":
    if second_color == "red":
        mixed_color = "orange"
        print(f"Your result is {mixed_color}")
    elif second_color == "blue":
        mixed_color = "green"
        print(f"Your result is {mixed_color}")
    elif second_color == first_color:
        print(f"Your result is {first_color}")
    else:
        print("That is not a primary color!")
else:
    print("That is not a primary color!")
