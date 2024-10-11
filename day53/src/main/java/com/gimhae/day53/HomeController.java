package com.gimhae.day53;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gimhae.day53.model.GuestDao;

@Controller
public class HomeController {
	@Autowired
	GuestDao guestDao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("list", guestDao.list());
		return "index";
	}
	
}
