import mysql.connector
from fastapi import APIRouter
from fastapi.requests import Request
from fastapi.templating import Jinja2Templates
from pydantic import BaseModel

router=APIRouter(prefix='/dept')
template=Jinja2Templates('templates')

class Dept(BaseModel):
    deptno:int
    dname:str
    loc:str

    def __str__(self):
        return str(self.deptno)+","+self.dname+','+self.loc


def Outter(cb):
    print('outer')
    def Inner(sql):
        print('inner')
        return cb(sql)
    return Inner

@Outter
def getList(sql):
    try:
        arr = []
        conn = mysql.connector.connect(
            host="localhost",
            user="scott",
            password="tiger",
            database="xe"
        )

        mycursor = conn.cursor()

        mycursor.execute(sql)

        for row in mycursor.fetchall():
            arr.append(Dept(deptno=row[0], dname=row[1], loc=row[2]))
        return arr
    finally:
        conn.close()

@router.get("/")
def list(req:Request):
    arr=getList("SELECT * FROM dept")
    return template.TemplateResponse('dept/list.html',{'request':req,'list':arr})

@router.get('/add')
def add(req:Request):
    return template.TemplateResponse('dept/add.html',{'request':req})

@router.post('/')
def add(dept:Dept):
    conn = mysql.connector.connect(
        host="localhost",
        user="scott",
        password="tiger",
        database="xe"
    )
    mycursor = conn.cursor()
    mycursor.execute("insert into dept values ({},'{}','{}')".format(dept.deptno,dept.dname,dept.loc))
    print("insert into dept values ({},'{}','{}')".format(dept.deptno,dept.dname,dept.loc))
    conn.commit()
    conn.close()
    return {"result":"success"}