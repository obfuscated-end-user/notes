from mpi4py import MPI

comm = MPI.COMM_WORLD
rank = comm.Get_rank()
size = comm.Get_size()

if rank == 0:
    message = "Hello World!"
    comm.send(message, dest=1)
    print("Process 0 sent message:", message)
elif rank == 1:
    message = comm.recv(source=0)
    print("Process 1 received message:", message)
