package com.gimjae;

class Parent03{
	public void func01() {
		System.out.println("�θ��� ���1");
	}
	public void func02() {
		System.out.println("�θ��� ���2");
	}
}
class Child03 extends Parent03{
	public void func02() {
		System.out.println("�ڽ��� �������� ���");
	}
	public void func03() {
		System.out.println("�ڽĸ��� ���");
	}
}
public class Ex03 {

	public static void main(String[] args) {
		Parent03 p1=new Parent03();
		p1.func01();
		p1.func02();
//		p1.func03(); �Ұ�
		System.out.println("--------------------");
		Child03 ch1=new Child03();
		ch1.func01();
		ch1.func02();
		ch1.func03();
		System.out.println("--------------------");
//������		
		Parent03 p2;
		p2=new Child03();
		
		p2.func01();
		p2.func02();
//		p2.func03(); �Ұ�
	}

}










