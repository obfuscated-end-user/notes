class Manager:
    def __init__(self, name, department, post="Manager"):
        self.name = name
        self.department = department
        self.post = post

    def post_detail(self):
        self.basic_salary = 30000
        self.house_rent = 10000
        self.transport = 5000

        # non-hr basic salary
        if self.department != "hr":
            self.basic_salary = 25000

        return f"The post of {self.name} is {self.post}"

    def salary(self):
        salary = self.basic_salary + self.house_rent + self.transport
        return salary


class Clerk:
    def __init__(self, name, post="Clerk"):
        self.name = name
        self.post = post

    def post_detail(self):
        self.basic_salary = 10000
        self.transport = 2000
        return f"The post of {self.name} is {self.post}"

    def salary(self):
        salary = self.basic_salary + self.transport
        return salary


mr = Manager("Juan", "hr")
mr1 = Manager("Maria", "Accounting")
ck = Clerk("Pedro")

for obj in [mr, mr1, ck]:
    print(obj.post_detail())
    print(f"The salary is {obj.salary()}\n")
