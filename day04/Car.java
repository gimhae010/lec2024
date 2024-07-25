package com.day04;

public class Car {
    public String model;
    public String color;
    public int speed;
    public int MAX;

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
