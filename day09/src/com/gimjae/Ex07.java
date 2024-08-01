package com.gimjae;

public class Ex07 {
	public static void main(String[] args) {
		char ch1=65;
		Character ch2=new Character(ch1);
		Character ch3=new Character((char)97);
		Character ch4=new Character('a');
		
		char ch5='%';
		System.out.println("자바에서사용가능문자냐"+Character.isDefined(ch5));
		System.out.println("언어문자냐"+Character.isLetter(ch5));
		System.out.println("언어문자냐"+Character.isJavaLetter(ch5));
		System.out.println("언어문자냐"+Character.isAlphabetic(ch5));
		System.out.println("숫자냐"+Character.isDigit(ch5));
		System.out.println("공백이냐"+Character.isSpace(ch5));
		System.out.println("공백이냐"+Character.isWhitespace(ch5));
		System.out.print("유닉스\n");
		System.out.print("윈도우\r\n");
		System.out.println(ch3);
	}
}
