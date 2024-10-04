package com.gimhae.emp;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gimhae.emp.model.EmpVo;
import com.gimhae.emp.service.EmpService;

@Controller
@RequestMapping("/emp/")
public class EmpController {
	@Autowired
	EmpService empService;

	@RequestMapping( value = "", method=RequestMethod.GET) 
	public String list(Model model) {
		empService.list(model);
		return "emp/index";
	}
	@RequestMapping(value = "",method=RequestMethod.POST)
	public String insert(@ModelAttribute EmpVo bean) {
		empService.add(bean);
		return "redirect:./";
	}
	@RequestMapping("add")
	public void addForm() {}
	
	@RequestMapping(value = "{empno}",method = RequestMethod.GET)
	public String detail(@PathVariable int empno,Model model) {
		empService.oneList(model, empno);
		return "emp/one";
	}
	
	@RequestMapping(value = "{empno}",method = RequestMethod.POST)
	public String edit(@PathVariable int empno,@ModelAttribute EmpVo bean) {
		empService.editList(bean);
		return "redirect:./";
	}
	
	@RequestMapping(value = "del",method=RequestMethod.POST)
	public ModelAndView delete(int empno,HttpServletResponse resp) {
		empService.removeList(empno);
		resp.setStatus(HttpServletResponse.SC_OK);
		return null;
	}
}











