import time
from datetime import datetime

print('{"time","',datetime.now())
time.sleep(2.5)
print('","result":','"OK"}')