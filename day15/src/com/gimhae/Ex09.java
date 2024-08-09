package com.gimhae;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex09 {

	public static void main(String[] args) {
		File f=new File("test02.bin");
		String msg="한글로 작성해도 결과는 동일";
		byte[] msgs=msg.getBytes();
		OutputStream os=null;
		BufferedOutputStream bos=null;
		
		try {
			os=new FileOutputStream(f);
			bos=new BufferedOutputStream(os);
			
			for(int i=0; i<msgs.length; i++) {
				bos.write(msgs[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos!=null)bos.close();
				if(os!=null)os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
