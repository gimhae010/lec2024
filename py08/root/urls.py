"""
URL configuration for root project.

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/5.1/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path
import dept.views
import emp.views
import home.views

urlpatterns = [
    path('',home.views.index),
    path('intro',home.views.intro),
    path('dept/',dept.views.list, name='deptList'),
    path('dept/add',dept.views.add),
    path('dept/<int:deptno>',dept.views.detail, name='deptDetail'),
    path('emp/',emp.views.list),
    path('admin/', admin.site.urls),
]
