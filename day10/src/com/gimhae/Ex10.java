package com.gimhae;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.6.0)
		// 1.목록 2.입력 3.수정 4.삭제 0.종료>
		Scanner sc=new Scanner(System.in);
		String menu="1.목록 2.입력 3.수정 4.삭제 0.종료>";
		System.out.println("학생성적관리프로그램(ver 0.6.0)");
		List data=new ArrayList();
		String input;
		while(true) {
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0"))break;
			if(input.equals("1")) {
				System.out.println("------------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학");
				System.out.println("------------------------------------------");
				for(int i=0; i<data.size();i++) {
					if((i+1)%5==0)System.out.println(data.get(i));//4,9,14
					else System.out.print(data.get(i)+"\t");
				}
				System.out.println("------------------------------------------");
			}
			if(input.equals("2")) {
				System.out.print("학번>");
				input=sc.nextLine();
				data.add(input);
				System.out.print("이름>");
				input=sc.nextLine();
				data.add(input);
				System.out.print("국어>");
				input=sc.nextLine();
				data.add(input);
				System.out.print("영어>");
				input=sc.nextLine();
				data.add(input);
				System.out.print("수학>");
				input=sc.nextLine();
				data.add(input);
			}
			if(input.equals("4")) {
				System.out.print("삭제할 학번>");
				input=sc.nextLine();
				for(int i=0; i<data.size(); i+=5) {
					if(input.equals(data.get(i))) {
						data.remove(i);
						data.remove(i);
						data.remove(i);
						data.remove(i);
						data.remove(i);
					}
				}
			}
		}
		System.out.println("감사합니다");
	}

}









