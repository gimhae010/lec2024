package com.gimhae;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.omg.CORBA.Principal;

public class Ex17 {

	public static void main(String[] args) {
		File f=new File("test06.bin");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(
			OutputStream os=new FileOutputStream(f);
			PrintStream ps=new PrintStream(os);	
				){
			ps.write(65);
			ps.println(true);
			ps.println(1234);
			ps.println(3.14);
			ps.println("hello world");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}










