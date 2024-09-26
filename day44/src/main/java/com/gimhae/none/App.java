package com.gimhae.none;

import com.gimhae.none.*;

public class App {

	public static void main(String[] args) {
		Module module=new Module03();
		Service01 service = new Service01();
		// IoC(Inversion of Control) 제어역전
		service.setModule(module);
		service.serv01();

	}

}
