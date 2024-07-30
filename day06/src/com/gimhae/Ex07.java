package com.gimhae;

public class Ex07 {

	public static void main(String[] args) {
		// 배열복사
		
		// 배열의 복사
		int[] arr1=new int[] {1,3,5,7};
		int[] arr2=arr1;//얕은 복사
//		// 깊은 복사
//		int[] arr2=new int[arr1.length];
//		for(int i=0; i<arr1.length; i++) {
//			arr2[i]=arr1[i];
//		}
		arr1[2]=6;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+",");
		}

	}

}
