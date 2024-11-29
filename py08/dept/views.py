from django.http import HttpResponse, JsonResponse
from django.shortcuts import render, redirect

from dept.models import Dept
import json


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
        dname,loc=req.POST['dname'],req.POST['loc']
        dept=Dept(dname=dname,loc=loc)
        dept.save()
        return redirect('deptList')
    else:
        return HttpResponse('test ok')

def detail(req,deptno):
    print(req.method)
    # print(1,Dept.objects.all()[0])
    # print(2,Dept.objects.filter(deptno=deptno)[0])
    # print(3,Dept.objects.get(deptno=deptno))
    # print(4,Dept.objects.filter(dname__contains='test'))
    # print(5,Dept.objects.filter(deptno__gt=1))
    # print(6,Dept.objects.filter(deptno__lt=3))
    # dept=Dept.objects.filter(deptno=deptno)[0] if len(Dept.objects.filter(deptno=deptno))>0 else None
    # context={'dept':dept}
    # return render(req, 'dept/detail.html', context)
    if req.method=='GET':
        try:
            dept = Dept.objects.get(deptno=deptno)
            context = {'dept': dept}
            return  render(req,'dept/detail.html',context)
        except:
            return render(req, 'dept/detail.html', {'dept':None})
    elif req.method=='PUT':
        try:
            paramJson=json.loads(req.body)
            dept=Dept.objects.get(deptno=deptno)
            dept.dname=paramJson['dname']
            dept.loc=paramJson['loc']
            dept.save()
            return JsonResponse(data={"result":"success"})
        except Exception as e:
            # return JsonResponse(data={"result":"error","err":e})
            raise e
    elif req.method=='DELETE':
        Dept.objects.get(deptno=deptno).delete()
        return JsonResponse(data={"result":"success"})








