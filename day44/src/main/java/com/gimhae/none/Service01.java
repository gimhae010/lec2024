package com.gimhae.none;

public class Service01 {
	//������ ����(dependency injection)
	Module module;

	public Service01() {
	}
	
	// ������ ����
	public Service01(Module module) {
		this.module=module;
	}

	// ���� ����
	public void setModule(Module module) {
		this.module = module;
	}

	public void serv01() {
//		Module03 module=new Module03();
		module.func01();
	}
}
