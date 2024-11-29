from django.http import HttpResponse
from django.shortcuts import render

from dept.models import Dept


# Create your views here.
def list(req):
    # return HttpResponse('dept test page')
    result=Dept.objects.all()
    for row in result:
        print(row)
    return render(req,'dept/index.html')