package com.gimhae;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex16 {

	public static void main(String[] args) {
		File f=new File("test05.bin");

		try(
				InputStream is=new FileInputStream(f);
				DataInputStream dis=new DataInputStream(is);
				){
			int su=dis.read();
			int su2=dis.readInt();
			double su3=dis.readDouble();
			char su4=dis.readChar();
			boolean boo=dis.readBoolean();
			String msg=dis.readUTF();
			
			System.out.println(su);
			System.out.println(su2);
			System.out.println(su3);
			System.out.println(su4);
			System.out.println(boo);
			System.out.println(msg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}








