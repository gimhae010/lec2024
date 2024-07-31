package com.gimjae;


// 인터페이스-추상메서드만 갖는...
interface Inter01{
	public static final int su1=1111;
	public static int su2=2222;
	public int su3=3333;
	int su4=4444;
	
	public abstract void func01();
	public void func02();
	void func03();
	
}

public class Ex05 extends Object implements Inter01 {

	public static void main(String[] args) {
		Ex05 me=new Ex05();
		Object me3=new Ex05();
		Inter01 me2=new Ex05();
		me2.func01();
		me2.func02();
		me2.func03();
	}

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func03() {
		// TODO Auto-generated method stub
		
	}

}










