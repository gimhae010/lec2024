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

/*
 * restful 
/			- index
/students/ - (get) list
/students/ - (post)list 입력
/students/1 -(get) 1학번에 정보전달
/students/1 -(post) 1학번에 정보입력
/students/1 -(patch) 1학번에 정보 일부수정
/students/1 -(put) 1학번에 정보 전체수정
/students/1 -(delete) 1학번에 정보삭제
*/
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
	
	@RequestMapping(value = "{empno}",method = RequestMethod.PUT)
	public String edit(@PathVariable int empno,@ModelAttribute EmpVo bean) {
		empService.editList(bean);
		return "redirect:./";
	}
	
	@RequestMapping(value = "{empno}",method = RequestMethod.DELETE)
	public ModelAndView delete(@PathVariable int empno,HttpServletResponse resp) {
		empService.removeList(empno);
		resp.setStatus(HttpServletResponse.SC_OK);
		return null;
	}
}











