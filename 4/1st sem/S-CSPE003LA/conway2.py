import numpy as np
import matplotlib.pyplot as plt
import matplotlib.animation as animation

def update_grid(grid):
    """Update the grid for the next generation."""
    new_grid = grid.copy()
    for i in range(grid.shape[0]):
        for j in range(grid.shape[1]):
            # Count the number of live neighbors
            total = int((grid[i, (j-1)%grid.shape[1]] + grid[i, (j+1)%grid.shape[1]] +
                          grid[(i-1)%grid.shape[0], j] + grid[(i+1)%grid.shape[0], j] +
                          grid[(i-1)%grid.shape[0], (j-1)%grid.shape[1]] + grid[(i-1)%grid.shape[0], (j+1)%grid.shape[1]] +
                          grid[(i+1)%grid.shape[0], (j-1)%grid.shape[1]] + grid[(i+1)%grid.shape[0], (j+1)%grid.shape[1]]))
            
            # Apply Conway's rules
            if grid[i, j] == 1:
                if total < 2 or total > 3:
                    new_grid[i, j] = 0  # Cell dies
            else:
                if total == 3:
                    new_grid[i, j] = 1  # Cell becomes alive
    return new_grid

def animate(i):
    """Animation function to update the grid."""
    global grid
    grid = update_grid(grid)
    mat.set_data(grid)
    return [mat]

# Initialize the grid with a simple pattern (e.g., a glider)
grid_size = (20, 20)
grid = np.zeros(grid_size)
grid[1, 2] = 1
grid[2, 3] = 1
grid[3, 1] = 1
grid[3, 2] = 1
grid[3, 3] = 1

# Set up the figure and axis
fig, ax = plt.subplots()
mat = ax.matshow(grid, cmap='binary')
plt.axis('off')

# Create an animation
ani = animation.FuncAnimation(fig, animate, frames=20, interval=500, blit=True)

# Show the animation
plt.show()
