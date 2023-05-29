from itertools import combinations_with_replacement

string = input().split()
n = int(string[1])
ordenate_word = [i for i in string[0]]
ordenate_word = sorted(ordenate_word)
aux = list(combinations_with_replacement(ordenate_word, n))
print("\n".join("".join(i) for i in aux))
