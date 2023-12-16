class Customers:
    def __init__(self, name, beverage, food, total):
        self.name = name
        self.beverage = beverage
        self.food = food
        self.total = total

    greeting = "Welcome to Coffee Palace!"


c_1 = Customers("Nate", "Espresso", "Pastami on rye", 220)
c_2 = Customers("Elaine", "Strawberry frappuccino", "Tuna wrap", 270)
c_3 = Customers("Samirah", "Iced caffe latte", "Cinnamon roll", 225)
c_4 = Customers("Jerry", "Caramel macchiato", "Glazed doughnut", 230)
c_5 = Customers("Paz", "Iced tea", "Blueberry pancakes", 315)

print(f"{Customers.greeting}\n{'=' * 85}\n")
print(f"Name = {c_1.name} || Beverage = {c_1.beverage} || Food = {c_1.food} || Total = {c_1.total}")
print(f"Name = {c_2.name} || Beverage = {c_2.beverage} || Food = {c_2.food} || Total = {c_2.total}")
print(f"Name = {c_3.name} || Beverage = {c_3.beverage} || Food = {c_3.food} || Total = {c_3.total}")
print(f"Name = {c_4.name} || Beverage = {c_4.beverage} || Food = {c_4.food} || Total = {c_4.total}")
print(f"Name = {c_5.name} || Beverage = {c_5.beverage} || Food = {c_5.food} || Total = {c_5.total}")
