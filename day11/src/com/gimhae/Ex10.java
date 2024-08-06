package com.gimhae;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex10 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1111);
		list.add(2222);
		list.add(2222);
		list.add(1111);
		System.out.println(list);
		Set<Integer> set=new HashSet<>(list);
		System.out.println(set);
		Iterator<Integer> ite = set.iterator();
		while(ite.hasNext())
			System.out.println(ite.next());
		

	}

}
