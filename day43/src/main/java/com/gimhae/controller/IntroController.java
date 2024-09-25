package com.gimhae.controller;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.Controller;

public class IntroController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("intro");
//		mav.setView(new View() {
//			
//			@Override
//			public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
//					throws Exception {
//				try(PrintWriter out=response.getWriter()){
//					out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
//					out.println("<students>");
//					out.println("<student>");
//					out.println("<num>1111</num>");
//					out.println("<name>user1</name>");
//					out.println("</student>");
//					out.println("</students>");
//				}
//			}
//			
//			@Override
//			public String getContentType() {
//				return "application/xml; charset=utf-8";
//			}
//		});
		return mav;
	}

}
