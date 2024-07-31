package com.gimjae;

class Stu{
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

public class Ex14 {

	public static void main(String[] args) {
		String menu="1.보기 2.입력 3.수정 4.삭제 0.종료>";
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		System.out.println("학생성적관리프로그램(ver 1.4.0)");
		int tot=3;
		String input=null;
		Stu[] data=new Stu[tot];
		int cnt=0;
		while(true) {
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0"))break;
			if(input.equals("1")) {
				System.out.println("--------------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|합계\t|평균");
				System.out.println("--------------------------------------------------");
				for(int i=0; i<data.length; i++) {
					Stu stu=data[i];
					if(stu!=null) {
						System.out.println(stu.num+"\t|"+stu.name+"\t|"+stu.kor+"\t|"
						+stu.eng+"\t|"+stu.math+"\t|"+stu.getTot()+"\t|"+stu.getAvg());
					}
				}
				System.out.println("--------------------------------------------------");
			}
			if(input.equals("2")) {
				Stu stu=new Stu();
				System.out.print("이름>");
				stu.name=sc.nextLine();
				System.out.print("국어>");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print("영어>");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print("수학>");
				stu.math=Integer.parseInt(sc.nextLine());
				data[cnt++]=stu;
			}
			if(input.equals("3")) {}
			if(input.equals("4")) {}
		}
		
	}
}
