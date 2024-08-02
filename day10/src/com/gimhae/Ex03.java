package com.gimhae;

public class Ex03 {

	public static void main(String[] args) {
		// 배열을 사용한 동적할당
		// 이론 - Read유리 Create,Update,Delete불리
		
		java.util.List list;
		list=new java.util.LinkedList();
		list.add("첫번째");
		list.add("두번째");
		list.add("첫번째");
		list.add("세번째");
		list.add("첫번째");

		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
