def func1(a):
    print(a)
    return a

func2=func1
print(func2)
func2(1111)

def func3(f):
    f(3333)

func3(func1)

func4=lambda :print('run')
func5=lambda a:print('run',a)
func6=lambda a,b:print('run',a,b)

func4()
print('*'*50)
arr1=[0,2,4,6,8,10]
print(list(map(lambda ele:ele*2,arr1)))
print(list(filter(lambda ele:ele>5,arr1)))
print(any(arr1))
print(all(arr1))
from functools import reduce
print(reduce(lambda a,b:a+b,arr1))