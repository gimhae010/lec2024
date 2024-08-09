package com.gimhae;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

import org.omg.CORBA.Principal;

public class Ex18 {

	public static void main(String[] args) {
		File f=new File("test06.bin");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(
			Writer os=new FileWriter(f);
			PrintWriter ps=new PrintWriter(os);	
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










