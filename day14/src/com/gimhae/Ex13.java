package com.gimhae;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex13 {

	public static void main(String[] args) {
		File f=new File("target01.txt");
		java.io.InputStream is=null;
		try {
			is=new FileInputStream(f);
			while(true) {
				int su=is.read();
				if(su==-1)break;
				System.out.print((char)su);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
