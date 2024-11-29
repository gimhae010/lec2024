import fastapi
from fastapi.responses import HTMLResponse
from fastapi import Request
from starlette.templating import Jinja2Templates

import dept

app=fastapi.FastAPI()
templates = Jinja2Templates(directory="templates")

app.include_router(dept.router)

@app.get("/")
def index(request: Request):
    return templates.TemplateResponse('index.html',{"request": request})

@app.get('/intro',response_class=HTMLResponse)
def intro():
    return "<img src='https://www.inje.ac.kr/kor/assets/images/sub/gimhae-campus-1-241008.jpg'/>"










