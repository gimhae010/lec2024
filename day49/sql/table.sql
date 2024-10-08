create table dept(
deptno int primary key auto_increment,
dname varchar(50),
loc varchar(50)
);
create table emp(
empno int primary key auto_increment,
ename varchar(50),
pay int,
hiredate date,
deptno int
);
insert into dept (dname,loc) values ('����','����');
insert into dept (dname,loc) values ('��⵵����','��õ');
insert into dept (dname,loc) values ('�泲����','�λ�');
commit;
insert into emp (ename,pay,hiredate,deptno) values ('user1',1000,now(),1);
insert into emp (ename,pay,hiredate,deptno) values ('user2',1000,now(),2);
insert into emp (ename,pay,hiredate,deptno) values ('user3',1000,now(),1);
insert into emp (ename,pay,hiredate,deptno) values ('user4',1000,now(),2);
commit;