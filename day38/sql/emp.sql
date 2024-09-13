CREATE DATABASE IF NOT EXISTS xe ;
USE xe;

CREATE TABLE IF NOT EXISTS emp38 (
  empno int NOT NULL AUTO_INCREMENT,
  ename varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  pay int DEFAULT NULL,
  hiredate datetime DEFAULT NULL,
  PRIMARY KEY (empno)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

DELETE FROM emp38;
INSERT INTO emp38 (empno, ename, pay, hiredate) VALUES
	(4, 'tester4', 4444, '2024-09-13 10:26:25'),
	(5, 'tester5', 5555, '2024-09-13 10:26:25'),
	(6, 'test6', 6666, '2024-09-13 11:32:57'),
	(7, 'test6', 6666, '2024-09-13 11:47:18'),
	(8, 'test6', 6666, '2024-09-13 11:51:44'),
	(10, 'tester10', 1010, '2024-09-13 14:41:40');

