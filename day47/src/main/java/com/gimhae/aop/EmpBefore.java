package com.gimhae.aop;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.springframework.aop.MethodBeforeAdvice;

public class EmpBefore{
//	implements MethodBeforeAdvice {
	
//	spring aop
//	@Override
//	public void before(Method method, Object[] args, Object target) throws Throwable {
	
//	aspect-Before
//	public void beforeTargetMethod(JoinPoint thisJoinPoint) {
	public void beforeTargetMethod() {
//		Logger log=Logger.getLogger(target.getClass());
//		log.debug("before..."+method.getName());
		System.out.println("before");
	}

}
