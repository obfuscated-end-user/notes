from multiprocessing import Process

def foo():
    print('hello')

p1 = Process(target=foo)
p2 = Process(target=foo)
p3 = Process(target=foo)

p1.start()
p2.start()
p3.start()
