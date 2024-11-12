package com.gimhae.sts10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gimhae.sts10.model.entity.Dept02;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
@RequestMapping("/dept")
public class DeptController {

	@GetMapping("/")
	public String list(Model model) {
		return "dept/list";
	}
	@PostMapping("/")
	public String add(Model model) {
		log.debug("add post");
		return "redirect:./";
	}
	@GetMapping("/add")
	public String add() {
		return "dept/add";
	}
	@GetMapping("/{deptno}")
	public String detail(@PathVariable int deptno ,Model model) {
		return "dept/detail";
	}
	@PutMapping("/{deptno}")
	public String update(@PathVariable int deptno ,@RequestBody Dept02 bean) {
		return "redirect:./";
	}
	@DeleteMapping("/{deptno}")
	public String delete(@PathVariable int deptno) {
		return "redirect:./";
	}
	
}








