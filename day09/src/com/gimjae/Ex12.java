package com.gimjae;

public class Ex12 {

	public static void main(String[] args) {
		// 16 -> 34 -> 70 -> 142
		StringBuffer sb=new StringBuffer(6);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("------------------------");
		for(int i=0; i<70; i++)
		sb.append("a");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("------------------------");
		sb.append("b");
		sb.trimToSize();
		System.out.println(sb.length());
		System.out.println(sb.capacity());

	}

}
