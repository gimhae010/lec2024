from sqlalchemy.orm import Session
from orm02 import engine,User,Address

with Session(engine) as session:
    # spongebob = User(
    #     name="spongebob",
    #     fullname="Spongebob Squarepants",
    #     addresses=[Address(email_address="spongebob@sqlalchemy.org")],
    # )
    # sandy = User(
    #     name="sandy",
    #     fullname="Sandy Cheeks",
    #     addresses=[
    #         Address(email_address="sandy@sqlalchemy.org"),
    #         Address(email_address="sandy@squirrelpower.org"),
    #     ],
    # )
    # patrick = User(name="patrick", fullname="Patrick Star")
    # session.add_all([spongebob, sandy, patrick])
    obj=User(
        name="test1",
        name2="test2",
        name3="test3",
        name4="test4",
        addresses=[Address(email_address="spongebob@sqlalchemy.org")],)
    session.add(obj)
    session.commit()