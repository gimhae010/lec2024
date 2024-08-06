package com.gimhae;
//익명클래스 anonymous class
interface Inter{
	void func();
}
public class Ex05 {
	int su=1111;
	static Inter local=new Inter(){
		public void func() {
			System.out.println("실행");
		}
	};
	

	public static void main(String[] args) {
		local.func();
//		Inter local2=()->System.out.println("람다식");
//		local2.func();
	}

}
