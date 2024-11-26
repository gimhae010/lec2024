set1={2,5,7,3}
set2=set(['item5','item6'])
set2.add('item1')
set2.add('item2')
set2.add('item3')
set2.add('item4')

set2.remove('item3')

arr1=list(set2)

print(type(set1),set1)
print(type(set2),set2)
print(type(arr1),arr1)
print('-'*40)
map1={'key1':'val1','key2':'val2'}
map2=dict()
map2['key1']='val1'
map2['key2']='val2'
map2['key1']='value1'
map2.pop('key1')
print(type(map1),map1)
print(type(map2),map2)