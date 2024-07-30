package com.gimjae;


// 상속
// 부모의 기능을 물려받는 것
// 단일 상속(다중상속을 지원하지 않음)
// class 클래스명 extends 부모클래스{}
// 모든 클래스는 상속으로 이루어짐
// extends 부모가 코드명세가 없을시 java.lang.Object
// 부모 -> 자식으로 상속
class Parent extends Object{
	public int money=1000;
	public void how() {
		System.out.println(this.money+"원 있음");
	}
}

class Child extends Parent{
	public int money=100;
	public void func02() {
		System.out.println("자식만의 기능...");
	}
	// 오버로드(생성자,메서드) 오버라이드의 차이는 무엇인가?
	// 오버로드-이름의중복,원칙적불가,일부허용,파라미터,유무,갯수,타입,순서
	// 메서드 오버라이드(오직 메서드만..)
	// 상속에서 부모로부터 물려받은 기능을 제정의 해서 사용
	@Override// 어노테이션
	public void how() {
		System.out.println("돈없음");
	}
}


public class Ex01 extends Object {

	public static void main(String[] args) {
		Child me2=new Child();
		me2.how();
		me2.func02();
		
		Ex01 me=new Ex01();
		System.out.println(me);
		System.out.println(me.toString());
	}
	
	@Override
	public String toString() {
		return "내가 제정의";
	}

}










