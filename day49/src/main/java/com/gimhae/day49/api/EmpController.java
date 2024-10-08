package com.gimhae.day49.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
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

import com.gimhae.day49.emp.model.EmpVo;
import com.gimhae.day49.emp.service.EmpService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/api/emp/")
@RequiredArgsConstructor
public class EmpController {
	private final EmpService service;	

	@GetMapping("")
	@ResponseBody
	public List<?> list(){
		return service.list();
	}
	
	@ResponseBody
	@GetMapping("{empno}")
	public EmpVo detail(@PathVariable int empno) {
		return service.one(empno);
	}
	
	@PostMapping("")
	public ResponseEntity<?> add(@ModelAttribute EmpVo bean){
		service.add(bean);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("{empno}")
	public ResponseEntity<?> edit(@RequestBody EmpVo bean){
		service.edit(bean);
		return ResponseEntity.ok().build();
	}
	@DeleteMapping("{empno}")
	public ResponseEntity<?> delete(@PathVariable int empno){
		service.delete(empno);
		return ResponseEntity.ok().build();
	}
}
















