package com.gimhae;
//�͸�Ŭ���� anonymous class
interface Inter{
	void func();
}
public class Ex05 {
	int su=1111;
	static Inter local=new Inter(){
		public void func() {
			System.out.println("����");
		}
	};
	

	public static void main(String[] args) {
		local.func();
//		Inter local2=()->System.out.println("���ٽ�");
//		local2.func();
	}

}
