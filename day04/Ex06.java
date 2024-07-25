package com.day04;

class Car {
    public String model;
    public String color;
    public int speed;
    public final int MAX;

    public Car(){
        this("쥐","아반떼",80);
    }
    public Car(String color){
        this(color,"소나타",95);
    }
    public Car(String a, String b){
        this(a,b,100);
    }
    public Car(String color,String model,int max){
        this.color=color;
        this.model=model;
        this.MAX=max;
    }

    public void speedUp(){
        speed+=10;
        if(speed>MAX)speed=MAX;
    }
    public void speedDown(){
        speed-=10;
        if(speed<0)speed=0;
    }
    public void show(){
        System.out.println(color+"색 "+model
                +"의 현재속도는 "+speed+"km");
    }
}

public class Ex06 {
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.show();
        for(int i=0; i<10; i++){
            myCar.speedUp();
            myCar.show();
        }
        for(int i=0; i<10; i++){
            myCar.speedUp();
            myCar.show();
        }
        for(int i=0; i<10; i++){
            myCar.speedDown();
            myCar.show();
        }
    }
}
