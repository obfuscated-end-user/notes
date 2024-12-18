import numpy as np
import matplotlib.pyplot as plt
import matplotlib.animation as animation

ON = 255
OFF = 0
vals = [ON, OFF]

def randomGrid(N):
    return np.random.choice(vals, N*N, p=[0.2, 0.8]).reshape(N, N)

def addGlider(i, j, grid):
    glider = np.array([[0,   0, 255],
                       [255, 0, 255],
                       [0, 255, 255]])
    grid[i:i+3, j:j+3] = glider

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

def update(frameNum, img, grid, N):
    newGrid = grid.copy()
    for i in range(N):
        for j in range(N):
            total = int((grid[i, (j-1)%N] + grid[i, (j+1)%N] +
                          grid[(i-1)%N, j] + grid[(i+1)%N, j] +
                          grid[(i-1)%N, (j-1)%N] + grid[(i-1)%N, (j+1)%N] +
                          grid[(i+1)%N, (j-1)%N] + grid[(i+1)%N, (j+1)%N]) / 255)
            if grid[i, j] == ON:
                if (total < 2) or (total > 3):
                    newGrid[i, j] = OFF
            else:
                if total == 3:
                    newGrid[i, j] = ON
    img.set_data(newGrid)
    grid[:] = newGrid[:]
    return img,

def main():
    # Hardcoded parameters
    N = 100  # Grid size
    updateInterval = 50  # Update interval in milliseconds
    initial_pattern = 'gosper'  # Options: 'random', 'glider', 'gosper'

    # Initialize the grid
    grid = np.zeros(N*N).reshape(N, N)
    if initial_pattern == 'glider':
        addGlider(1, 1, grid)
    elif initial_pattern == 'gosper':
        addGosperGliderGun(10, 10, grid)
    else:
        grid = randomGrid(N)

    # Set up the figure and animation
    fig, ax = plt.subplots()
    img = ax.imshow(grid, interpolation='nearest')
    ani = animation.FuncAnimation(fig, update, fargs=(img, grid, N), frames=10, interval=updateInterval, save_count=50)

    # Show the animation
    plt.show()

if __name__ == '__main__':
    main()
