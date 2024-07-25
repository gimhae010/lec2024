package com.day04;

public class Ex03 {
    public static void main(String[] args) {
        double su=com.day04.Math.random();
        System.out.println("내가만든"+su);
        su=java.lang.Math.random();
        System.out.println("자바가만든"+su);
        su=com.day04.Math.PI;
        System.out.println("내가만든 pi="+su);
        su=java.lang.Math.PI;
        System.out.println("자바가만든 pi="+su);
    }
}

class Math{
    public static double PI=2.14;
    public static double random(){
        return 1.0;
    }
}
