package com.example.demo;

 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
	@Autowired
	private StudentService stuservice;
	
	@PostMapping("/addStudent")
	public Student postDetails(@RequestBody Student s)
	{
		return  stuservice.saveDetails(s);
		
		
	}
	
	@GetMapping("/getStudent")
	public List<Student> getDetails()
	{
		
		return stuservice.getAllDetails();
	}
}
