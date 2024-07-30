package com.gimjae;

// 접근제한자
// public > protected >= default > private
// 필드,메서드,생성자
// 클래스에서 접근제한자
// 한문서상의 public class는 오직 하나만 존재
// 그리고 메인메서드를 갖는 클래스가 public
// 오직 public과 default만 존재

class Lec06{
	
	// 모든 접근 허용
	public void func01() {
		System.out.println("f1 public");
	}
	// 동일패키지내에서만 접근을 허용하나
	// 상속을 통해서는 모든 접근 허용
	protected void func02() {
		System.out.println("f2 protected");
	}
	// 동일패키지내에서만 접근을 허용
	void func03() {
		System.out.println("f3 default");
	}
	// 해당 클래스 내부에서만 접근 허용
	private void func04() {
		System.out.println("f4 private");
	}
}

public class Ex06 extends com.etc.Lec06{

	public static void main(String[] args) {
		com.gimjae.Lec06 lec=new com.gimjae.Lec06();
		lec.func01();
		lec.func02();
		lec.func03();
//		lec.func04();
		Ex06 me=new Ex06();
		me.func01();
		me.func02();
//		me.func03();
//		me.func04();
	}

}
