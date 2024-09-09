package com.home.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.home.model.EmpDao;

public class EmpDelController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int sabun=Integer.parseInt(req.getParameter("sabun"));
		EmpDao dao=new EmpDao();
		dao.removeList(sabun);
		resp.sendRedirect("list.do");
	}
}
