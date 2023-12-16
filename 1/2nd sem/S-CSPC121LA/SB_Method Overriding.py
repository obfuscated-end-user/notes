class FullTimeEmployee:
    def __init__(self, name, position, hours, salary):
        self.name = name
        self.position = position
        self.hours = hours
        self.salary = salary

    def bonus(self):
        return self.salary * 0.5

class PartTimeEmployee(FullTimeEmployee):
    def __init__(self, name, position, hours, salary):
        super().__init__(name, position, hours, salary)

    # method overriding
    def bonus(self):
        return self.salary * 0.1

# common interface
def inc_bonus(object):
    x = object.bonus()
    print(f"{object.name}'s bonus will be {x}")

# instantiating objects for the two classes
emp_1 = FullTimeEmployee("Juan Dela Cruz", "Frontend Developer", 6, 1000)
emp_2 = PartTimeEmployee("Maria Cruz", "Content Writer", 8, 2000)

# passing the objects to common interface
inc_bonus(emp_1)
inc_bonus(emp_2)
