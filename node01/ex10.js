function Func01(){

}

const obj1=new Func01();
console.log(obj1);

class Func02{
    // a=1000;
    constructor() {
        console.log('생성자 호출');
        this.a=1111;
    }
    func1=function() {
        console.log('메서드');
    }
    func2(){
        console.log('메서드');
    }
}
const obj2=new Func02();
console.log(obj2.a);
obj2.func1();]