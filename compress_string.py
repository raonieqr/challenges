from itertools import groupby
groups = []
numbers = input()
for k, g in groupby(numbers):
    groups.append((len(list(g)), int(k)))
print(*groups)

