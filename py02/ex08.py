class Cl01:
    def __init__(self,su):
        self.su1=su
        print('생성자')
    def func01(self):
        print('f1',self.su1)
    def __str__(self):
        return '나'
    def __eq__(self, value):
        return self.su1==value.su1
    

obj1=Cl01(3333)
obj2=Cl01(4444)
# obj1.su=1111
print(obj1==obj2)
# obj1.func01()

# print(__name__)

class Cl02(Cl01):
    def __init__(self, su):
        super().__init__(su)

class Cl03:
    su=1111

class Cl04:
    su=1111
    
    @staticmethod
    def func01():
        Cl04.su=2222

class Cl05:
    su=1111

    @classmethod
    def func02(cls):
        cls.su=3333