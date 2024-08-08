package com.gimhae;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex18 {

	public static void main(String[] args) {
		File f=new File("test02.txt");
		java.io.Reader fr=null;
		try {
			fr=new FileReader(f);
			while(true) {
				int su=fr.read();
				if(su==-1)break;
				System.out.println((char)su);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null)fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
