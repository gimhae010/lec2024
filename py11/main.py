import fastapi
from fastapi.templating import Jinja2Templates
from starlette.requests import Request
from routers.DeptRouter import router

app=fastapi.FastAPI()
template=Jinja2Templates('templates')

app.include_router(router=router)

@app.get("/")
def index(req:Request):
    return template.TemplateResponse('index.html',{'request':req})
@app.get("/intro")
def intro(req:Request):
    return template.TemplateResponse('intro.html',{'request':req})