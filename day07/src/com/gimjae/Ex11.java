package com.gimjae;

/*
 * 학생성적관리프로그램(ver 1.3.0)
 * 1.목록 2.입력 3.수정 4.삭제 0.종료>1
 * ------------------------------------
 * 학번 |이름	|국어 |영어 |수학
 * ------------------------------------
 *  
 * 1.목록 2.입력 3.수정 4.삭제 0.종료>2
 * 학번> 1
 * 성명> 홍길동
 * 국어> 90
 * 영어> 80
 * 수학> 70
 * 
 * 1.목록 2.입력 3.수정 4.삭제 0.종료>2
 * 학번> 1
 * 존재하는 학번입니다
 * 
 * 1.목록 2.입력 3.수정 4.삭제 0.종료>3
 * 학번> 1
 * 삭제되었습니다.
 * 
 * 1.목록 2.입력 3.수정 4.삭제 0.종료>3
 * 학번> 1
 * 존재하지 않습니다
 * 
 * 
 * 
 * 
 * */


public class Ex11 {

	public static void main(String[] args) {
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		
		String menu="1.목록 2.입력 3.수정 4.삭제 0.종료>";
		System.out.println("학생성적관리프로그램(ver 1.3.0)");
		String input=null;
		
		System.out.print("총원>");
		input=sc.nextLine();
		String[][] data=new String[Integer.parseInt(input)][];
		int cnt=0;
		while(true) {
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0"))break;
			
			if(input.equals("1")) {
				System.out.println("---------------------------------------------------");
				System.out.println("학번\t|이름\t\t|국어\t|영어\t|수학");
				System.out.println("---------------------------------------------------");
				for(int i=0; i<data.length; i++) {
					if(data[i]==null)continue;
					System.out.println(
							data[i][0]+"\t|"+data[i][1]+"\t\t|"+data[i][2]
									+"\t|"+data[i][3]+"\t|"+data[i][4]
							);
				}
				System.out.println("---------------------------------------------------");
				
			}else if(input.equals("2")&&cnt<data.length) {
				String[] stu=new String[5];
				System.out.print("학번>");
				input=sc.nextLine();
				stu[0]=input;
				System.out.print("이름>");
				input=sc.nextLine();
				stu[1]=input;
				System.out.print("국어>");
				input=sc.nextLine();
				stu[2]=input;
				System.out.print("영어>");
				input=sc.nextLine();
				stu[3]=input;
				System.out.print("수학>");
				input=sc.nextLine();
				stu[4]=input;
				data[cnt++]=stu;
			}else if(input.equals("4")) {
				System.out.print("삭제할 학번>");
				input=sc.nextLine();
				int idx=-1;
				for(int i=0; i<data.length; i++) {
					if(data[i][0].equals(input)) idx=i;
				}
				if(idx>-1) {
					data[idx]=null;
					System.out.println("삭제되었습니다.");
				}else {
					System.out.println("존재하는 학번입니다");
				}
			}else if(input.equals("3")) {
				System.out.print("수정할 학번>");
				input=sc.nextLine();
				int idx=-1;
				for(int i=0; i<data.length; i++) {
					if(data[i][0].equals(input))idx=i;
				}
				if(idx==-1) {
					System.out.println("존재하는 학번입니다");
				}else {
					System.out.print("이름>");
					data[idx][1]=sc.nextLine();
					System.out.print("국어>");
					data[idx][2]=sc.nextLine();
					System.out.print("영어>");
					data[idx][3]=sc.nextLine();
					System.out.print("수학>");
					data[idx][4]=sc.nextLine();
				}
			}
			
		}
		System.out.println("이용해주셔서 감사합니다");
	}

}






















