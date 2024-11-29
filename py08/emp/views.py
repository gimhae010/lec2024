from django.contrib.auth.decorators import login_required
from django.http import HttpResponse
from django.shortcuts import render

# Create your views here.
@login_required(login_url="user_login")
def list(req):
    # return HttpResponse('emp test page')
    return render(req,'emp/index.html')