package com.gimjae;

public class Ex10 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("java");
		sb.append("DB");
		sb.append("Web");
		sb.append("Spring");
		
		System.out.println(sb);
		//javaDBWebSpring
		sb.replace(4, 6, "DataBase");
		System.out.println(sb);
		//javaDataBaseWebSpring
		sb.delete(12, 15);
		System.out.println(sb);
		//javaDataBaseSpring
		sb.insert(12, "WEB");
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		char[] arr1=new char[sb.length()];
		sb.getChars(0, sb.length(), arr1, 0);
		System.out.println(java.util.Arrays.toString(arr1));
		System.out.println(sb.indexOf("Data"));
		sb.delete(4, sb.length());
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		sb.setCharAt(0, 'J');
		System.out.println(sb.toString());
		
		
	}

}
