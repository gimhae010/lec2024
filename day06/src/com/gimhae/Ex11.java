package com.gimhae;

public class Ex11 {

	public static void main(String[] args) {
		String msg1="ja";
		String msg2="va";
		System.out.println(msg1+msg2);
		System.out.println(msg1.concat(msg2));
		String msg3="java";
		String msg4=new String("java");
		System.out.println(msg3==msg4);// 레퍼런스 비교
		System.out.println(msg3.equals(msg4));// 값비교
		System.out.println(msg3.equals("javascript"));
		char[] arr1=msg3.toCharArray();
		byte[] arr2=msg3.getBytes();
		System.out.println(arr1.length==arr2.length);
		String msg5="가";
		char[] arr3=msg5.toCharArray();
		byte[] arr4=msg5.getBytes();
		//byte -128~127 256
		System.out.println(arr4.length);
		
	}

}
