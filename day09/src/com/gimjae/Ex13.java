package com.gimjae;

public class Ex13 {

	public static void main(String[] args) {
		// 로또번호 생성기(ver 0.1.0)
		// 1,6,24,32,41,45
		// 토요일 저녁9시 전 mbc
		// 1~45
		int[] lotto;
		int limit=45;
		lotto=new int[limit];
		for(int i=0; i<limit; i++) {
			lotto[i]=i+1;
		}
		System.out.println(java.util.Arrays.toString(lotto));
		int su=0;
		int temp=0;
		for(int i=0; i<10000; i++) {
			su=new Double(Math.random()*limit).intValue();
			temp=lotto[0];
			lotto[0]=lotto[su];
			lotto[su]=temp;
		}
		for(int i=0; i<6; i++) {
			System.out.println(lotto[i]);
		}
		// 요구사항
		// 1. 랜덤한 숫자를 뽑는다(1~45)
		// 2. 중복검사
		// 3. 정렬
	}

}
















