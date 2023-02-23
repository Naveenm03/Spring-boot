package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepo stu;
	
	public Student saveDetails(Student s)
	{
		return stu.save(s);
	}
	
	public List<Student> getAllDetails()
	{
		return stu.findAll();
	}
}