from threading import *

class MyThread(Thread):
    def run(self):
        for i in range(6):
            print("Child Thread")

t = MyThread()
t.start()

for i in range(6):
    print("Main Thread")
