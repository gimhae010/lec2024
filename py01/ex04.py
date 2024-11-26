#순서가 있는 list,tuple

arr1=[1,3,5,7,]
arr2=list()

arr2.append('item1')
arr2.append('item2')
arr2.append('item3')

arr1[2]=6
# arr1[4]=9
arr1.remove(3)
arr2.remove('item2')

print(type(arr1),arr1,len(arr1))
print(type(arr2),arr2,len(arr2))
print(arr1[2])
print('-'*50)
arr3=list(range(1,10))
print(type(arr3),arr3)
arr4=list(range(1,10,2))
print(type(arr4),arr4)
arr5=list(range(9,0,-2))
print(type(arr5),arr5)
print('-'*50)
print(type((2,3)))
arr6=(2,4,6,8)
print(type(arr6),arr6)
print(arr6[2])
arr7=(3,)
print(type(arr7),arr7)
arr8=tuple(arr1)
print(type(arr8),arr8,list(arr7))
arr9=list(range(1,10))
print(4 in arr9)
print(10 in arr9)
print(10 not in arr9)