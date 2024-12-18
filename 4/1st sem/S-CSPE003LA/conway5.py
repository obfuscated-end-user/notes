import numpy as np
import matplotlib.pyplot as plt
import matplotlib.animation as animation

ON = 255
OFF = 0
vals = [ON, OFF]

def addGlider(i, j, grid):
    """adds a glider with top left cell at (i, j)"""
    glider = np.array([[0,   0, 255],
                       [255, 0, 255],
                       [0, 255, 255]])
    grid[i:i+3, j:j+3] = glider

def update(frameNum, img, grid, N, generation_count, ax):
    # copy grid since we require 8 neighbors for calculation
    # and we go line by line
    newGrid = grid.copy()
    for i in range(N):
        for j in range(N):
            # compute 8-neighbor sum
            # using toroidal boundary conditions - x and y wrap around
            # so that the simulation takes place on a toroidal surface.
            total = int((grid[i, (j-1)%N] + grid[i, (j+1)%N] +
                          grid[(i-1)%N, j] + grid[(i+1)%N, j] +
                          grid[(i-1)%N, (j-1)%N] + grid[(i-1)%N, (j+1)%N] +
                          grid[(i+1)%N, (j-1)%N] + grid[(i+1)%N, (j+1)%N]) / 255)
            # apply Conway's rules
            if grid[i, j] == ON:
                if (total < 2) or (total > 3):
                    newGrid[i, j] = OFF
            else:
                if total == 3:
                    newGrid[i, j] = ON
    # update data
    img.set_data(newGrid)
    grid[:] = newGrid[:]
    
    # update generation count
    generation_count[0] += 1
    ax.set_title(f"generation {generation_count[0]}")
    
    return img,

def main():
    N = 50
    grid = np.zeros(N*N).reshape(N, N)
    addGlider(1, 1, grid)

    fig, ax = plt.subplots(figsize=(6, 6))
    img = ax.imshow(grid, interpolation='nearest', cmap='binary', extent=[0, N, 0, N])
    
    generation_count = [0]
    ax.set_title(f"Generation: {generation_count[0]}")

    ani = animation.FuncAnimation(fig, update, fargs=(img, grid, N, generation_count, ax),
                                  frames=20, interval=200, save_count=50)
    
    plt.show()

if __name__ == '__main__':
    main()
    
# python conway.py --grid-size 100 --interval 500 --glide
