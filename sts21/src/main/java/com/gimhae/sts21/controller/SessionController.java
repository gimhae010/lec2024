package com.gimhae.sts21.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/etc")
public class SessionController {

	@GetMapping("/data")
	public Map<String,Object> getMethodName() {
		ResponseEntity<Map> resp=new RestTemplate()
				.getForEntity("http://localhost:8000/data", Map.class);
		return resp.getBody();
	}
	
	@GetMapping(path = "/py",produces = MediaType.APPLICATION_JSON_VALUE)
	public String play() throws IOException, InterruptedException {
		ProcessBuilder processBuilder = new ProcessBuilder("python","test.py");
		processBuilder.redirectErrorStream(true);
		Process process = processBuilder.start();
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(process.getInputStream(),Charset.forName("cp949")));
		List<String> result=new ArrayList();
		String line;
		while ((line = reader.readLine()) != null) {
		    System.out.println(line);
		    result.add(line);
		}
		int exitCode = process.waitFor();
		System.out.println("Exited with code: " + exitCode);
		return "{\"exitCode\":"+result.stream().reduce((t, u) -> t+u).get()+"}";
	}
	
}
