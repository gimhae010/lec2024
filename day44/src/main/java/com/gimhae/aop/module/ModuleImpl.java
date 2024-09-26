package com.gimhae.aop.module;

public class ModuleImpl implements Module {
	int su=1234;

	public void func01() {
		System.out.println("func01 run...");
	}
	public void func02(String msg) {
		System.out.println(msg+this.su);
		System.out.println(this);
	}
	public void func03(String msg, int su) {
		System.out.println(msg+su);
	}
	public String func04() {
		System.out.println("func04..");
		return "success...";
	}
	public void func05(int a, int b) {
		System.out.println("func05 before..");
		int su=a/b;
		System.out.println("func05 after.."+su);
	}

}
