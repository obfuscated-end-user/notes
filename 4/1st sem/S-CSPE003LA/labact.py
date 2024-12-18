from mpi4py import MPI

comm = MPI.COMM_WORLD
rank = comm.Get_rank()
size = comm.Get_size()
print("hello world from process", str(rank), "of", str(size))

# COMMENT OUT A SECTION TO PREVENT INTERFERENCE WITH OTHER PARTS OF THE CODE

