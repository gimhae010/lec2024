package com.gimhae;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Stu implements Comparable<Stu>{
	//학번순
	int num;
	String name;
	int kor,eng,math;
	@Override
	public int compareTo(Stu o) {
		return o.num-this.num;
//		return (o.kor+o.eng+o.math)-(this.kor+this.eng+this.math);
	}
	
}

public class Ex14 {
	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.8.0)
		// 1.보기(오른차순, 내림차순) 2.입력 3.수정 4.삭제 0.종료>
		// Set
		Scanner sc=new Scanner(System.in);
		Set<Stu> data=new TreeSet<Stu>();
		String title="학생성적관리프로그램(ver 0.8.0)";
		String menu="1.보기(오른차순, 내림차순) 2.입력 3.수정 4.삭제 0.종료>";
		String input="";
		while(true) {
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0"))break;
			if(input.equals("1")) {
				System.out.println("-------------------------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학");
				System.out.println("-------------------------------------------------------");
				Iterator<Stu> ite = data.iterator();
				while(ite.hasNext()) {
					Stu stu=ite.next();
					System.out.println(stu.num+"\t"+stu.name+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.math);					
				}
				System.out.println("-------------------------------------------------------");
				System.out.println("-------------------------------------------------------");
			}
			if(input.equals("2")) {
				Stu stu=new Stu();
				System.out.print("학번>");
				stu.num=Integer.parseInt(sc.nextLine());
				System.out.print("이름>");
				stu.name=sc.nextLine();
				System.out.print("국어>");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print("영어>");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print("수학>");
				stu.math=Integer.parseInt(sc.nextLine());
				data.add(stu);
			}
			if(input.equals("3")) {
				Stu stu=new Stu();
				System.out.print("학번>");
				stu.num=Integer.parseInt(sc.nextLine());
				System.out.print("이름>");
				stu.name=sc.nextLine();
				System.out.print("국어>");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print("영어>");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print("수학>");
				stu.math=Integer.parseInt(sc.nextLine());
				boolean result=data.add(stu);
				if(result==false) {
					Iterator<Stu> ite = data.iterator();
					Stu stu2=null;
					//1.
//					Stu target=null;
//					while(ite.hasNext()) {
//						stu2=ite.next();
//						if(stu2.num==stu.num) {target=stu2;break;}
//					}
//					data.remove(target);
//					data.add(stu);
					//2.
					while(ite.hasNext()) {
						stu2=ite.next();
						stu2.name=stu.name;
						stu2.kor=stu.kor;
						stu2.eng=stu.eng;
						stu2.math=stu.math;
					}
				}
			}
			if(input.equals("4")) {
				System.out.print("학번>");
				int num=Integer.parseInt(sc.nextLine());
				Iterator<Stu> ite = data.iterator();
				Stu target=null;
				Stu stu=null;
				while(ite.hasNext()) {
					stu=ite.next();
					if(stu.num==num) {target=stu;break;}
				}
				if(target!=null)data.remove(target);
			}
		}
		System.out.println("감사합니다");
	}
	
}



























