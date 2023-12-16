from numpy import random
random.seed(0)

totals = {20:0, 30:0, 40:0, 50:0, 60:0, 70:0}
purchases = {20:0, 30:0, 40:0, 50:0, 60:0, 70:0}
total_purchases = 0

for _ in range(100000):
    age_decade = random.choice([20, 30, 40, 50, 60, 70])
    purchase_probability = float(age_decade) / 100.0
    totals[age_decade] += 1
    if (random.random() < purchase_probability):
        total_purchases += 1
        purchases[age_decade] += 1

print(f"totals\n\t{totals}\npurchases\n\t{purchases}\ntotal_purchases\n\t{total_purchases}")

# P(E|F) = percentage of 30 year olds that bought something, over all the 30 year olds
PEF = float(purchases[30]) / float(totals[30])
print(f"P(E|F), P(purchases|30 y/o's): {PEF}")

# P(F) = the probability of being 30 years old in this data set
PF = float(totals[30]) / 100000.0
print(f"P(F), P(30 y/o's): {PF}")

# P(E) = the probability of buying something, regardless of age
# just using purhcases[age] doesn't make any sense, because the above examples use the total version or whatever
PE = float(total_purchases) / 100000.0
print(f"P(E), P(purchases): {PE}")

# P(E, F) = the probability of both being in your 30's, and buying something, out of the total population
print(f"P(E, F), P(30 y/o's, purchases): {float(purchases[30]) / 100000.0}")

# P(E)P(F) (product of those two things above)
print(f"P(E)P(F), P(30 y/o's)P(purchases): {PE * PF}")

# P(E|F) = P(E, F) / P(F)
print(f"P(E|F) = P(E, F) / P(F), {purchases[30] / 100000.0 / PF}")