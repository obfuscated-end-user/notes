def knapsack(W, wt, val, n):
    K = [[0] * (W + 1) for _ in range (n + 1)]
    for i in range(n + 1):
        for w in range (W + 1):
            if (i == 0 or w == 0):
                K[i][w] = 0
            elif (wt[i - 1] <= w):
                K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w])
            else:
                K[i][w] = K[i - 1][w]

    print()
    for i in K:
        for c in i:
            print(c, end=" ")
        print()

    # determine what are the weights that produced the best profit
    w = W
    res = K[n][W]
    best_wts = []
    for i in range(n, 0, -1):
        if res <= 0:
            break
        if res == K[i - 1][w]:
            continue
        else:
            best_wts.append(wt[i - 1])
            res = res - val[i - 1]
            w = w - wt[i - 1]

    best_wts_str = []
    for wt_ in best_wts:
        best_wts_str.append(f"Item #{wt.index(wt_) + 1} wt: ({wt_}) val: {val[wt.index(wt_)]}")
    
    print()
    for line in best_wts_str[::-1]:
        print(line)

    return K[n][W]

""" val = [1, 4, 5, 7]
wt = [1, 3, 4, 5]
W = 7
ln = len(val)
profit = knapsack(W, wt, val, ln)
print("val = {val}\nwt = {wt}\nW = {W}")
print(f"Maximum profit achieved with this knapsack: {profit}") """


val = [20, 8, 10, 25]
wt = [3, 4, 5, 6]
W = 8
ln = len(val)
print(f"1.\nval = {val}\nwt = {wt}\nW = {W}")
profit = knapsack(W, wt, val, ln)
print(f"Maximum profit achieved with this knapsack: {profit}\n")

val = [30, 70, 50, 60]
wt = [1, 2, 3, 5]
W = 5
ln = len(val)
print(f"2.\nval = {val}\nwt = {wt}\nW = {W}")
profit = knapsack(W, wt, val, ln)
print(f"Maximum profit achieved with this knapsack: {profit}\n")

"""
1. Using the provided code, run the following inputs.

W = { 3, 4, 5, 6 }   V = { 20, 8, 10, 25 }      max W = 8
W = { 1, 2, 3, 5 }   V = { 30, 70, 50, 60 }    max W = 5
2. Update the program to output the items with maximum value to be placed in the knapsack . 

Note: Submit/upload  the .py file and a pdf file containing the screenshots of the outputs.
"""