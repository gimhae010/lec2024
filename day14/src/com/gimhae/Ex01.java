package com.gimhae;

public class Ex01 {

	public static void main(String[] args) {
		// ����ó��
		// ���� - ������ �߻��Ҽ� �ִ� ��Ȳ ȸ��
		// try{���ܰ� �߻��Ҽ� �ִ� ����}catch(exception e){ó��}
		int c=0;
		int a=4;
		int b=0;
//		if(b!=0)
//			c=a/b;
//		else c=0;
		try {
			c=a/b;
		}catch(ArithmeticException e){//�߻��ϸ�
			c=0;
		}
		System.out.println(a+"��"+b+"="+c);
		System.out.println("main end");
	}

}
