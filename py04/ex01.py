import fastapi

app=fastapi.FastAPI()

@app.get('/')
def index():
    print('index call...')