from mpi4py import MPI

comm = MPI.COMM_WORLD
rank = comm.Get_rank()
size = comm.Get_size()

# each rank gets a number
val = rank * 10
print("Rank %d/%d has value %d" %(rank, size, val))

# rank zero get the sum
sum = comm.reduce(val, op=MPI.SUM, root=0)
if rank == 0:
    print("Rank 0 got the sum, the total is %d" %sum)
