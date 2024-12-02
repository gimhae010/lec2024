from datetime import datetime, timedelta

import fastapi
from fastapi import HTTPException
from jose import jwt
from starlette.requests import Request

app=fastapi.FastAPI()

dummy_data=[]

@app.get('/')
def index():
    return {}
@app.get('/join')
def join(id:str,pw:str):
    dummy_data.append({'id':id,'pw':pw})
    return {'id':id,'pw':pw}
@app.get('/login')
def login(id:str,pw:str):
    token=None
    for row in dummy_data:
        if row.get('id')==id and row.get('pw')==pw:
            expire = datetime.utcnow() + timedelta(minutes=1)
            token = jwt.encode({'sub': id,"exp": expire}, 'secret', algorithm='HS256')
    return {'token':token}
@app.get('/info')
def index(req:Request):
    if req.headers.get('authorization') is not None:
        auth=req.headers.get('authorization')
        if auth.startswith('Bearer '):
            token=auth.split(" ")[1]
            PAYLOAD=jwt.decode(token, 'secret', algorithms=['HS256'])
            # time=PAYLOAD.get('exp')
            # exp=datetime.fromtimestamp(time)
            # if exp>=datetime.utcnow():
            for row in dummy_data:
                if row.get('id')==PAYLOAD.get('sub'):
                    return {'payload':PAYLOAD}
            raise HTTPException(403, '존재하지 않는 사용자')
            # else :
            #     raise HTTPException(403, '타임아웃')
        else:
            raise HTTPException(403, '토큰 오류')
    else:
        raise HTTPException(403,'불허')













