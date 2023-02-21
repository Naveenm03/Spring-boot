package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class annotations {
	@Value("${sample.value}")
	private String name;
	@GetMapping("show")
	public String hello() {
		return "Hi "+name+" !";
	}
	
	

}
