package com.gimhae;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex15 {

	public static void main(String[] args) {
		String msg="�ѱ� �Է�";
		byte[] arr1=msg.getBytes();
		File f=new File("target01.txt");
		// 1byte
		OutputStream os=null;
		try {
			os=new FileOutputStream(f);
			int i=0;
			for(i=0; i<arr1.length; i++) {
				os.write(arr1[i]);
			}
			System.out.println("�ۼ��Ϸ�"+i);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null)os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}

}
