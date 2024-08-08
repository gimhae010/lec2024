package com.gimhae;

import java.io.File;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		java.io.File file;
		//상대경로
//		file=new File("./src/com/gimhae");
		// 절대경로
		file=new File("C:\\");
//		file=new File("C:\\workspace\\day14\\ex01.txt");
//		file=new File("C:\\workspace\\day14\\.\\ex01.txt");
		if(file.exists()) {
		System.out.println("디렉토리"+file.isDirectory());
		System.out.println("파일"+file.isFile());
		
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
		System.out.println("------------------------");
		System.out.println(file.getParent());
		System.out.println(file.getName());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());
		System.out.println(file.length()+"byte");
		System.out.println(new java.util.Date(file.lastModified()));
		if(file.isDirectory()) {
			String[] ex=file.list();
			System.out.println(java.util.Arrays.toString(ex));
		}
		
		}
	}

}














