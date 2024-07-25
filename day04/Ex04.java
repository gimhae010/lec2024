package com.day04;

public class Ex04 {
    /*
     * 생성자
     * public 클래스명(매개변수){하고자하는 일;}
     * 객체의 생성 시점에 하고자하는 일을 명세
     * 생성자코드 생략시 디폴트생성자를 자동생성
     * 
     * 디폴트생성자
     * public 클래스명(){}
     * 
     * 생성자오버로드
     * -매개변수 유무,갯수,타입,순서가 다르면..
     */
    public Ex04(){
        System.out.println("매개변수없이 객체생성");
    }
    public Ex04(int a){
        System.out.println("매개변수하나 "+a);
    }

    public void func01(){
        System.out.println("실행");
    }
    public static void main(String[] args) {
        Ex04 me;// 선언
        me=new Ex04(1234);//초기화
        me.func01();
    }
}
