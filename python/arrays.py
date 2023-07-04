import numpy

def arrays(arr):
  array = numpy.array(arr[::-1], float)
  return array

arr = input().strip().split(' ')
result = arrays(arr)
print(result)
