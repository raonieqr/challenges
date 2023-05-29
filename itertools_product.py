from itertools import product
A =  input().split()
B = input().split()
A = list(map(int, A))
B = list(map(int, B))

AxB = A,B
print(*list(product(*AxB)))

