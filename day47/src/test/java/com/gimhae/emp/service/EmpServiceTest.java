package com.gimhae.emp.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpServiceTest {
	static EmpService service;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context=null;
		context=new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		service=context.getBean(EmpService.class);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertNotNull(service);
	}

}
