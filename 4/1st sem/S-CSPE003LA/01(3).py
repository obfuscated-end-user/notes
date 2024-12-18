# -*- coding: utf-8 -*-
"""
Created on Tue Dec 10 13:30:20 2024

@author: student
"""

import threading

lock = threading.Lock()

def print_nums(id):
    lock.acquire()
    print(f"thread {id}")
    for i in range(1, 11):
        print(i)
    lock.release()

threads = []

for i in range(1, 5):
    thread = threading.Thread(target=print_nums, args=(i,))
    threads.append(thread)
    thread.start()

for thread in threads:
    thread.join()
