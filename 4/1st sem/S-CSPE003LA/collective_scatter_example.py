from mpi4py import MPI

comm = MPI.COMM_WORLD
rank = comm.Get_rank()
size = comm.Get_size()

if rank == 0:
    data = [(x + 1)**x for x in range(size)]
    print("we will be scattering:", data)
else:
    data = None

data = comm.scatter(data, root=0)
print("rank", rank, "has data:", data)
