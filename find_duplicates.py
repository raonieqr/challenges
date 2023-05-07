lst_of_integers = [
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
    [9, 3, 8, 9, 9, 7, 2, 1, 6, 8],
    [1, 3, 2, 2, 8, 6, 5, 9, 6, 7],
    [3, 8, 2, 8, 6, 7, 7, 3, 1, 9],
    [4, 8, 8, 8, 5, 1, 10, 3, 1, 7],
    [1, 3, 7, 2, 2, 1, 5, 1, 9, 9],
    [10, 2, 2, 1, 3, 5, 10, 5, 10, 1],
    [1, 6, 1, 5, 1, 1, 1, 4, 7, 3],
    [1, 3, 7, 1, 10, 5, 9, 2, 5, 7],
    [4, 7, 6, 5, 2, 9, 2, 1, 2, 1],
    [5, 3, 1, 8, 5, 7, 1, 8, 8, 7],
    [10, 9, 8, 7, 6, 5, 4, 3, 2, 1],
]

# lst_of_integers = [0, 1, 2, 3, 4, 5]
set_lst = lst_of_integers[0]

def len_above_one(lst_of_integers):
    i = 1
    j = 0
    count = 0
    while i < len(lst_of_integers):
        while j < len(lst_of_integers[i]):
            if lst_of_integers[i][j] in set_lst:
                count = 1
                return lst_of_integers[i][j]
            j += 1
        i += 1
    if count == 0:
        return -1

def len_below(lst_of_integers):
    match = set()
    for i in lst_of_integers:
        if i in match:
            return i
        match.add(i)
    return -1

def start_find(lst_of_integers):
    try:
       return len_above_one(lst_of_integers)
    except:
        return len_below(lst_of_integers)

print(start_find(lst_of_integers))
