## 주석
CREATE TABLE emp35 (
	empno INT NOT NULL AUTO_INCREMENT,
	ename VARCHAR(50) NULL DEFAULT NULL,
	pay INT NULL,
	hiredate TIMESTAMP NULL DEFAULT NULL,
	PRIMARY KEY (empno)
)COLLATE='utf8mb4_general_ci';

## dummy
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user1',1000,NOW());
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user2',2000,NOW());
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user3',3000,NOW());
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user4',4000,NOW());
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user5',5000,NOW());
COMMIT;
SELECT * FROM emp35;
