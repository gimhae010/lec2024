package com.gimhae;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex11 {
	public static void main(String[] args) {
		File f=new File("test03.txt");

		Reader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(f);
			br=new BufferedReader(fr);
			
			while(true) {
//				int su=br.read();
//				if(su==-1)break;
//				System.out.print((char)su);
				String msg=br.readLine();
				if(msg==null)break;
				msg+="\n";
				System.out.print(msg);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null)br.close();
				if(fr!=null)fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}









