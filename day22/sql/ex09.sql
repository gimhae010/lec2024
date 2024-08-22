 select ename,
  2     case DEPTNO
  3     WHEN 10 THEN 'ACCOUNTING'
  4     WHEN 20 THEN 'RESEARCH'
  5     WHEN 30 THEN 'SALES'
  6     WHEN 40 THEN 'OPERATIONS'
  7     end
  8* from emp;