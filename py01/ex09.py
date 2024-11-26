arr1=list(range(1,10,2))
print(arr1)
print(arr1[1])
print(arr1[len(arr1)-1])
print(arr1[1:4])
print(arr1[1:-1])
print(arr1[1:])
print(arr1[:4])
print(id(arr1[:]),id(arr1))
msg='abcdefghijklmn'

print(msg[0])
print(msg[1:5])
print(msg[5:])
for temp in msg:
    print(temp, end=',')

