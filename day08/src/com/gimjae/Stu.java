package com.gimjae;

public class Stu{
	static int cnt;
	int num;
	String name;
	int kor,eng,math;
	
	public Stu() {
		num=++cnt;
	}
	int getTot() {
		return kor+eng+math;
	}
	double getAvg() {
		return getTot()*100/3/100.0;
	}
}
