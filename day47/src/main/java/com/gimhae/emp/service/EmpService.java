package com.gimhae.emp.service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.gimhae.emp.model.EmpVo;

//@Transactional
public interface EmpService {

	void list(Model model);

	int add(EmpVo bean);

	void oneList(Model model,int empno);

	boolean editList(EmpVo bean);

	boolean removeList(int empno);

}