package com.gimhae.framework.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gimhae.framework.mvc.MyController;

public class ListController implements MyController{

	public String execute(HttpServletRequest req, HttpServletResponse resp){
		return "emp/list";
	}
}