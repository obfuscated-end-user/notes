# write a function that asks for your basic information and display it using
# different processes. display the number of cores you have in your computer.
from multiprocessing import Process, cpu_count
import time

def show_info(text, info):
    print(text, info)

if __name__ == "__main__":
    print(f"Number of cores: {cpu_count()}")

    name = input("What is your name?: ")
    cys = input("What is your course/year/section?: ")
    age = input("How old are you?: ")
    birthdate = input("When were you born?: ")
    print()

    p1 = Process(target=show_info, args=("Your name is:", name))
    p2 = Process(target=show_info, args=("You're from:", cys))
    p3 = Process(target=show_info, args=("Your age is:", age))
    p4 = Process(target=show_info, args=("Your date of birth is:", birthdate))

    p1.start()
    p2.start()
    p3.start()
    p4.start()

    p1.join()
    p2.join()
    p3.join()
    p4.join()

    print(f"\nfinished in: {time.perf_counter()} seconds")
