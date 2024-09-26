package com.gimhae.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gimhae.emp.model.EmpDao;

public class InsertController implements Controller {
	EmpDao empDao;
	
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav=new ModelAndView();
		empDao.addList(request.getParameter("ename"),Integer.parseInt(request.getParameter("pay")));
		mav.setViewName("redirect:list.do");
		return mav;
	}

}
