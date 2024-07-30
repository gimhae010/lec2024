package com.gimhae;

public class Ex08 {

	public static void main(String[] args) {
		int[] arr1=new int[] {2,4,6,8};
		func(arr1);
		System.out.println("mainÃâ·Â");
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
	public static void func(int[] arr) {
		arr[1]=3;
	}

}
