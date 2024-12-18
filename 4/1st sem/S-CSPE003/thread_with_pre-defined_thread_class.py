from threading import *
class Demo:
    def display(self):
        for i in range(6):
            print("Child Thread")

obj = Demo()
t = Thread(target=obj.display)
t.start()

for i in range(6):
    print("Main Thread")
