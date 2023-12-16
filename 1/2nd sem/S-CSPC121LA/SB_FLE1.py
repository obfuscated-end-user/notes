class Email:
    company = "google"

    def __init__(self, fname, lname):
        self.fname = fname
        self.lname = lname

    def show_email(self):
        return f"{self.fname + self.lname}@{self.company}.com"


names = []
print("Welcome to Email Generator App!".center(60), f"\n{'=' * 60}\n")
add_name = input("Add name? ").lower().strip()

while add_name == "yes":
    first_name = input("Enter your first name: ").lower().replace(" ", "")
    last_name = input("Enter your last name: ").lower().replace(" ", "")
    names.append(Email(first_name, last_name))
    add_name = input("Add name? ").lower().strip()

print("\nGenerated Email")
if not names:
    print("none")
else:
    for name in names:
        print(f"{names.index(name) + 1}. {name.show_email()}")
