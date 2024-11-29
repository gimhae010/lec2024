# from django.contrib.redirects.models import Redirect
from django.http import HttpResponse
from django.shortcuts import render, redirect

from dept.models import Dept


# Create your views here.
def list(req):
    # return HttpResponse('dept test page')
    result=Dept.objects.all()
    context={'result':result}
    return render(req,'dept/index.html',context)

def add(req):
    # print(req.method)
    # for msg in dir(req):
    #     if not msg.startswith('_'): print(msg)
    if req.method=='GET':
        return render(req,'dept/add.html')
    elif req.method=='POST':
        print(req.body)
        print(req.POST)
        dname,loc=req.POST['dname'],req.POST['loc']
        dept=Dept(dname=dname,loc=loc)
        dept.save()
        return redirect('deptList')













