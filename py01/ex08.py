arr1=[1,3,5,7]
arr2=list(range(2,10))
arr3=['item'+str(su) for su in range(1,6)]
print(type(arr3),arr3)
arr4=[str(su1)+'item'+str(su2) for su1 in range(1,4) for su2 in range(1,4)]
print(type(arr4),arr4)

arr5={su for su in ['i1','i2','i3','i4']}
print(type(arr5),arr5)
map1={key:val for key,val in [('i1','v1'),('i2','v2')]}
print(type(map1),map1)

print('-'*50)
kor, eng=50,60
print(kor,eng)