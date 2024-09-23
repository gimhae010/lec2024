package com.gimhae.framework.mvc;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gimhae.framework.controller.IndexController;
import com.gimhae.framework.controller.IntroController;
import com.gimhae.framework.controller.ListController;

public class DispatcherServlet extends HttpServlet{

	Map<String,String> handler=new HashMap<>();
//	handler.put("/index.do","com.gimhae.framework.controller.IndexController");
//	handler.put("/intro.do","com.gimhae.framework.controller.IntroController");
//	handler.put("/emp.do","com.gimhae.framework.controller.ListController");

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doDo(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doDo(req, resp);
	}
	protected void doDo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path=req.getRequestURI();
		MyController controller=null;
		try {
			Class clz=null;
			String info=null;
			
			info=handler.get(path.substring(req.getContextPath().length()));
			if(info==null) {
				resp.sendError(HttpServletResponse.SC_NOT_FOUND);
				return;
			}
			clz=Class.forName(info);
			controller=(MyController) clz.getDeclaredConstructor().newInstance();
			
			String viewName=controller.execute(req, resp);
			RequestDispatcher rd=req.getRequestDispatcher("/WEB-INF/views/"+viewName+".jsp");
			rd.forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
	
}










