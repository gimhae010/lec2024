package com.gimhae;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// 학생성적관리프로그램 (0.10.0)
		// IO - 종료후 재시작시 데이터 유지
		// 1.보기 2. 입력 (3.삭제) 0.종료>
		
		Scanner sc=new Scanner(System.in);
		String title="학생성적관리프로그램 (0.10.0)";
		String menu="1.보기 2. 입력 (3.삭제) 0.종료>";
		String input=null;
		String data="";
		
		File file=new File("test19.txt");
		Reader fr=null;
		try {
			boolean newFile=file.createNewFile();
			if(newFile) {
				data+="---------------------------------------------\n";
				data+="학번\t이름\t국어\t영어\t수학\n";
				data+="---------------------------------------------\n";
			}
			fr=new FileReader(file);
			while(true) {
				int su=fr.read();
				if(su==-1)break;
				data+=(char)su;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr!=null)fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(title);
		while(true) {
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0")) {
				Writer fw=null;
				char[] arr=data.toCharArray();
				try {
					fw=new FileWriter(file);
					for(int i=0; i<arr.length; i++) {
						fw.write(arr[i]);
					}
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if(fw!=null)fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				break;
			}
			if(input.equals("2")) {
				System.out.print("학번>");
				input=sc.nextLine();
				data+=input+"\t";
				System.out.print("이름>");
				input=sc.nextLine();
				data+=input+"\t";
				System.out.print("국어>");
				input=sc.nextLine();
				data+=input+"\t";
				System.out.print("영어>");
				input=sc.nextLine();
				data+=input+"\t";
				System.out.print("수학>");
				input=sc.nextLine();
				data+=input+"\n";
			}
			if(input.equals("1")) {
				System.out.println(data);
			}
		}
	}

}













