package com.gimhae;

import java.util.Date;

public class Ex04 {

	public static void main(String[] args) {
		long a1=System.currentTimeMillis();	// 1970 1 1
		java.util.Date d1=new Date(a1);		// 1900 1 1 기준
//		d1.setYear(2025-1900);
//		d1.setMonth(5-1);
		System.out.println(d1.toString());
		System.out.println(d1.getYear()+"년\t"+(1900+d1.getYear())+"년");
		System.out.println(d1.getMonth()+"월\t"+(1+d1.getMonth())+"월");
		System.out.println(d1.getDate()+"일");
		System.out.println(d1.getDay()+"요일");// 0~6
		System.out.println(d1.getHours()+"시");
		System.out.println(d1.getMinutes()+"분");
		System.out.println(d1.getSeconds()+"초");
		long a2=d1.getTime();
	}

}
