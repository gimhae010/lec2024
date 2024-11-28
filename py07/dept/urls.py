from django.contrib import admin
from django.urls import path

from dept import views

urlpatterns = [
    path('', views.list,name='depts'),
    path('add', views.add,name='add'),
    # path('insert', views.insert),
    path('<int:deptno>', views.detail,name='detail'),
]
