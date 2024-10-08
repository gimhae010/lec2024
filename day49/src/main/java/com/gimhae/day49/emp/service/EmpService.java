package com.gimhae.day49.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gimhae.day49.emp.model.EmpDao;
import com.gimhae.day49.emp.model.EmpVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmpService {
	private final EmpDao empDao;
	
	public List<?> list() {
		return empDao.pullList();
	}
	public EmpVo one(int empno) {
		return empDao.getList(empno);
	}
	public boolean add(EmpVo bean) {
		try {
			empDao.addList(bean);
		}catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean edit(EmpVo bean) {
		return empDao.setList(bean)>0?true:false;
	}
	
	public boolean delete(int empno) {
		return empDao.rmList(empno)>0?true:false;
	}
}



















