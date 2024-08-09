package com.gimhae;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex14 {

	public static void main(String[] args) {
		File f=new File("test04.txt");
		try(
		OutputStream os=new FileOutputStream(f);
		OutputStreamWriter osw=new OutputStreamWriter(os,"UTF-8");
		){
			osw.write("한글로 작성");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
