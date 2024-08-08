package com.gimhae;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/*
 * 
 *>C:\workspace\day14
 * 
rwx  오전 11:40    <DIR>          .
rwx  오전 09:03    <DIR>          ..
rwx  오전 09:03               301 .classpath
rwx  오전 09:03               381 .project
rwx  오전 09:03    <DIR>          .settings
r-x  오전 09:03    <DIR>          bin
rwx  오전 09:03    <DIR>          src
 * 
 * 
 * 
 * 
 * */
public class Ex11 {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print(">");
		String input=args[0];
		File f=new File(input);
		String[] list=f.list();
		String path=null;
		try {
			path=f.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i=0; i<list.length; i++) {
			String msg=list[i];
			show(path+"\\"+msg);
		}

	}
	
	public static void show(String input) {
		File f=new File(input);
		if(f.exists()) {
			if(f.canRead())System.out.print("r");
			else System.out.print("-");
			if(f.canWrite())System.out.print("w");
			else System.out.print("-");
			if(f.canExecute())System.out.print("x");
			else System.out.print("-");
			System.out.print("\t");
			Date day=new Date(f.lastModified());
			String time=day.toString().split(" ")[3];
			//Tue Aug 06 15:06:26 KST 2024
			System.out.print(time);
			System.out.print("\t");
			if(f.isDirectory())System.out.print("<DIR>");
			else System.out.print("\t");
			System.out.print("\t");
			if(f.isFile())System.out.print(f.length());
			else System.out.print("\t");
			System.out.print("\t");
			System.out.println(f.getName());
		}
	}

}














