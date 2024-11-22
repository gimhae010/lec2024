package com.gimhae.sts15;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gimhae.sts15.model.UsersRepo;
import com.gimhae.sts15.model.entity.Users;
import com.gimhae.sts15.service.JwtService;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class LoginFilter implements Filter{
	@Autowired
	JwtService jwtService;
	@Autowired
	UsersRepo usersRepo;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("before filter...");
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse) response;
		System.out.println(req.getRequestURI());
		res.setHeader("Access-Control-Allow-Credentials", "true");
		if(req.getRequestURI().startsWith("/dept")) {
//			if(session.getAttribute("result")!=null) {
//				chain.doFilter(request, response);
//			}else {
//				res.sendError(401);
//			}
			try {
				String token=req.getHeader("Authorization");
				System.out.println("filter:"+token);
				String email=jwtService.getAuthEmail(token);
				System.out.println("filter:"+email);
				Users user=usersRepo.findByEmail(email);
				System.out.println("filter:"+user);
				chain.doFilter(request, response);			
			}catch (Exception e) {
				System.out.println("filter err");
				res.sendError(401);
			}
		}else{
			chain.doFilter(request, response);			
		}
		System.out.println("after filter...");
	}

}










