"""
Write a python program for the Activity Selection problem using Greedy algorithm and run the program using the following activities with start time and end time.

Follow the given steps to solve the problem:
1. Sort the activities according to their finishing time
2. Select the first activity from the sorted array and print it
3. Do the following for the remaining activities in the sorted array
    a. If the start time of this activity is greater than or equal to the finish time of the previously selected activity then select this activity and print it

Output the optimal solution, print the sequence of activities to be attended with start time and end time.
Submit/upload the screenshot of the python program and the program output and the python program in .py.
"""

def activity_selection(start, end):
    print(f"UNSORTED:\nSTART:\t{start}\nEND:\t{end}\n")
    # Sort the activities according to their finishing time.
    end, start = (list(x) for x in zip(*sorted(zip(end, start))))
    print(f"SORTED:\nSTART:\t{start}\nEND:\t{end}\n")

    n = len(end)
    i = 0
    # Select the first activity from the sorted array and print it.
    print(f"A{i + 1}\tSTART = {start[i]}\tEND = {end[i]}")

    output_str = ""
    for j in range(n):
        # If the start time of this activity is greater than or equal to the finish time of the previously selected activity then select this activity and print it.
        if start[j] >= end[i]:
            output_str += f"A{j + 1}\tSTART = {start[j]}\tEND = {end[j]}\n"
            i = j
    print(output_str.strip())


#          1  2  3   4  5   6   7   8
start   = [1, 2, 7,  5, 10, 16, 21, 23]
end     = [4, 9, 15, 8, 18, 17, 27, 30]

activity_selection(start, end)
