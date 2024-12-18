import numpy as np
import matplotlib.pyplot as plt 
import matplotlib.animation as animation
from multiprocessing import Pool
import multiprocessing
ON = 255
OFF = 0
vals = [ON, OFF]

def addGosperGliderGun(i, j, grid):
    gun = np.zeros(11*38).reshape(11, 38)
    gun[5][1] = gun[5][2] = 255
    gun[6][1] = gun[6][2] = 255
    gun[3][13] = gun[3][14] = 255
    gun[4][12] = gun[4][16] = 255
    gun[5][11] = gun[5][17] = 255
    gun[6][11] = gun[6][15] = gun[6][17] = gun[6][18] = 255
    gun[7][11] = gun[7][17] = 255
    gun[8][12] = gun[8][16] = 255
    gun[9][13] = gun[9][14] = 255
    gun[1][25] = 255
    gun[2][23] = gun[2][25] = 255
    gun[3][21] = gun[3][22] = 255
    gun[4][21] = gun[4][22] = 255
    gun[5][21] = gun[5][22] = 255
    gun[6][23] = gun[6][25] = 255
    gun[7][25] = 255
    gun[3][35] = gun[3][36] = 255
    gun[4][35] = gun[4][36] = 255
    grid[i:i+11, j:j+38] = gun

def updateRow(args):
    i, grid, N = args
    newRow = grid[i].copy()
    for j in range(N):
        total = int((grid[(i-1)%N, (j-1)%N] + grid[(i-1)%N, j] +
                     grid[(i-1)%N, (j+1)%N] + grid[i, (j-1)%N] +
                     grid[i, (j+1)%N] + grid[(i+1)%N, (j-1)%N] +
                     grid[(i+1)%N, j] + grid[(i+1)%N, (j+1)%N])/255)
        if grid[i, j]  == ON:
            if (total < 2) or (total > 3): newRow[j] = OFF
        else:
            if total == 3: newRow[j] = ON
    return newRow

def update(frameNum, img, grid, N, pool):
    new_grid = np.zeros_like(grid)
    rows = [(i, grid, N) for i in range(N)]
    newRows = pool.map(updateRow, rows)
    for i, row in enumerate(newRows):
        new_grid[i] = row
    img.set_data(new_grid)
    grid[:] = new_grid[:]
    return img,

def main(): 
    N = 100
    updateInterval = 50
    grid = np.zeros(N*N).reshape(N, N)
    addGosperGliderGun(10, 10, grid)
    fig, ax = plt.subplots()
    img = ax.imshow(grid, interpolation='nearest')
    pool = Pool(processes=multiprocessing.cpu_count())
    ani = animation.FuncAnimation(fig, update, fargs=(img, grid, N, pool),
                                  frames = 10,
                                  interval=updateInterval,
                                  save_count=50)
    plt.show()
    pool.close()
    pool.join()

if __name__ == '__main__':
    main()
