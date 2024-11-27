map1={'key1':'val1','key2':'val2'}
map1.setdefault('key3','value3')
map1.update(key4='value4')
print(map1)

map1.setdefault('key1','value1')
map1.update(key2='value2')
print(map1)
map1['key5']='val5'
map1['key1']='value1'
# print(map1)

# for obj in map1.items():
#     print(obj)

for key,val in map1.items():
    print(key,val)
print('-'*50)

arr2=['key1','key2','key3']
arr3=['val1','val2','val3']

map2={key:val for key,val in dict.fromkeys(arr2).items()}
print(map2)
print('-'*50)
map3={key:arr3[idx] for idx,key in enumerate(arr2)}
print(map3)
print('-'*50)
print(list(zip(arr2,arr3)))
map4={key:val for key,val in list(zip(arr2,arr3))}
print(map4)
print('-'*50)
map5={'key1':{'k1':'v1'},'key2':{'k2':'v2'}}
# map6=map5.copy()
# map6['key1']=map5['key1'].copy()
# map6['key2']=map5['key2'].copy()

# map6={ key:val.copy() for key,val in map5.items()}

import copy
map6=copy.deepcopy(map5)

map6['key1']['k1']='val1'
print(map5)
print(map6)
print('-'*50)
arr1=[1,2,3,2,1]
print(list(set(arr1)))
























