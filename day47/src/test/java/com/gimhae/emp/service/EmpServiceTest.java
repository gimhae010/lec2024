package com.gimhae.emp.service;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import com.gimhae.emp.model.EmpVo;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=true)
public class EmpServiceTest {
	static EmpService service;
	Model model;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context=null;
		context=new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		service=context.getBean(EmpService.class);
	}

	@Before
	public void setUp() throws Exception {
		model=new BindingAwareModelMap();
	}

	@Test
	public void test1() {
		assertNotNull(service);
	}
	
	@Test
	public void test2List() {
		service.list(model);
		Map<String, Object> map = model.asMap();
		Set<Entry<String, Object>> entrys = map.entrySet();
		for(Entry<String, Object> entry: entrys) {
			System.out.println(entry.getKey()+":"+entry.getValue().toString());
		}
	}

	@Transactional
	@Rollback(true)
	@Test
	public void test3One() {
		service.oneList(model,129);
		System.out.println(model.asMap().get("bean"));
	}
	
	@Test
	@Transactional
	@Rollback(true)
	public void test4Add() {
		EmpVo target=new EmpVo(130,0,"test",null);
		System.out.println(service.add(target));
	}
	
	@Test
	public void test5Edit() {
		//EmpVo [empno=6, pay=6666, ename=tester06]
		assertTrue(service.editList(new EmpVo(6,6666,"tester06",null)));
	}
	
	@Test
	public void test6Remove() {
		assertTrue(service.removeList(6));
	}
}















