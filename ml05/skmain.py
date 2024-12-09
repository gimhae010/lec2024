from fastapi import FastAPI
from pickle import load
with open("sk_iris_dtc.pkl", "rb") as f:
    model = load(f)
    
app=FastAPI()

@app.post('/iris')
def result(slength:float, swidth:float, plength:float, pwidth:float):
    idx=model.predict([[slength, swidth, plength, pwidth]])[0]
    target=['setosa', 'versicolor', 'virginica']
    return {'result':target[idx]}
