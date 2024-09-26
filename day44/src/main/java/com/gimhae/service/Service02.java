package com.gimhae.service;

import com.gimhae.aop.module.Module;

public class Service02 {

	private Module module;

	public Service02(Module module) {
		super();
		this.module = module;
	}

	public void svc() {
//		module.func01();
		module.func02("f2");
//		module.func03("f",3);
		String msg=module.func04();
		System.out.println(msg);
//		module.func05(4,0);
	}
}
