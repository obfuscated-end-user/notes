# install this module first
# pip install colorama
from colorama import Fore, Style

def merge_sort(A):
    n = len(A)
    if n > 1:
        mid = n // 2
        B, C= A[:mid], A[mid:]

        print(f"\t{Fore.GREEN+Style.BRIGHT}SPLIT{Style.RESET_ALL}")
        print(f"\t\t{Fore.RED+Style.BRIGHT}INPUT: {A}\n\t\t\t{Fore.BLUE+Style.BRIGHT}-> L: {B}{Style.RESET_ALL}\n\t\t\t{Fore.MAGENTA+Style.BRIGHT}-> R: {C}{Style.RESET_ALL}")

        merge_sort(B)
        merge_sort(C)

        i, j, k = 0, 0, 0
        p, q = len(B), len(C)
        while i < p and j < q:
            if B[i] <= C[j]:
                A[k] = B[i]
                i += 1
            else:
                A[k] = C[j]
                j += 1
            k += 1

        while i < p:
            A[k] = B[i]
            i, k = i + 1, k + 1

        while j < q:
            A[k] = C[j]
            j, k = j + 1, k + 1

        print(f"\t{Fore.YELLOW+Style.BRIGHT}COMBINE{Style.RESET_ALL}")
        print(f"\t\t{Fore.BLUE+Style.BRIGHT}L: {B}{Style.RESET_ALL}, {Fore.MAGENTA+Style.BRIGHT}R: {C}{Style.RESET_ALL}\n\t\t\t{Fore.CYAN+Style.BRIGHT}-> COMBINED: {A}{Style.RESET_ALL}")

array = [8, 3, 2, 9, 7, 1, 5, 4]
print(f"{Fore.GREEN+Style.BRIGHT}ARRAY: {array}{Style.RESET_ALL}\n")
merge_sort(array)
print(f"\n{Fore.RED+Style.BRIGHT}ARRAY, SORTED: {array}{Style.RESET_ALL}")
