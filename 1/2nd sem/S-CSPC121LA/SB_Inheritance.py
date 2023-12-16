class ClubMembers:
    def __init__(self, name, bday, age, fav_food, goal):
        self.name = name
        self.bday = bday
        self.age = age
        self.fav_food = fav_food
        self.goal = goal

    def display_properties(self):
        print(f"Name: {self.name}"
              f"\nBirthday: {self.bday}"
              f"\nAge: {self.age}"
              f"\nFavorite Food: {self.fav_food}"
              f"\nGoal: {self.goal}\n")


class ClubOfficers(ClubMembers):
    def __init__(self, name, bday, age, fav_food, goal, pos):
        super().__init__(name, bday, age, fav_food, goal)
        self.pos = pos

    def display_properties(self):
        print(f"Name: {self.name}"
              f"\nBirthday: {self.bday}"
              f"\nAge: {self.age}"
              f"\nFavorite Food: {self.fav_food}"
              f"\nGoal: {self.goal}"
              f"\nPosition: {self.pos}")


m_1 = ClubMembers("Tom", "January 16", 14, "Ice cream", "To be happy")
m_1.display_properties()

o_4 = ClubOfficers("Vera", "June 22", 16, "Beef stroganoff", "To be the world's greatest chef", "Treasurer")
o_4.display_properties()
