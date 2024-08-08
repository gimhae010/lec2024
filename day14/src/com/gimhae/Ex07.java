package com.gimhae;

import java.io.File;

public class Ex07 {

	public static void main(String[] args) {
		File f=new File("test01/ex01.txt");
//		if(f.exists()) {
			boolean result=f.delete();
			System.out.println("지웠습니다"+result);
//		}else {
//			System.out.println("존재하지 않음");
//		}
	}

}
