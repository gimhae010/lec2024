package com.gimhae;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Lotto implements java.lang.Comparable<Lotto>{
	final int num;
	String color;
	public Lotto(int num) {
		this.num=num;
		if(num<10)color="흰색";
		else if(num<20)color="검정색";
		else if(num<30)color="파랑색";
		else if(num<40)color="노랑색";
		else color="주황색";
	}
	@Override
	public int compareTo(Lotto o) {
		return this.num-o.num;
	}
	@Override
	public String toString() {
		return color+num+"번 공";
	}
}

public class Ex13 {

	public static void main(String[] args) {
		// 로또번호 생성기(ver 0.4.0)

		// 1~45랜덤한 6개의 중복되지 않는 번호
		
		Set lotto=new TreeSet();
		while(lotto.size()<6)
			lotto.add(new Lotto((int)(Math.random()*45)+1));
		System.out.println(lotto);
	}

}
