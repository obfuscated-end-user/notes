from mpi4py import MPI

comm = MPI.COMM_WORLD
rank = comm.Get_rank()

if rank == 0:
    message = "Hello World!"
else:
    message = None

message = comm.bcast(message, root=0)
print(f"Process {rank} received message: {message}")
