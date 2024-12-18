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
data += 1
print("rank", rank, "has data:", data)

newData = comm.gather(data, root=0)

if rank == 0:
    print("master", newData)
