package com.gimhae;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class Ex08 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add(1111);
		list1.add(2222);
		list1.add(3333);
		list1.add(4444);
		LinkedList list2=new LinkedList(list1);
		System.out.println(list2);
		
		// 선형
		// 순서 맘대로
		// 순서 정해
		// 선입선출 FIFO (first-in-first-out)
		Queue list3=new LinkedList();
		list3.offer("첫번째");
		list3.offer("두번째");
		list3.offer("세번째");
		list3.offer("네번째");
		
//		while(list3.peek()!=null) {
//			System.out.println(list3.poll());
//		}
//		while(true) {
//			if(list3.peek()==null) break;
//			System.out.println(list3.peek());
//			list3.poll();
//		}
		Object obj;
		while((obj=list3.peek())!=null) {
			System.out.println(obj);
			list3.poll();
		}
		
	}

}













