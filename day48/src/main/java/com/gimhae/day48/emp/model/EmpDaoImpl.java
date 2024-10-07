package com.gimhae.day48.emp.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements EmpDao{
	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Override
	public List<EmpVo> pullList(){
		return sqlSession.selectList("emp.pullList");
	}

	@Override
	public void addList(EmpVo bean) {
		sqlSession.insert("emp.addList",bean);
	}

	@Override
	public EmpVo getList(int empno) {
		return sqlSession.selectOne("emp.getList",empno);
	}

	@Override
	public int setList(EmpVo bean) {
		return sqlSession.update("emp.setList",bean);
	}

	@Override
	public int rmList(int empno) {
		return sqlSession.delete("emp.rmList",empno);
	}
}









