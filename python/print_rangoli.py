def top(column, lst, size):
        for i in range(1, size):
            temp = lst[size - i::]
            strs = '-'.join(temp[::-1]) + '-' + '-'.join(temp[1::])
            print(strs.center(column, '-'))

def bottom(column, lst, size):
    for i in range(1, size):
        temp = lst[i::]
        strs = '-'.join(temp[::-1]) + '-' + '-'.join(temp[1::])
        print(strs.center(column, '-'))
            
def mid(lst, size):
    if size > 1:
        print('-'.join(lst[::-1]) + '-' + '-'.join(lst[1::]))
    elif size == 1:
        print(lst[0]) 
        
def print_rangoli(size):
    lst = []
    row = size * 2 - 1
    column = row * 2 - 1
    
    for i in range(0, size):
        lst.append(chr(97 + i))
    
    top(column, lst, size)
    mid(lst, size)
    bottom(column, lst, size)
    
if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
