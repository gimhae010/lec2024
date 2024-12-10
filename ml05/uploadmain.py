from typing import Annotated
from PIL import Image
import io
import numpy as np
from fastapi import FastAPI, File, UploadFile
from tensorflow.keras.models import load_model
model = load_model('mnist.h5')

app = FastAPI()

#(233, 255, 3)
@app.post("/files/")
async def create_file(file: Annotated[bytes, File()]):
    #print(file)
    img = Image.open(io.BytesIO(file))
    img = Image.eval(img, lambda x: 255 - x)
    img = img.resize((28,28))
    img = img.convert("L")
    x = np.array(img)
    print(x)
    print(x.shape)
    X_test = x.reshape(28*28)
    X_test = X_test.astype('float32')
    X_test /= 255
    result=np.argmax(model.predict(np.array([X_test])), axis=1)
    print(result)
    return {"result": str(result)}


@app.post("/uploadfile/")
async def create_upload_file(file: UploadFile):
    print(file.size)
    print(file.content_type)
    print(file.read())
    return {"filename": file.filename}
