package com.gimhae;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex06 {

	public static void main(String[] args) {
		File src=new File("test01.bin");
		File copy=new File("test02.bin");
		InputStream is=null;
		OutputStream os=null;
		byte[] buf=new byte[8];
		try {
			is=new FileInputStream(src);
			os=new FileOutputStream(copy);
			long before=System.currentTimeMillis();
			while(true) {
				int su=is.read(buf);
				System.out.println(su);
				if(su==-1)break;
				os.write(buf,0,su);
			}
			long after=System.currentTimeMillis();
			//No buffer - 14528ms -> 14.528초
			// 2 buffer - 7607ms
			System.out.println("복사완료:"+(after-before)+"ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null)os.close();
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}









