package com.gimhae.day48.emp.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gimhae.day48.emp.model.EmpVo;
import com.gimhae.day48.emp.service.EmpService;
import com.google.gson.JsonObject;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/emp/")
public class EmpController {
	@Autowired
	EmpService empService;

	// jackson-databind
	@GetMapping("")
	@ResponseBody
	public List<EmpVo> list() {
		return empService.list();
	}
	
	@PostMapping("")
	public @ResponseBody Map<String,String> add(@ModelAttribute EmpVo bean) {
		empService.add(bean);
		Map<String,String> json=new LinkedHashMap<String, String>();
		json.put("result", "success");
		return json;
	} 
	
	@GetMapping("{empno}")
	public @ResponseBody EmpVo detail(@PathVariable int empno) {
		return empService.one(empno);
	}
	
	
	// String param={"empno":3,"ename":"user3","pay":3000}
	// jackson-databind
	@PutMapping("{empno}")
	@ResponseBody
	public Map<String,String> edit(@RequestBody EmpVo bean) {
		Map<String,String> json=new LinkedHashMap<String, String>();
		json.put("result", empService.edit(bean)+"");
		return json;
	}
	
	@DeleteMapping("{empno}")
	@ResponseBody
	public Map<String,String> delete(@PathVariable int empno){
		Map<String,String> json=new LinkedHashMap<String, String>();
		json.put("result", empService.remove(empno)+"");
		return json;
	}
}















