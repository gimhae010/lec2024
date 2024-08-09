package com.gimhae;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex19 {

	public static void main(String[] args) {
		File f=new File("test06.bin");
		String msg=null;
		try (
			Reader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);	
				){
			while((msg=br.readLine())!=null) {
				System.out.println(msg);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
