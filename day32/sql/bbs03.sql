--------------------------------------------------------
--  颇老捞 积己凳 - 格夸老-9岿-05-2024   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table BBS03
--------------------------------------------------------

  CREATE TABLE "SCOTT"."BBS03" 
   (	"NUM" NUMBER NOT NULL ENABLE, 
	"ID" VARCHAR2(20), 
	"NALJA" DATE, 
	"SUB" VARCHAR2(30), 
	"CONTENT" VARCHAR2(2000), 
	"REF" NUMBER, 
	"SEQ" NUMBER DEFAULT 0, 
	"LEV" NUMBER DEFAULT 0, 
	 CONSTRAINT "TABLE1_PK" PRIMARY KEY ("NUM")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "SYSTEM"
REM INSERTING into SCOTT.BBS03
SET DEFINE OFF;
Insert into SCOTT.BBS03 (NUM,ID,NALJA,SUB,CONTENT,REF,SEQ,LEV) values (1,'tester',to_date('24/09/05','RR/MM/DD'),'test1','test',1,0,0);
Insert into SCOTT.BBS03 (NUM,ID,NALJA,SUB,CONTENT,REF,SEQ,LEV) values (2,'tester',to_date('24/09/05','RR/MM/DD'),'test2','test',2,0,0);
Insert into SCOTT.BBS03 (NUM,ID,NALJA,SUB,CONTENT,REF,SEQ,LEV) values (3,'tester',to_date('24/09/05','RR/MM/DD'),'test3','test',3,0,0);
Insert into SCOTT.BBS03 (NUM,ID,NALJA,SUB,CONTENT,REF,SEQ,LEV) values (4,'tester',to_date('24/09/05','RR/MM/DD'),'test4','test',4,0,0);
Insert into SCOTT.BBS03 (NUM,ID,NALJA,SUB,CONTENT,REF,SEQ,LEV) values (5,'tester',to_date('24/09/05','RR/MM/DD'),'test5','test',5,0,0);
Insert into SCOTT.BBS03 (NUM,ID,NALJA,SUB,CONTENT,REF,SEQ,LEV) values (6,'tester',to_date('24/09/05','RR/MM/DD'),'test6','test',6,0,0);
Insert into SCOTT.BBS03 (NUM,ID,NALJA,SUB,CONTENT,REF,SEQ,LEV) values (12,'tester',to_date('24/09/05','RR/MM/DD'),'test4-3','test',4,8,1);
Insert into SCOTT.BBS03 (NUM,ID,NALJA,SUB,CONTENT,REF,SEQ,LEV) values (15,'tester',to_date('24/09/05','RR/MM/DD'),'test4-2-2','test',4,3,2);
Insert into SCOTT.BBS03 (NUM,ID,NALJA,SUB,CONTENT,REF,SEQ,LEV) values (14,'tester',to_date('24/09/05','RR/MM/DD'),'test4-2-1','test',4,6,2);
Insert into SCOTT.BBS03 (NUM,ID,NALJA,SUB,CONTENT,REF,SEQ,LEV) values (10,'tester',to_date('24/09/05','RR/MM/DD'),'test4-1','test',4,1,1);
Insert into SCOTT.BBS03 (NUM,ID,NALJA,SUB,CONTENT,REF,SEQ,LEV) values (11,'tester',to_date('24/09/05','RR/MM/DD'),'test4-2','test',4,2,1);
Insert into SCOTT.BBS03 (NUM,ID,NALJA,SUB,CONTENT,REF,SEQ,LEV) values (16,'tester',to_date('24/09/05','RR/MM/DD'),'test4-2-2-1','test',4,5,3);
Insert into SCOTT.BBS03 (NUM,ID,NALJA,SUB,CONTENT,REF,SEQ,LEV) values (17,'tester',to_date('24/09/05','RR/MM/DD'),'test4-2-2-2','test',4,4,3);
Insert into SCOTT.BBS03 (NUM,ID,NALJA,SUB,CONTENT,REF,SEQ,LEV) values (18,'tester',to_date('24/09/05','RR/MM/DD'),'test4last','test',4,9,1);
--------------------------------------------------------
--  Constraints for Table BBS03
--------------------------------------------------------

  ALTER TABLE "SCOTT"."BBS03" MODIFY ("NUM" NOT NULL ENABLE)
 
  ALTER TABLE "SCOTT"."BBS03" ADD CONSTRAINT "TABLE1_PK" PRIMARY KEY ("NUM")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE

--------------------------------------------------------
--  SEQUENCE for Table BBS03
--------------------------------------------------------  
  CREATE SEQUENCE BBS03_SEQ START WITH 19;