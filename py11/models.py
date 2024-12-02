from sqlalchemy import Column, Integer, String

from DataConfig import Base, engine

class Dept(Base):
    __tablename__='dept'
    deptno=Column(Integer,primary_key=True,index=True,autoincrement=True)
    dname=Column(String(10),nullable=False)
    loc=Column(String)

if __name__=='__main__':
    Base.metadata.create_all(engine)