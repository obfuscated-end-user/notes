my_list = [10, 2, 3, 4, 5]


def introduction(first_name="REDACTED", middle_initial="REDACTED", last_name="REDACTED"):
    print(f"Prepared by: {first_name} {middle_initial} {last_name}\n")


def display_list():
    print(f"List items are: {my_list}\n")


def update_list(list):
    list[0], list[-1] = 100, 0
    print(f"Updated list: {list}\n")


def set_values(list):
    list_sum, list_len, list_min, list_max = sum(list), len(list), min(list), max(list)
    print(f"The sum is: {list_sum}\n" +
          f"The length is: {list_len}\n" +
          f"The smallest number is: {list_min}\n" +
          f"The biggest number is: {list_max}")
    return list_sum, list_len, list_min, list_max


introduction()
display_list()
update_list(my_list)
set_values(my_list)
