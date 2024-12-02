import mysql.connector
from fastapi import APIRouter, Depends
from fastapi.requests import Request
from fastapi.templating import Jinja2Templates
from pydantic import BaseModel
from sqlalchemy.orm import Session

from DataConfig import get_db
from models import Dept

router=APIRouter(prefix='/dept')
template=Jinja2Templates('templates')

class DeptVo(BaseModel):
    deptno:int=0
    dname:str
    loc:str

    def __str__(self):
        return str(self.deptno)+","+self.dname+','+self.loc


# def Outter(cb):
#     print('outer')
#     def Inner(sql):
#         print('inner')
#         return cb(sql)
#     return Inner
#
# @Outter
# def getList(sql):
#     try:
#         arr = []
#         conn = mysql.connector.connect(
#             host="localhost",
#             user="scott",
#             password="tiger",
#             database="xe"
#         )
#
#         mycursor = conn.cursor()
#
#         mycursor.execute(sql)
#
#         for row in mycursor.fetchall():
#             arr.append(DeptVo(deptno=row[0], dname=row[1], loc=row[2]))
#         return arr
#     finally:
#         conn.close()

@router.get("/")
def list(req:Request,db:Session=Depends(get_db)):
    # arr=getList("SELECT * FROM dept")
    arr=[]
    for bean in db.query(Dept).all():
        arr.append(DeptVo(deptno=bean.deptno,dname=bean.dname,loc=bean.loc))
    return template.TemplateResponse('dept/list.html',{'request':req,'list':arr})


@router.get('/add')
def add(req:Request):
    return template.TemplateResponse('dept/add.html',{'request':req})

@router.post('/')
def add(dept:DeptVo,db:Session=Depends(get_db)):
    print('add',dept)
    bean=Dept(dname=dept.dname,loc=dept.loc)
    db.add(bean)
    db.commit()
    return {"result":"success"}

@router.get('/{deptno}')
def add(req:Request,deptno:int,db:Session=Depends(get_db)):
    bean=db.query(Dept).filter(Dept.deptno == deptno).first()
    ## 수정
    # bean.loc='edit'
    # db.commit()
    # print(bean)
    ## 삭제
    # db.delete(bean)
    # db.commit()
    return template.TemplateResponse('dept/detail.html',{'request':req,'bean':bean})
    # return {}
