import numpy as np

dataset = np.array([78, 85, 88, 90, 92, 95, 100, 100, 105, 110, 120, 125, 150])

mu = np.mean(dataset)
sigma = np.std(dataset)

print(f"mean = {mu}\nstandard deviation = {sigma}\n")

for x in dataset:
    z = (x - mu) / sigma
    print(f"x = {x}, z-score = {z}" )
