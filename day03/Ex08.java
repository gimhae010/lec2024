class Car{
    // 속성
    public String name;
    public String model="드림차";
    public String company="";
    public String color="흰";
    public int speed;
    public int maxSpeed=150;

    // 기능
    public void speedUp(){
        speed+=10;
        if(speed>maxSpeed){speed=maxSpeed;}
    }
    public void speedUp(int up){
        speed+=up;
        if(speed>maxSpeed){speed=maxSpeed;}
    }
    public void speedDown(){
        speed-=13;
        if(speed<0){speed=0;}
    }
    public void speedShow(){
        System.out.println(company+" 차 "+color
        +"색 "+model+"의 현재속도는 "+speed+"km");
    }

}

public class Ex08 {
    public static void main(String[] args) {
        Car myCar=new Car();
        // myCar.company="기아";
        myCar.model="모닝";
        myCar.speedShow();
        for(int i=0; i<30; i++){
            myCar.speedUp();
            myCar.speedShow();
        }
        for(int i=0; i<30; i++){
            myCar.speedDown();
            myCar.speedShow();
        }
        myCar=new Car();
        myCar.company="현대";
        // myCar.model="소나타";
        myCar.color="검정";
        myCar.maxSpeed=180;
        for(int i=0; i<30; i++){
            myCar.speedUp(17);
            myCar.speedShow();
        }
        for(int i=0; i<30; i++){
            myCar.speedDown();
            myCar.speedShow();
        }
    }
}
