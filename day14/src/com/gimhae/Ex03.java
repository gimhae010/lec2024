package com.gimhae;

public class Ex03{

	public static void main(String[] args) throws CloneNotSupportedException {
//		try {
		func01();
//		}catch(ArithmeticException e) {System.out.println("err");}
//		}catch(CloneNotSupportedException e) {}
	}
	
	public static void func01() throws CloneNotSupportedException {
//		try {
		func02();
//		}catch(CloneNotSupportedException e) {
//			
//		}
	}
	public static void func02() throws CloneNotSupportedException {
		Ex03 me=new Ex03();
		Object obj=me.clone();
		System.out.println("이미 던졌음");
	}
	

}
