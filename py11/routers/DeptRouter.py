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


def getList():
    try:
        arr = []
        conn = mysql.connector.connect(
            host="localhost",
            user="scott",
            password="tiger",
            database="xe"
        )

        mycursor = conn.cursor()

        mycursor.execute("SELECT * FROM dept")

        for row in mycursor.fetchall():
            arr.append(Dept(deptno=row[0], dname=row[1], loc=row[2]))
        return arr
    finally:
        conn.close()

@router.get("/")
def list(req:Request):
    arr=getList()
    return template.TemplateResponse('dept/list.html',{'request':req,'list':arr})