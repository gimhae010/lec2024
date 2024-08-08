package com.gimhae;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex16 {

	public static void main(String[] args) {
		File f=new File("target01.txt");
		InputStream is=null;
		byte[] buf=new byte[(int) f.length()];
		try {
			is=new FileInputStream(f);
			int cnt=0;
			while(true) {
				int su=is.read();
				if(su==-1)break;
				buf[cnt++]=(byte) su;
			}
			System.out.println(new String(buf));
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
