package com.gimhae;

public class Ex04 {

	public static void main(String[] args) {
		// finally
		int su=1;
		try {
			int a=1/su;
			System.out.println("a="+a);
//		}catch(ArithmeticException e) {
//			System.out.println("����ó��");
//			return ;
		}finally {
			System.out.println("�ݵ�� ó��");
		}

	}

}
