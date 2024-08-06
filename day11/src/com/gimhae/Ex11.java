package com.gimhae;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex11 {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("첫번째");
		set.add("두번째");
		set.add("세번째");
		set.add("두번째");
		List<String> list=new ArrayList<>(set);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
