package com.gimhae.emp.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl2 implements EmpDao<EmpVo> {
	@Autowired
	SqlMapClientTemplate clientTemplate;

	@Override
	public List<EmpVo> pullList() {
		return clientTemplate.queryForList("pullList");
	}

	@Override
	public EmpVo getList(int idx) {
		return (EmpVo) clientTemplate.queryForObject("getList",idx);
	}

	@Override
	public void addList(EmpVo t) {
		clientTemplate.insert("addList",t);
	}

	@Override
	public int setList(EmpVo t) {
		return clientTemplate.update("setList",t);
	}

	@Override
	public int rmList(int idx) {
		return clientTemplate.delete("rmList",idx);
	}

	@Override
	public int listSize() {
		return (int) clientTemplate.queryForObject("listSize");
	}

}
