package com.gimjae;

interface Inter02{
	void func01();
}

interface Inter03{
	void func02();
}

interface Inter04 extends Inter02{}
interface Inter05 extends Inter02,Inter03{}

interface Inter06{}

public class Ex06 implements Inter06{
	public static void main(String[] args) {
		
	}

}
