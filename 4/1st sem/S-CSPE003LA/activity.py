import time
import multiprocessing

def deposit(balance, lock):
    lock.acquire()
    for i in range(100):
        time.sleep(0.01)
        balance.value = balance.value + 1
    lock.release()

def withdraw(balance, lock):
    lock.acquire()
    for i in range(100):
        time.sleep(0.01)
        balance.value = balance.value - 1
    lock.release()

def run():
    balance = multiprocessing.Value("i", 200)
    lock = multiprocessing.Lock()

    d = multiprocessing.Process(target=deposit, args=(balance, lock))
    w = multiprocessing.Process(target=withdraw, args=(balance, lock))

    d.start()
    w.start()

    d.join()
    w.join()

    print(balance.value)

if __name__ == "__main__":
    run()
    run()
    run()
    run()
    run()
