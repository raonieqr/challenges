from itertools import combinations

string = input().split()
n = int(string[1])
ordenate_word = [i for i in string[0]]
ordenate_word = sorted(ordenate_word)
for i in range(1, n + 1):
    aux = list(combinations(ordenate_word, i))
    print("\n".join("".join(i) for i in aux))
