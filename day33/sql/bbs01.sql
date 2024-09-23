-- #init
-- mysqld --initialize  --user=mysql --datadir=../data --console
--
-- #server start
-- mysqld --console
-- 
-- ## create user
-- CREATE USER 'scott'@'localhost' IDENTIFIED BY 'tiger';
--
-- GRANT EXECUTE, PROCESS, SELECT, SHOW DATABASES, SHOW VIEW, ALTER, ALTER ROUTINE, CREATE, CREATE ROUTINE, CREATE TABLESPACE, CREATE TEMPORARY TABLES, CREATE VIEW, DELETE, DROP, EVENT, INDEX, INSERT, REFERENCES, TRIGGER, UPDATE, CREATE USER, FILE, LOCK TABLES, RELOAD, REPLICATION CLIENT, REPLICATION SLAVE, SHUTDOWN, 
-- SUPER  ON *.* TO 'scott'@'localhost' WITH GRANT OPTION;
--
-- FLUSH PRIVILEGES;
--
-- ## create table
CREATE TABLE bbs01 (
	num INT NOT NULL AUTO_INCREMENT,
	id VARCHAR(20) NULL DEFAULT NULL,
	nalja TIMESTAMP NULL,
	sub VARCHAR(10) NULL DEFAULT NULL,
	content TEXT NULL,
	cnt INT NULL DEFAULT 0,
	PRIMARY KEY (num)
)COLLATE='utf8mb4_general_ci';