class Car:
    color = "default color"
    model = "default model"
    manufacturer = "company"


first_car = Car()
first_car.color = "red"
first_car.model = "Honda Civic"
first_car.manufacturer = "Honda"

second_car = Car()
second_car.color = "white"
second_car.model = "Mitsubishi Outlander"
second_car.manufacturer = "Mitsubishi"

third_car = Car()
third_car.color = "orange"
third_car.model = "Ford Ranger"
third_car.manufacturer = "Ford"

print(f"""
First car:
The color of the first car is {first_car.color}.
The model of the first car is a {first_car.model}.
The car was manufactured by {first_car.manufacturer}.

Second car:
The color of the second car is {second_car.color}.
The model of the second car is a {second_car.model}.
The car was manufactured by {second_car.manufacturer}.

Third car:
The color of the third car is {third_car.color}.
The model of the third car is a {third_car.model}.
The car was manufactured by {third_car.manufacturer}.""")
