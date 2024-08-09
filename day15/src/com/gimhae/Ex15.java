package com.gimhae;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex15 {

	public static void main(String[] args) {
		File f=new File("test05.bin");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(
				OutputStream os=new FileOutputStream(f);
				DataOutputStream dos=new DataOutputStream(os);
				){
			dos.write(65);
			int su=1234;
			dos.writeInt(su);
			double su2=3.14;
			dos.writeDouble(su2);
			char su3='@';
			dos.writeChar(su3);
			boolean boo=true;
			dos.writeBoolean(boo);
			String msg="hello";
			dos.writeUTF(msg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}










