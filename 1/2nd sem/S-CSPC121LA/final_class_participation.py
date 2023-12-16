class Animal:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def __repr__(self):
        return f"Animal [name = {self.name}\t age = {self.age}]"


def create():
    name = input("Enter name: ")
    age = input("Enter age: ")
    return Animal(name, age)


def show(pet):
    print("Display pet")
    for animal in pet:
        print(animal)


pet = []
print("1 - Input value\t2 - Show value\t3 - Exit")
running = True
while running:
    option = int(input("\nInput your option: "))
    if option == 1:
        pet.append(create())
    elif option == 2:
        show(pet)
    else:
        break
