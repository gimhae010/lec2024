package com.gimhae.sts14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gimhae.sts14.model.DeptVo;
import com.gimhae.sts14.service.DeptService;


@RestController
@SpringBootApplication
public class Sts14Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Sts14Application.class, args);
	}
	
	@Autowired
	DeptService deptService;

	@Override
	public void run(String... args) throws Exception {
		deptService.pushList(DeptVo.builder().dname("tester01").loc("서울").build());
		deptService.pushList(DeptVo.builder().dname("tester02").loc("대전").build());
		deptService.pushList(DeptVo.builder().dname("tester03").loc("대구").build());
		deptService.pushList(DeptVo.builder().dname("tester04").loc("부산").build());
		
	}
	
	@GetMapping("/dept/")
	public ResponseEntity<?> getMethodName() {
		return ResponseEntity.ok(deptService.getList());
	}

	

}
