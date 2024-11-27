def func1():
    print('func run..')
    print('func run..')

def func2(a,b):
    return a+b
def func3(a,b):
    return a+b,a-b,a*b,a/b

# a,b,c,d=func3(5,2)
# print('su=',a,b,c,d)


def func4(*a):
    for su in range(len(a)):
        print(a[su])

func4(*[1,2,3,4,5,6])
# arr1=['item1','item2','item3']
# print(*arr1)


# def func5(a,*b):
#     print(a)
#     print(b,len(b))

# func5(1111,2222)


map1={'key1':'val1','key2':'val2'}
# print(*map1)


def func6(**a):
    print(a)

# func6(a=1111,b=2222)
# func6(**map1)

# print('item1',"item2",sep='',end='')















