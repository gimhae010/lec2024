package com.gimhae;

/*
 * 학생성적관리프로그램(ver 0.1.0)
 * 
 * 총원>3
 * 
 * 1.보기 2.입력 0.종료> 1
 * ---------------------------------
 * 학번	|국어	|영어	|수학
 * ---------------------------------
 * ---------------------------------
 * 1.보기 2.입력 0.종료> 2
 * 국어>90
 * 영어>80
 * 수학>70
 * 
 * 1.보기 2.입력 0.종료> 1
 * ---------------------------------
 * 학번	|국어	|영어	|수학
 * ---------------------------------
 * 1	|90		|80		|70
 * ---------------------------------
 * 1.보기 2.입력 0.종료> 2
 * 국어>92
 * 영어>82
 * 수학>72
 * 
 * 1.보기 2.입력 0.종료> 1
 * ---------------------------------
 * 학번	|국어	|영어	|수학
 * ---------------------------------
 * 1	|90		|80		|70
 * 2	|92		|82		|72
 * ---------------------------------
 * 1.보기 2.입력 0.종료> 2
 * 국어>93
 * 영어>83
 * 수학>73
 * 
 * 1.보기 2.입력 0.종료> 1
 * ---------------------------------
 * 학번	|국어	|영어	|수학
 * ---------------------------------
 * 1	|90		|80		|70
 * 2	|92		|82		|72
 * 3	|93		|83		|73
 * ---------------------------------
 * 1.보기 2.입력 0.종료> 2
 * 더이상 입력할 학생이 없습니다
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

public class Ex08 {

	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램(ver 0.1.0)");
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		
		int input=0;
		System.out.print("총원>");
		int cnt=sc.nextInt();
		int[][] datas=new int[cnt][];
		cnt=0;
		while(true) {
			System.out.print("1.보기 2.입력 0.종료> ");
			input=sc.nextInt();
			if(input==0)break;
			if(input==1) {
				System.out.println("---------------------------------\r\n" + 
						"학번	|국어	|영어	|수학\r\n" + 
						"---------------------------------");
				for(int i=0; i<cnt; i++) {
					int[] data=datas[i];
					System.out.println(i+1+"\t"+data[0]+"\t"+data[1]+"\t"+data[2]);
				}
				System.out.println("---------------------------------");
			}
			if(input==2 && cnt!=datas.length) {
				int[] data=new int[3];
				System.out.print("국어>");
				data[0]=sc.nextInt();
				System.out.print("영어>");
				data[1]=sc.nextInt();
				System.out.print("수학>");
				data[2]=sc.nextInt();
				datas[cnt]=data;
				cnt++;
			}else if(input==2) {
				System.out.println("더이상 입력할 학생이 없습니다");
			}
			
			
		}
		System.out.println("이용해주셔서 감사합니다");
	}

}












