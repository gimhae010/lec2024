package com.gimhae;

public class Ex01 {

	public static void main(String[] args) {
		// 예외처리
		// 예외 - 에러가 발생할수 있는 상황 회피
		// try{예외가 발생할수 있는 구문}catch(exception e){처리}
		int c=0;
		int a=4;
		int b=0;
//		if(b!=0)
//			c=a/b;
//		else c=0;
		try {
			c=a/b;
		}catch(ArithmeticException e){//발생하면
			c=0;
		}
		System.out.println(a+"÷"+b+"="+c);
		System.out.println("main end");
	}

}
