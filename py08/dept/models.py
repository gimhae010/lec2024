from django.db import models

# Create your models here.
class Dept(models.Model):
    deptno=models.IntegerField(auto_created=True,primary_key=True)
    dname=models.CharField(max_length=10)
    loc=models.TextField()
    def __str__(self):
        return  '{:0>4s}.'.format(str(self.deptno))+self.dname