package com.gimhae.day49.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

//@Slf4j
@Component
@Aspect
public class LogAop {

	@AfterReturning(
			returning = "obj",
			pointcut = "execution(* com.gimhae.day49..*Impl.*(..))")
	public void afterSuccess(Object obj) {
//		log.debug("after");
		System.out.println(obj);
	}
}
