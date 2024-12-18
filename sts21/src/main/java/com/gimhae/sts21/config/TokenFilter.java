package com.gimhae.sts21.config;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import com.gimhae.sts21.service.JwtTokenProvider;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

//https://developer.mozilla.org/ko/docs/Web/HTTP/Headers/Access-Control-Expose-Headers
@Slf4j
@RequiredArgsConstructor
public class TokenFilter extends OncePerRequestFilter {
	final JwtTokenProvider jwtTokenProvider;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response
			, FilterChain chain) throws ServletException, IOException {
		log.debug("before filter");
		if(request.getMethod().equals("OPTIONS")){
			chain.doFilter(request, response);
//			response.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:5500");
//			response.setHeader("Access-Control-Allow-Origin",  request.getHeader("Origin"));
//	        response.setHeader("Access-Control-Allow-Credentials", "true");
//	        response.setHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,PATCH,OPTIONS");
//	        response.setHeader("Access-Control-Max-Age", "3600");
//	        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me, Authorization, type ");
//	        response.setHeader("Access-Control-Expose-Headers","Authorization");
			return;
		}
		String[] ignores= {"/login","/etc/data","/etc/py"};
		if(Stream.of(ignores).anyMatch(t -> request.getRequestURI().equals(t))) {
				chain.doFilter(request, response);
				return;
		}
		request.getHeaderNames().asIterator().forEachRemaining(System.out::println);
		String auth=request.getHeader("authorization");
		if(auth==null)return;
		String[] auths=auth.split(" ");
		if(auths.length<2)return;
		if(jwtTokenProvider.validateToken(auths[1])) {
			request.setAttribute("auth", jwtTokenProvider.getAuthentication(auths[1]));
			chain.doFilter(request, response);
		}
	}

}
