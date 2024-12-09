from fastapi import FastAPI
from pickle import load
from tensorflow.keras.models import load_model
import numpy as np
model = load_model('iris_tensor.h5')
    
app=FastAPI()

@app.post('/iris')
def result(slength:float, swidth:float, plength:float, pwidth:float):
    idx=np.argmax(model.predict(np.array([[slength, swidth, plength, pwidth]])),axis=1)
    target=['setosa', 'versicolor', 'virginica']
    return {'result':target[idx[0]]}
