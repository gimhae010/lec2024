if True: print('참')
if False: print('거짓')
print('-'*50)
if 5>3:
    pass
print('또')
print('-'*50)
su=0
if su>0:
    print('양수')
else:
    print('음수')
print('-'*50)
if su>0:
    print('양수')
elif su<-1000:
    print('많이 작은 음수')
elif su<0:
    print('음수')
else:
    print(0)
print('-'*50)
if su>0:
    if su>10:
        print('많이 큰',end='')
    print('양',end='')
elif su<0:
    if su<-10:
        print('많이 작은 음',end='')
    else :
        print('음',end='')
else:
    print('0인 ',end='')
print('수')
