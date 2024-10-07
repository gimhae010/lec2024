package com.gimhae.day48.emp.model;

import java.util.List;

public interface EmpDao {

	List<EmpVo> pullList();

	void addList(EmpVo bean);

	EmpVo getList(int empno);

	int setList(EmpVo bean);

	int rmList(int empno);
}