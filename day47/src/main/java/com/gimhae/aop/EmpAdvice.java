package com.gimhae.aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class EmpAdvice {
	Logger log=Logger.getLogger(EmpAdvice.class);

	public void before(JoinPoint join) {
		log.debug("before..Signature:"+join.getSignature().getName());
		log.debug("before..getArgs:"+Arrays.toString(join.getArgs()));
		log.debug("before..Target:"+join.getTarget());
//		log.debug("before..getClass:"+join.getClass());
//		log.debug("before..Signature:"+join.getSignature().getDeclaringType().getCanonicalName());
//		log.debug("before..This:"+join.getThis());
	}
	
	public void after(JoinPoint join) {
		log.debug("after..");
	}
	
	public void afterSuccess(JoinPoint join,Object val) {
		log.debug("return.."+val);
	}
	
	public void afterErr(JoinPoint join,Exception ex) {
		log.debug("error..");
	}
	
	public Object around(ProceedingJoinPoint jp) {
		String name=jp.getSignature().getName();
		String clzName=jp.getTarget().getClass().getCanonicalName();
		log.debug("around before.."+clzName+"."+name);
		Object obj=null;
		try {
			obj=jp.proceed();
			log.debug("around return..");
		} catch (Throwable e) {
			log.debug("around error..");
		}
		log.debug("around after..");
		return obj;
	}
}
















