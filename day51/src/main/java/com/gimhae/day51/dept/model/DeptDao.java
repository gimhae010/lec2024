package com.gimhae.day51.dept.model;

import java.util.List;

public interface DeptDao {
	List<DeptVo> pullList();
	DeptVo getList(int deptno);
}
