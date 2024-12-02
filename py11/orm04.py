from sqlalchemy import select
from sqlalchemy.orm import Session
from orm02 import engine,User

# session = Session(engine)

# stmt = select(User).where(User.name.in_(["spongebob", "sandy"]))
#
# for user in session.scalars(stmt):
#     print(user)

with Session(engine) as session:
    result=session.query(User).all()
    for row in result:
        print(row.name)