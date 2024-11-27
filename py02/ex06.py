# f=open("ex11.py",'r',encoding='utf-8')
# msg=f.read()
# arr1=msg.split('\n')

# print(arr1[0])
# print(arr1[1])
# print(arr1[2])
# msg=f.readline()
# print(msg,end='')
# msg=f.readline()
# print(msg,end='')
# arr2=f.readlines()
# for line in arr2:
#     print(line,end='')

# for line in f.readlines():print(line)

# f.close()


with (
    open('ex11.py','r',encoding='utf-8') as fr,
    open('ex22.py','w',encoding='utf-8') as fw
      ):
    #
    # lines=fr.readlines()
    # for line in lines:
    #     arr1=list(line)
    #     arr1[0]=arr1[0].upper()
    #     fw.write("".join(arr1))
    line=None
    while line!='':
        line=fr.readline()
        fw.write(line)



# f=open('copy.png','wb')
# f.write(msg)
# f.close()
# print('복사완료')