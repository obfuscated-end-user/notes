import os
import threading
import time

def task_sleep(sleep_duration, task_number, lock):
    lock.acquire()
    # Perform operation that require a common data/resource
    lock.release()

    time.sleep(sleep_duration)
    print(f"Task {task_number} doone (slept for {sleep_duration}s)! "
          f"Main thread: {threading.main_thread().name}, "
          f"Current thread: {threading.current_thread().name}, "
          f"Process ID: {os.getpid()}")
    
if __name__ == "__main__":
    time_start = time.time()

    # Create lock (optional)
    thread_lock = threading.Lock()

    # Create thread
    t1 = threading.Thread(target=task_sleep, args=(2, 1, thread_lock))
    t2 = threading.Thread(target=task_sleep, args=(2, 1, thread_lock))

    # Start task execution
    t1.start()
    t2.start()

    # Wait for thread to complete execution
    t1.join()
    t2.join()

    time_end = time.time()
    print(f"Time elapsed: {round(time_end - time_start, 2)}s")
