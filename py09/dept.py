from fastapi import APIRouter
import mysql.connector

mydb = mysql.connector.connect(
  host="localhost",
  user="scott",
  password="tiger",
  database="xe"
)
router=APIRouter(prefix='/dept')

@router.get('/')
def list():
    mycursor = mydb.cursor()
    sql = "select * from dept"
    mycursor.execute(sql)
    data=mycursor.fetchall()
    mycursor.close()
    return data

@router.post('/add')
def add(dname:str,loc:str,deptno:int):
    val = (deptno,dname,loc)
    mycursor = mydb.cursor()
    sql = "INSERT INTO dept VALUES ({},'{}','{}')".format(deptno,dname,loc)
    mycursor.execute(sql)
    mydb.commit()
    mycursor.close()
    return val