package com.gimhae.aop;

import org.springframework.aop.ThrowsAdvice;

public class AfterErrLog implements ThrowsAdvice{

	public void afterThrowing(Exception ex) {
		System.out.println("에러처리");
	}
}
