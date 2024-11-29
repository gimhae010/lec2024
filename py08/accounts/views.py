from django.shortcuts import render, redirect
#############장고 auth#####################
from django.contrib.auth.models import User
from django.contrib.auth import login, logout, authenticate
from django.contrib.auth.decorators import login_required
#############사용자 정의 로그인 테이블###########################
# from accounts.models import User
from django.http import HttpResponse


def user_signup(request):
    if request.method == "POST":
        username = request.POST["username"]
        password = request.POST["password"]
        email = request.POST.get("email", "")
        if not (username and password):
            return HttpResponse("이름과 패스워드는 필수입니다.")
        if User.objects.filter(username=username).exists():
            return HttpResponse("유저이름이 이미 있습니다.")
        if email and User.objects.filter(email=email).exists():
            return HttpResponse("이메일이 이미 있습니다.")

        user = User.objects.create_user(username, email, password)
        user.save()
        # user = authenticate(username=username, password=password)
        # login(request, user)
        # return redirect("user_profile")
        #############사용자 정의 로그인 테이블###########################
        # user=User(username=username,email=email,password=password)
        # user.save()
        return redirect("user_login")
    else:
        return render(request, "accounts/signup.html")


def user_login(request):
    if request.method == "POST":
        username = request.POST["username"]
        password = request.POST["password"]
        user = authenticate(request, username=username, password=password)
        if user is not None:
            login(request, user)
        #############사용자 정의 로그인 테이블###########################
        # user = User.objects.filter(username=username, password=password)
        # if user is not None:
        #     request.session['username'] = username
            return redirect("user_profile")
        else:
            return render(
                request,
                "accounts/login.html",
                {"error": "아이디나 패스워드가 맞지 않습니다."},
            )
    else:
        return render(request, "accounts/login.html")


def user_logout(request):
    logout(request)
    #########################################
    # print(request.session.session_key,request.session.get('username'))
    # request.session.clear()
    # print(request.session.session_key,request.session.get('username'))
    return redirect("user_login")


@login_required(login_url="user_login")
def user_profile(request):
    return render(request, "accounts/profile.html", {"user": request.user})
    # print(request.session.session_key)
    # sessionUser=request.session.get('username')
    # sessionUser=User.objects.get(username=username)
    # if sessionUser!=None:
    #     return render(request, "accounts/profile.html", {"user": sessionUser})
    # else :
    #     return redirect("user_login")
