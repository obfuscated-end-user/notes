"""
Write a function that first asks for 2 numbers and performs the 4 mathematical operations such as addition, subtraction, multiplication, and division. The output will display using 4 different processes Display the PID of each process and the number of cores in your computer.
"""

import os
import time
from multiprocessing import Process, cpu_count

def add(num1, num2):
    print(f"add, PID: {os.getpid()}")
    return num1 + num2

def sub(num1, num2):
    print(f"sub, PID: {os.getpid()}")
    return num1 - num2

def mul(num1, num2):
    print(f"mul, PID: {os.getpid()}")
    return num1 * num2

def div(num1, num2):
    assert num2 != 0
    print(f"div, PID: {os.getpid()}")
    return num1 / num2

if __name__ == "__main__":
    num1 = float(input("Enter the first number: "))
    num2 = float(input("Enter the second number: "))

    start = time.time()

    a = Process(target=add, args=(num1, num2))
    b = Process(target=sub, args=(num1, num2))
    c = Process(target=mul, args=(num1, num2))
    d = Process(target=div, args=(num1, num2))

    a.start()
    b.start()
    c.start()
    d.start()

    a.join()
    b.join()
    c.join()
    d.join()

    print(f"Number of cores: {cpu_count()}\ntime taken: {time.time() - start}")
