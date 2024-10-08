package com.gimhae.day49.dept.model;

import java.util.List;

public interface DeptDao {
	List<DeptVo> fullList();
	DeptVo getList(int idx);
	void addList(DeptVo bean);
	int setList(DeptVo bean);
	int rmList(int idx);
}
