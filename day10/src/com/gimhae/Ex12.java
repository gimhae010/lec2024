package com.gimhae;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Stu{
	final int num;
	String name="아무개";
	int kor,eng,math;
	
	public Stu(String num) {
		this(Integer.parseInt(num));
	}
	public Stu(int num) {
		this.num=num;
	}
	public void changeKor(String kor) {
		this.kor=Integer.parseInt(kor);
	}
	public void changeEng(String eng) {
		this.eng=Integer.parseInt(eng);
	}
	public void changeMath(String math) {
		this.math=Integer.parseInt(math);
	}
	public int sum() {
		return kor+eng+math;
	}
	public double avg() {
		return sum()*100/3/100.0;
	}
}

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String menu="1.목록 2.입력 3.수정 4.삭제 0.종료>";
		String title="학생성적관리프로그램(ver 0.8.0)";
		String input;
		List data=new ArrayList();
		System.out.println(title);
		while(true) {
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0"))break;
			if(input.equals("1")) {
				System.out.println("---------------------------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("---------------------------------------------------------");
				for(int i=0; i<data.size(); i++) {
					Stu stu=(Stu) data.get(i);
					System.out.println(stu.num+"\t"+stu.name+"\t"+stu.kor
							+"\t"+stu.eng+"\t"+stu.math+"\t"+stu.sum()+"\t"+stu.avg());
				}
				System.out.println("---------------------------------------------------------");
			}
			if(input.equals("2")) {
				System.out.print("학번>");
				input=sc.nextLine();
				Stu stu=new Stu(input);
				System.out.print("이름>");
				input=sc.nextLine();
				stu.name=input;
				System.out.print("국어>");
				input=sc.nextLine();
				stu.changeKor(input);
				System.out.print("영어>");
				input=sc.nextLine();
				stu.changeEng(input);
				System.out.print("수학>");
				input=sc.nextLine();
				stu.changeMath(input);
				data.add(stu);
			}
		}
		System.out.println("감사합니다");
	}

}














