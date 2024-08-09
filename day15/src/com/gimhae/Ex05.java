package com.gimhae;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex05 {

	public static void main(String[] args) {
		File f=Ex04.f;
		
		InputStream is=null;
		byte[] buf=new byte[2];
		try {
			is=new FileInputStream(f);
			while(true) {
				int su=is.read(buf);
				if(su==-1)break;
				System.out.print(new String(buf));
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
