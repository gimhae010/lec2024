package com.gimhae;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex17 {

	public static void main(String[] args) {
		File f=new File("test02.txt");
		// ���ڿ� ��Ʈ�� 2byte
		java.io.Writer fw=null;
		try {
			fw=new FileWriter(f);
			fw.write('��');
			fw.write('��');
			fw.write('��');
			fw.write(' ');
			fw.write('��');
			fw.write('��');
			fw.write('��');
			fw.write('��');
			System.out.println("�ۼ��Ϸ�");
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
