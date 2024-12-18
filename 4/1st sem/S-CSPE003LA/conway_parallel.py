import numpy as np
import matplotlib.pyplot as plt
import matplotlib.animation as animation
import threading

ON, OFF, vals = 255, 0, [255, 0]

def addGosperGliderGun(i, j, grid):
    gun = np.zeros((11, 38))
    gun[5][1:3] = gun[6][1:3] = 255
    gun[3][13:15] = gun[4][12:17:4] = 255
    gun[5][11:18:6] = gun[6][11:19:4] = 255
    gun[7][11] = gun[7][17] = 255
    gun[8][12:17:4] = gun[9][13:15] = 255
    gun[1][25] = gun[2][23:26] = 255
    gun[3][21:23] = gun[4][21:23] = 255
    gun[5][21:23] = gun[6][23:26] = 255
    gun[7][25] = gun[3][35:37] = 255
    grid[i:i+11, j:j+38] = gun

def update_chunk(start_row, end_row, grid, newGrid):
    for i in range(start_row, end_row):
        for j in range(grid.shape[1]):
            total = sum(grid[(i + di) % grid.shape[0], (j + dj) % grid.shape[1]] == ON for di in [-1, 0, 1] for dj in [-1, 0, 1]) - (grid[i, j] == ON)
            newGrid[i, j] = ON if total == 3 else OFF if total < 2 or total > 3 else grid[i, j]

def update(frameNum, img, grid, N, lock):
    newGrid = grid.copy()
    threads = []
    num_threads = 4
    rows_per_thread = N // num_threads

    for t in range(num_threads):
        start_row = t * rows_per_thread
        end_row = (t + 1) * rows_per_thread if t < num_threads - 1 else N
        thread = threading.Thread(target=update_chunk, args=(start_row, end_row, grid, newGrid))
        threads.append(thread)
        thread.start()

    for thread in threads:
        thread.join()

    with lock:
        img.set_data(newGrid)
        grid[:] = newGrid[:]
    return img,

def main():
    N, updateInterval = 100, 100
    grid = np.zeros((N, N))
    addGosperGliderGun(10, 10, grid)
    fig, ax = plt.subplots()
    img = ax.imshow(grid, interpolation='nearest')
    lock = threading.Lock()
    ani = animation.FuncAnimation(fig, update, fargs=(img, grid, N, lock), frames=200, interval=updateInterval, save_count=50)
    plt.show()

if __name__ == '__main__':
    main()
