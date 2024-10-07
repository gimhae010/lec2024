package com.gimhae.day48.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gimhae.day48.emp.model.EmpDao;
import com.gimhae.day48.emp.model.EmpVo;

@Service
public class EmpService {
	@Autowired
	EmpDao empDao;
	
	public List<EmpVo> list(){
		return empDao.pullList();
	}

	public void add(EmpVo bean) {
		empDao.addList(bean);
	}

	public EmpVo one(int empno) {
		return empDao.getList(empno);
	}
	
	public boolean edit(EmpVo bean) {
		return empDao.setList(bean)>0?true:false;
	}

	public String remove(int empno) {
		return empDao.rmList(empno)>0?"success":"error";
	}
}






