package com.gimhae;

import java.util.Iterator;

public class Ex09 {

	public static void main(String[] args) {
		// (이론)순서가없는
		// 중복불가
		java.util.Set<String> set=new java.util.HashSet<>();
		set.add("첫번째");
		set.add("두번째");
		set.add("세번째");
		set.add("두번째");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String msg=ite.next();
			System.out.println(msg);
		}
	}

}
