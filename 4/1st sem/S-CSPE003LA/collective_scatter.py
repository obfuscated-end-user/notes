from mpi4py import MPI

comm = MPI.COMM_WORLD
rank = comm.Get_rank()
size = comm.Get_size()
if rank == 0:
    data = list("Hello world")
    print(f"List to scatter: {data}")
else:
    data = None

data = comm.scatter(data, root=0)
print(f"Rank {rank}: {data}")
