package com.gimhae;

import java.io.File;

public class Ex07 {

	public static void main(String[] args) {
		File f=new File("test01/ex01.txt");
//		if(f.exists()) {
			boolean result=f.delete();
			System.out.println("�������ϴ�"+result);
//		}else {
//			System.out.println("�������� ����");
//		}
	}

}
