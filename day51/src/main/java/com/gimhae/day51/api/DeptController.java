package com.gimhae.day51.api;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gimhae.day51.dept.model.DeptDao;
import com.gimhae.day51.dept.model.DeptVo;

@RestController
@RequestMapping("/api/")
public class DeptController {
	@Autowired
	SqlSession sqlSession;

	@GetMapping("dept/")
	public List<DeptVo> list(){
		return sqlSession.getMapper(DeptDao.class).pullList();
	}
	
	@GetMapping("dept/{deptno}")
	public DeptVo detail(@PathVariable int deptno) {
		return sqlSession.getMapper(DeptDao.class).getList(deptno);
	}
}










