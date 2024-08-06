package com.gimhae;


/*
 * 내부 클래스
 * 클래스 내부에 존재하는 클래스
 * 4가지 형식
 * 1.스태틱 클래스(static inner class) static class
 * 2.인스턴스클래스(non-static inner class) instance class
 * 3.지역클래스 local class
 * 4.익명클래스 anonymous class
 * 
 * */
public class Ex01 {
	
	//1.
	static class Lec01{}
	
	//2.
	class Lec02{}
	
	//3.
	public void func01() {
		class Lec03{}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
