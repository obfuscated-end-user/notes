# Create a python program that will spawn n processes defined by the user using a pool. These processes will display the name of the user. Display also the PID of each processes. Paste the code in a word file and explain the function of the codes. Paste also the sample output. (20 pts.)

import multiprocessing
import os

def func(name):
    id = os.getpid()
    print(f"your name: {name}, process id: {id}")

if __name__ == "__main__":
    name = input("what's your name?: ")
    num = int(input("how many times?: "))

    print()

    with multiprocessing.Pool(processes=num) as p:
        p.map(func, [name] * num)
