package com.gimhae;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("test06.bin");
		InputStream is=new FileInputStream(f);
		Scanner sc=new Scanner(is);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}

}









