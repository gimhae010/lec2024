from datetime import datetime, timedelta

from fastapi import FastAPI, HTTPException
from jose import jwt, JWTError
from pydantic import BaseModel
from starlette.middleware.cors import CORSMiddleware
from starlette.requests import Request

app=FastAPI()
SECRET_KEY = "abcdefg1234567890abcdefg1234567890abcdefg1234567890"  # 실제 환경에서는 안전한 방식으로 관리해야 합니다
ALGORITHM = "HS256"
ACCESS_TOKEN_EXPIRE_MINUTES = 30

origins = [
    "http://127.0.0.1:5500",
    "http://localhost:8080",
]

app.add_middleware(
    CORSMiddleware,
    allow_origins=origins,
    allow_credentials=True,
    allow_methods=["OPTIONS","GET", "POST", "PUT", "DELETE"],
    allow_headers=["*"],
)

class Token(BaseModel):
    access_token: str
    token_type: str


def create_access_token(data: dict, expires_delta: timedelta | None = None):
    to_encode = data.copy()
    expire = datetime.utcnow() + (expires_delta or timedelta(minutes=15))
    to_encode.update({"exp": expire})
    return jwt.encode(to_encode, SECRET_KEY, algorithm=ALGORITHM)


def get_current_user(token: str):
    # credentials_exception = HTTPException(
    #     status_code=401,
    #     detail="Could not validate credentials",
    #     headers={"Authenticate": "Bearer"},
    # )
    try:
        payload = jwt.decode(token, SECRET_KEY, algorithms=[ALGORITHM])
        username: str = payload.get("sub")
        if username is None:
            raise Exception()
    except JWTError:
        raise Exception()
    return username

@app.get('/')
def index():
    return "test";
@app.get('/login')
def login():
    return create_access_token({"user":"user01"});

@app.get('/info')
def info(request: Request):
    token=request.headers.get('authorization').split(' ')[1]
    print(token)
    user=get_current_user(token)
    return {"user":user}

@app.get('/data')
def data():
    return {'datas':[{'num':1111,'name':'test1'},{'num':2222,'name':'test2'}]}
