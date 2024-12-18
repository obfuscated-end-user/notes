# create multiple process that will display your basic information.
# (ex. name, course/year/section, age, birthdate, etc.)
from multiprocessing import Process, cpu_count

def f(text):
    print(text)

def main():
    p1 = Process(target=f, args=("My name is Phineas Gage",))
    p2 = Process(target=f, args=("I stuck a spike through my head",))
    p3 = Process(target=f, args=("I'm 201 years old",))
    p4 = Process(target=f, args=("I was born on July 9, 1823",))

    p1.start()
    p2.start()
    p3.start()
    p4.start()

if __name__ == "__main__":
    main()
