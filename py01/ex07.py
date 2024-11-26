for su in range(0,5):
    print('run...',su)

arr1=[1,3,5,7,9]

for su in arr1:
    if su==7 : break
    print(su)

print('-'*50)
su=1
while(su<10):
    print('while',su)
    su=su+1

print('-'*50)
su=1
while True:
    if su>10 : break
    print('loop',su)
    su+=1
