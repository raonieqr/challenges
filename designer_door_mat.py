n,m = map(int, input().split(' '))
def top(n, m):
    for i in range(1, (n // 2 + 1)):
        pipx = ".|." * i
        pipx = pipx.rjust(m // 2 + len(pipx) // i - 1, '-')
        pipx += ".|." * (i - 1)
        pipx = pipx.ljust(m, '-')
        print(pipx)
    
def mid(m):
    print("WELCOME".center(m, '-'))
    
def bottom(n, m):
    lst = []
    for i in range(1, (n // 2 + 1)):
        pipx = ".|." * i
        pipx = pipx.rjust(m // 2 + len(pipx) // i - 1, '-')
        pipx += ".|." * (i - 1)
        pipx = pipx.ljust(m, '-')
        lst.append(pipx)
    [print(line) for line in lst[::-1]]

top(n, m)
mid(m)
bottom(n, m)
