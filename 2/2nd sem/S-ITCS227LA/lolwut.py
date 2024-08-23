from random import randint

again = "y"
while again == "y" or again == "Y":
    prelim = randint(50, 100)
    midterm = randint(50, 100)
    final = randint(50, 100)
    average = (prelim + midterm + final) // 3
    remark = "PASSED" if average >= 60 else "FAILED"
    
    print(f"prelim: {prelim}\nmidterm: {midterm}\nfinal: {final}\naverage: {average}\nremark: {remark}")
    again = input("Do again?: ")