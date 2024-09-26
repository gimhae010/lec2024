package com.gimhae.none;

public class Service01 {
	//狼粮己 林涝(dependency injection)
	Module module;

	public Service01() {
	}
	
	// 积己磊 林涝
	public Service01(Module module) {
		this.module=module;
	}

	// 技磐 林涝
	public void setModule(Module module) {
		this.module = module;
	}

	public void serv01() {
//		Module03 module=new Module03();
		module.func01();
	}
}
