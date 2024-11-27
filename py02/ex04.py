msg1='select * from dept where deptno=%d' % 1111
print(msg1)
msg2="select * from dept where dname like '%-8s'" % '%서울%'
print(msg2)
msg3='select %.2f as pi from dual' % 3.14
print(msg3)
msg4="insert into dept values (%d, '%s', '%s')" % (1111,'test1','test2')
print(msg4)

msg5='select * from dept where deptno={}'.format(2222)
print(msg5)
msg6="select * from dept where dname like '{}'".format('김해')
print(msg6)
msg8="insert into dept values ({1},{0},{2})".format('test3',4444,'test4')
print(msg8)
msg9="insert into dept values ({deptno:.2f},{dname:>8},{loc})".format(dname='test5',deptno=5555,loc='test6')
# msg9="insert into dept values ({deptno},{dname},{loc})".format({'dname':'test5','deptno':5555,'loc':'test6'})
print(msg9)