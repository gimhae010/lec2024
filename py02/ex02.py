import copy
arr1=[]
arr1.append('item1')
arr1.append('item2')
arr1.append('item3')
arr1.append('item4')

arr1.extend(['item6','item7'])

arr1.insert(4,'item5')

print(arr1)
print(arr1.pop())
print(arr1)
print(arr1.pop(0))
print(arr1)
if arr1.count('item3'):
    print(arr1.remove('item3'))
# print(arr1.remove(3))
print(arr1)
print(arr1.index('item4'))
arr1.sort(reverse=True)
print(id(arr1))
arr1[4:]=['item8']
print(id(arr1.copy()))
print(arr1)
print('-'*50)
# cnt=0
# for item in arr1:
#     print(item,cnt)
#     cnt+=1
# for idx,item in enumerate(arr1):
#     print(idx,item)
for obj in enumerate(arr1, start=1000):
    print(obj)

print('-'*50)
arr2=arr1.copy()
print(arr1,arr2)
arr2[0]='item1'
print(arr1,arr2)
print('-'*50)
arr3=[arr1,arr2]
# arr4=arr3.copy()
# arr4=[arr1.copy(),arr2.copy()]
arr4=copy.deepcopy(arr3)
arr4[0][0]='item0'
print(arr3,arr4,sep='\n')