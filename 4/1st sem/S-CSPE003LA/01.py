import threading

lock = threading.Lock()

def print_numbers(thread_id):
    lock.acquire()
    print(f"thread {thread_id}")
    for i in range(1, 11):
        print(i)
    lock.release()

threads = []

for i in range(1, 5):
    thread = threading.Thread(target=print_numbers, args=(i,))
    threads.append(thread)
    thread.start()

for thread in threads:
    thread.join()
