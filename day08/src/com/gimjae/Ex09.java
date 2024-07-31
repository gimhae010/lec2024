package com.gimjae;

public class Ex09 implements Cloneable{

	public static void main(String[] args) throws Exception {
		Ex09 me=new Ex09();
		Object obj=me.clone();
		System.out.println(me);
		System.out.println(obj);
	}

}
