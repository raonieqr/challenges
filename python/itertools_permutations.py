from itertools import permutations

string = input().split()
n = int(string[1])
new_word = [i for i in string[0]]
ordenate_word = sorted(list(permutations(new_word, n)))
print("\n".join("".join(i) for i in ordenate_word))

