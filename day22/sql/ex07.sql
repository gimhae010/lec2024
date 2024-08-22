select ename,nvl(decode(deptno,10,'accounting',20,'research'),'etc') from emp
/
