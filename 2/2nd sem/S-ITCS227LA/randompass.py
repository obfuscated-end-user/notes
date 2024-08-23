import random
import string

def random_str(length):
    chars = string.ascii_letters + string.digits
    return "".join(random.choice(chars) for _ in range(length))

i = 0
while i < 40:
    print(random_str(10))
    i += 1