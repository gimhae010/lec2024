msg1='hello'
msg2='world'
msg3=msg1+msg2
print(msg3)
print(msg3.replace('world','Python'))
trans=str.maketrans('hw','HW')
print(msg3.translate(trans))
arr1=list(msg1)
print(arr1)
print('_'.join(arr1))
msg4='>>>'+msg1.ljust(10)+'<<<'
print(msg4)
msg5='>>>'+msg1.rjust(10)+'<<<'
print(msg5)
print(msg5.strip('>< '))
msg6='>>>'+msg1.center(10)+'<<<'
print(msg6)