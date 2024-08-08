package com.gimhae;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex20 {
	static File file=new File("test20.txt");
	static List<String[]> data=new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String title="학생성적관리프로그램 (0.10.1)";
		String menu="1.보기 2. 입력 (3.삭제) 0.종료>";
		String input=null;
		load();
		System.out.println(title);
		while(true) {
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0")) {save(); break;}
			if(input.equals("1")) {
				System.out.println("-----------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학");
				System.out.println("-----------------------------------------");
				for(int i=0; i<data.size(); i++) {
					String[] stu=data.get(i);
					System.out.println(stu[0]+"\t"+stu[1]+"\t"+stu[2]+"\t"+stu[3]+"\t"+stu[4]);
				}
				System.out.println("-----------------------------------------");
			}
			if(input.equals("2")) {
				String[] stu=new String[5];
				System.out.print("학번>");
				stu[0]=sc.nextLine();
				System.out.print("이름>");
				stu[1]=sc.nextLine();
				System.out.print("국어>");
				stu[2]=sc.nextLine();
				System.out.print("영어>");
				stu[3]=sc.nextLine();
				System.out.print("수학");
				stu[4]=sc.nextLine();
				data.add(stu);
			}
		}
	}
	public static void load() {
		String msg="";
		Reader fr=null;
		try {
			fr=new FileReader(file);
			while(true) {
				int su=fr.read();
				if(su==-1)break;
				msg+=(char)su;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr!=null)fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String[] stus=msg.split("\n");
		for(int i=0; i<stus.length; i++) {
			String[] stu=stus[i].split("@");
			data.add(stu);
		}
	}
	public static void save() {
		Writer fw=null;
		try {
			fw=new FileWriter(file);
			for(int i=0; i<data.size(); i++) {
				String[] stu=data.get(i);
				for(int j=0; j<stu.length; j++) {
					if(j!=0)fw.write('@');
					String msg=stu[j];
					for(int k=0; k<msg.length(); k++) {
						fw.write(msg.charAt(k));						
					}
				}
				fw.write('\n');
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
	}

}










