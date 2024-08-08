package com.gimhae;

public class Ex02 {

	public static void main(String[] args) {
		int[] arr= {-1,0,1,2};

		
		for(int i=4; i>=0; i--) {
			try {
				System.out.println(4/arr[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("pass");
			}catch(ArithmeticException e) {
				System.out.println(0);
			}catch(RuntimeException e) {
				System.out.println("runtime");
			}
		}
	}

}
