package com.gimhae;

public class Ex03 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 1.2.0)
		// 1.목록 2.입력 3.상세보기 0.종료>3
		// 학번> 1
		// 국어> 90
		// 영어> 80
		// 수학> 70
		// 합계> 000
		// 평균> 00.00 (소수둘째자리까지)
		// 학점> A(~90)
		// 학점> B(~80)
		// 학점> C(~70)
		// 학점> D(~60)
		// 학점> F(60미만)
		String title="학생성적관리프로그램(ver 1.2.0)";
		String menu="1.목록 2.입력 3.상세보기 0.종료>";
		String table="--------------------------------\n";
		table+="학번\t국어\t영어\t수학\n";
		table+="--------------------------------";
		
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		
		int input=-1;
		int cnt=0;
		System.out.println(title);
		System.out.print("총원>");
		input=sc.nextInt();
		int[][] data=new int[input][];
		while(true) {
			System.out.print(menu);
			input=sc.nextInt();
			if(input==0)break;
			if(input==1) {
				System.out.println(table);
				for(int i=0; i<data.length; i++) {
					if(i<cnt) {
						int[] stu=data[i];
						System.out.println(i+1+"\t"+stu[0]+"\t"+stu[1]+"\t"+stu[2]);
					}
				}
			}
			if(input==2&&cnt<data.length) {
				int[] stu=new int[3];
				System.out.print("국어>");
				stu[0]=sc.nextInt();
				System.out.print("영어>");
				stu[1]=sc.nextInt();
				System.out.print("수학>");
				stu[2]=sc.nextInt();
				data[cnt++]=stu;
			}
			if(input==3) {
				System.out.print("학번>");
				input=sc.nextInt();
				int[] stu=data[input-1];
				int sum=stu[0]+stu[1]+stu[2];
				double avg=sum*100/3/100.0;
				System.out.println("--------------------------------");
				System.out.println("국어:"+stu[0]+",영어:"+stu[1]+",수학:"+stu[2]);
				System.out.println("--------------------------------");
				System.out.println("합계:"+sum);
				System.out.println("평균:"+avg);
				System.out.println("--------------------------------");
				System.out.print("학점:");
				if(avg>=90)System.out.println("A");
				else if(avg>=80)System.out.println("B");
				else if(avg>=70)System.out.println("C");
				else if(avg>=60)System.out.println("D");
				else System.out.println("F");
				
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}

}













