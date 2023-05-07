lista_de_listas_de_inteiros = [
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

# lista_de_listas_de_inteiros = [0, 1, 2, 2, 3, 4, 5]
set_lst = lista_de_listas_de_inteiros[0]

def len_above_one(lista_de_listas_de_inteiros):
    i = 1
    j = 0
    count = 0
    while i < len(lista_de_listas_de_inteiros):
        while j < len(lista_de_listas_de_inteiros[i]):
            if lista_de_listas_de_inteiros[i][j] in set_lst:
                print(lista_de_listas_de_inteiros[i][j])
                count = 1
                break
            j += 1
        if count == 1:
            break
        i += 1
    if count == 0:
        print(-1)

# def len_below(lista_de_listas_de_inteiros):
#     count = 0
#     i = 1
#     j = 0
#     while i < len(lista_de_listas_de_inteiros):
#         while j < len(lista_de_listas_de_inteiros):
#             if lista_de_listas_de_inteiros[i] == lista_de_listas_de_inteiros[j]:
#                 count += 1
#                 if count == 1:
#                     print(lista_de_listas_de_inteiros[i])
#             j += 1
#         if count == 2:
#             break
#         i += 1
#     if count < 2:
#         print(-1)

def start_find(lista_de_listas_de_inteiros):
    try:
        len_above_one(lista_de_listas_de_inteiros)
    except:
        len_below(lista_de_listas_de_inteiros)

start_find(lista_de_listas_de_inteiros)
