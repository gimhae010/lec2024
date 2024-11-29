from django.http import HttpResponse
from django.shortcuts import render

# Create your views here.
def list(req):
    # return HttpResponse('emp test page')
    return render(req,'emp/index.html')