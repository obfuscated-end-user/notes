"""
convert the following
1st: 102_10
2nd: 10110101_2
3rd: 573_8
4th: F4B_16
5th: 468_10
"""

def dec_to_bin(num):
    dividend = num
    quotient = 1
    remainder = 1
    binary = ""
    print("D\tQ\tR")
    while quotient != 0:
        quotient = dividend // 2
        remainder = dividend % 2
        answer = f"{dividend}\t{quotient}\t{remainder}"
        print(answer)
        dividend = quotient
        binary = binary + answer[-1]
    print("binary:", binary[::-1])

def dec_to_oct(num):
    dividend = num
    quotient = 1
    remainder = 1
    octal = ""
    print("D\tQ\tR")
    while quotient != 0:
        quotient = dividend // 8
        remainder = dividend % 8
        answer = f"{dividend}\t{quotient}\t{remainder}"
        print(answer)
        dividend = quotient
        octal = octal + answer[-1]
    print("octal:", octal[::-1])

def dec_to_hex(num):
    dividend = num
    quotient = 1
    remainder = 1
    hexadecimal = ""
    print("D\tQ\tR")
    while quotient != 0:
        quotient = dividend // 16
        # this looks fucking stupid but it works
        remainder = str(dividend % 16).replace("10", "A").replace("11", "B").replace("12", "C").replace("13", "D").replace("14", "E").replace("15", "F")
        answer = f"{dividend}\t{quotient}\t{remainder}"
        print(answer)
        dividend = quotient
        hexadecimal = hexadecimal + answer[-1]
    print("hexadecimal:", hexadecimal[::-1])


number = 468
dec_to_bin(number)
dec_to_oct(number)
dec_to_hex(number)
# dec_to_hex(10203)