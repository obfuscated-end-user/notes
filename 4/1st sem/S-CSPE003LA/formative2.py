# get the running time of a code counting 1-1B using core, 2 cores, 4 cores, up
# to your maximum no. of cores.

from multiprocessing import Process, cpu_count
import time

def counter(num):
    count = 0
    while count < num:
        count += 1

def x_cores(num):
    core_list = []
    for i in range(num):
        # "1B" is 1 billion
        core_list.append(Process(target=counter, args=(1_000_000_000,)))

    return core_list

def run_cores(num):
    cores = x_cores(num)

    for core in cores:
        core.start()

    for core in cores:
        core.join()

    print(f"number of cores: {num}, finished in: {time.perf_counter()} seconds")

def main():
    run_cores(1)
    run_cores(2)
    run_cores(4)
    run_cores(cpu_count()) # 20

if __name__ == "__main__":
    main()
