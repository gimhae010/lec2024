package com.gimhae;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gimhae.service.Service01;
import com.gimhae.service.Service02;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac;
		ac=new ClassPathXmlApplicationContext("/applicationContext_aop.xml");
		
		Service02 service=ac.getBean(Service02.class);
		service.svc();
	}

}
