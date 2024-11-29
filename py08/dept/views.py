from django.http import HttpResponse
from django.shortcuts import render

# Create your views here.
def list(req):
    # return HttpResponse('dept test page')
    return render(req,'dept/index.html')