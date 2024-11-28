
def func00(msg):
    def func01(f):
        def func02():
            print('before',msg)
            f()
            print('after')
        return func02
    return func01


# func01(lambda :print('test'))()

@func00('test')
def func03():
    print('func03 run')


func03()
            