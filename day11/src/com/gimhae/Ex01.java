package com.gimhae;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// ���׸�
		// 1.5~
		// ���������� �ڷ����� ����
		// ���������� Ȯ��
		ArrayList list1=new ArrayList();
//		list1.add("���ڿ�");
//		list1.add(1234);
//		System.out.println(list1.get(0));
//		String msg1=(String) list1.get(0);
//		System.out.println(msg1);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
//		list2.add("���ڿ�");
		list2.add(1234);
		System.out.println(list2.get(0));
//		String msg2=list2.get(0);
//		System.out.println(msg2);
		int su=list2.get(0);
		System.out.println(su);
	}

}













