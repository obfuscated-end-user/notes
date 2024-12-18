from threading import *

def display():
    for i in range(6):
        print("Child Thread")

t = Thread(target=display)
t.start()

for i in range(6):
    print("Main Thread")
