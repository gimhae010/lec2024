package com.gimhae.sts21.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.gimhae.sts21.service.JwtTokenProvider;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {
	@Autowired
	JwtTokenProvider jwtTokenProvider;

	@GetMapping("/login")
	public Map<String, String> getMethodName() {
		return Map.of("token",jwtTokenProvider.generateToken("user01"));
	}
	
	@GetMapping("/info")
	public String getInfo(HttpServletRequest req) {
		System.out.println("----------------------");
		req.getAttributeNames().asIterator().forEachRemaining(System.out::println);
		return "{\"info\":\""+req.getAttribute("auth")+"\"}";
	}
}
