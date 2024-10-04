package com.gimhae.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gimhae.emp.service.EmpService;

@Controller
@RequestMapping("/emp/")
public class EmpController {
	@Autowired
	EmpService empService;

	@RequestMapping("") 
	public String list(Model model) {
		empService.list(model);
		return "emp/index";
	}
}











