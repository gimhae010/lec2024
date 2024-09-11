package com.emp.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.coyote.http11.filters.BufferedInputFilter;

@WebServlet("/emp/download.do")
public class DownController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ordfile=req.getParameter("ord");
		String newfile=req.getParameter("file");
		String path="C:\\workspace\\load\\";
		
		resp.setContentType("application/octet-stream");
		resp.setHeader("Content-Disposition", "attachment; filename=\""+ordfile+"\"");
		File f=new File(path+newfile);
		try(
				OutputStream os=resp.getOutputStream();
				InputStream is=new FileInputStream(f);
				BufferedOutputStream bos=new BufferedOutputStream(os);
				BufferedInputStream bis=new BufferedInputStream(is); 
				){
			int su=-1;
			while((su=bis.read())!=-1) {
				bos.write(su);
			}
		}
	}
}









