from django.shortcuts import render

def index(request):
    print('index')
    # return HttpResponse("Hello, world. You're at the polls index.")
    return render(request,'index.html')

def intro(request):
    print('intro')
    return render(request,'intro.html')

def list(request):
    print('list')
    return render(request,'depts.html')
