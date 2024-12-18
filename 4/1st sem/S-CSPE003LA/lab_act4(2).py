import time
from multiprocessing import Process, cpu_count

def square(num_list):
    return [num**2 for num in num_list]

def cube(num_list):
    return [num**3 for num in num_list]

def run_cores(num, num_list, func):
    start = time.time()
    cores = [Process(target=func, args=(num_list,)) for _ in range(num)]

    for core in cores:
        core.start()

    for core in cores:
        core.join()

    # print(cores)
    print(f"cores:\t\t{num}")
    print(f"duration:\t{time.time() - start} seconds")

if __name__ == "__main__":
    numbers = []
    core_count = [1, 2, 4, cpu_count()]

    print("Enter four 3-digit numbers:")
    count = 0
    while count < 4:
        number = int(input(f"#{count + 1}: "))
        if (number >= 100) and (number <= 999):
            numbers.append(number)
            count = count + 1
        else:
            print("Not a 3-digit number.")

    print("function: square")
    squared_list = square(numbers)
    print(squared_list)
    for i in core_count:
        run_cores(i, numbers, square)

    print("-" * 50)

    print("function: cube")
    cubed_list = cube(numbers)
    print(cubed_list)
    for i in core_count:
        run_cores(i, numbers, cube)
