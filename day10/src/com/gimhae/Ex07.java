package com.gimhae;

import java.util.ArrayList;

public class Ex07 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add(1111);
		list1.add(2222);
		list1.add("¼¼¹øÂ°");
		list1.add(true);
		list1.add(new Ex07());
		ArrayList list2=new ArrayList(10);
		ArrayList list3=new ArrayList(list1);
		System.out.println(list1);
		System.out.println(list3);
		System.out.println(list1==list3);
		java.util.List list4=list1.subList(0, list1.size());
		System.out.println(list4);
		System.out.println(list1==list4);
//		list2.addAll(list1);
		list2.add(3333);
		list2.add(4444);
		list2.add(5555);
		list2.addAll(2,list1);
		System.out.println(list2);
		System.out.println(list1==list2);
		ArrayList list5=(ArrayList)list1.clone();
		System.out.println(list5);
		
		int su=(int)list1.get(1);
		System.out.println(su);
	}

}








