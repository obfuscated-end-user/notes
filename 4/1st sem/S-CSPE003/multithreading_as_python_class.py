import time
import threading

class Sleep(threading.Thread):
    def __init__(self, sleep_duration):
        self.sleep_duration = sleep_duration

    def sleep(self):
        time.sleep(self.sleep_duration)

if __name__ == "__main__":
    # Create thread
    sleep_class = Sleep(2)
    t1 = threading.Thread(target=sleep_class.sleep)
