from django.shortcuts import render, redirect

dummyData=[
    {'deptno':1111,'dname':'test1','loc':'test'},
    {'deptno':2222,'dname':'test2','loc':'test'},
    {'deptno':3333,'dname':'test3','loc':'test'},
    {'deptno':4444,'dname':'test4','loc':'test'},
]

# Create your views here.
def list(req):
    context={'datas':dummyData}
    return render(req,"dept/list.html",context)
def add(req):
    if req.method=='GET':
        return render(req,"dept/add.html")
    else :
        print(dir(req))
        print(req.body)
        print(req.POST['deptno'],type(req.POST['deptno']))
        print(req.POST['dname'],type(req.POST['dname']))
        print(req.POST['loc'])
        dummyData.append(
            {'deptno':int(req.POST['deptno']),
             'dname':req.POST['dname'],
             'loc':req.POST['loc']}
        )
        return redirect('depts')
def detail(req,deptno):
    print('detail param',deptno)
    return render(req,"dept/detail.html")
