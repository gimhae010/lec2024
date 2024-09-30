package com.gimhae;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gimhae.emp.model.EmpDao;

@Controller
@RequestMapping("/emp/")
public class EmpController {
	@Autowired
	EmpDao empDao;

	@RequestMapping("list")
	public void list(Model model) {
		model.addAttribute("list", empDao.pullList());
	}
}
