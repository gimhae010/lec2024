package com.gimhae;

public class Ex05 {

	public static void main(String[] args) {
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		
		/*
		 * 주민번호 체크(ver 0.1.0)
		 * 
		 * 주민번호> 991231-1234567
		 * 당신은 00세 남성입니다.
		 * ------------------------------------
		 * 주민번호> 1234561234567
		 * 다음의 출력포멧 000000-0000000으로 입력하세요
		 * 주민번호> 123456-123456
		 * 입력자리수가 부족합니다
		 * 주민번호> a12345-1234567
		 * 주민번호는 숫자로만 구성되어야 합니다
		 * 
		 */
		int age=0;
		char gender='남';
		System.out.println("주민번호 체크(ver 0.1.0)");
		String input="";
		char[] arr1;
		do {
			boolean[] boo= {true, true, true};
			System.out.print("주민번호> ");
			input=sc.nextLine();
			arr1=input.toCharArray();
			if(arr1[6]!='-')boo[0]=false;
			if(arr1.length!=14)boo[1]=false;
			// '0'<=숫자<='9'
			for(int i=0; i<arr1.length; i++) {
				if(i!=6) {
					if(arr1[i]<'0' || arr1[i]>'9')boo[2]=false;
				}
			}
			
			if(boo[0]&&boo[1]&&boo[2]) { 
				break;
			}else if(!boo[0]) {
				System.out.println("다음의 출력포멧 000000-0000000으로 입력하세요");
			}else if(!boo[1]) {
				System.out.println("입력자리수가 부족합니다");
			}else if(!boo[2]) {
				System.out.println("주민번호는 숫자로만 구성되어야 합니다");
			}
		}while(true);
		int year=1900+(arr1[0]-'0')*10+(arr1[1]-'0');
		
		if(arr1[7]%2=='2'%2) {gender='여';}
		
		age=2024-year+1;
		if(arr1[7]>'2') {age-=100;}
		System.out.println("당신은 "+age+"세 "+gender+"성입니다.");

	}

}











