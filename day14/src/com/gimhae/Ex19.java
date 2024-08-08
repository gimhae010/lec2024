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
		// �л������������α׷� (0.10.0)
		// IO - ������ ����۽� ������ ����
		// 1.���� 2. �Է� (3.����) 0.����>
		
		Scanner sc=new Scanner(System.in);
		String title="�л������������α׷� (0.10.0)";
		String menu="1.���� 2. �Է� (3.����) 0.����>";
		String input=null;
		String data="";
		
		File file=new File("test19.txt");
		Reader fr=null;
		try {
			boolean newFile=file.createNewFile();
			if(newFile) {
				data+="---------------------------------------------\n";
				data+="�й�\t�̸�\t����\t����\t����\n";
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
				System.out.print("�й�>");
				input=sc.nextLine();
				data+=input+"\t";
				System.out.print("�̸�>");
				input=sc.nextLine();
				data+=input+"\t";
				System.out.print("����>");
				input=sc.nextLine();
				data+=input+"\t";
				System.out.print("����>");
				input=sc.nextLine();
				data+=input+"\t";
				System.out.print("����>");
				input=sc.nextLine();
				data+=input+"\n";
			}
			if(input.equals("1")) {
				System.out.println(data);
			}
		}
	}

}













