package com.gimhae;

import java.io.File;

public class Ex09 {

	public static void main(String[] args) {
		File f=new File("test01");
		
		boolean result=f.mkdir();
		if(result) System.out.println("��������ϴ�");
		else System.out.println("�����մϴ�");

	}

}
