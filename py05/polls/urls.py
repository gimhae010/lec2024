from django.contrib import admin
from django.urls import path

from polls import views

urlpatterns = [
    path("", views.index, name="index"),
    path("intro", views.intro, name="intro"),
    path("dept/", views.list, name="list"),
]
