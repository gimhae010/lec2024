package com.gimhae.emp.model;

import java.util.List;

public interface EmpDao {

	List<EmpDto> pullList();

	EmpDto getList(int pk);

	void addList(String ename, int pay);

	int editList(String ename, int pay, int empno);

	int rmList(int pk);

}