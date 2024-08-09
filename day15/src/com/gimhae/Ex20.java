package com.gimhae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Ex20 {

	public static void main(String[] args) {
		PrintStream myout = System.out;
		myout.println("Ãâ·Â");
		InputStream myin = System.in;
		
		try(
		InputStreamReader isr=new InputStreamReader(myin);
		BufferedReader br=new BufferedReader(isr	);	
				){
			
			System.out.println(br.readLine());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
