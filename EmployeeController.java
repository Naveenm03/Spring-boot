

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class EmployeeController {

@Autowired

private EmployeeService empservice;

@PostMapping("/addEmployee")

public String postDetails(@RequestBody Employee e)

{

empservice.saveDetails(e);

return "Value Added";

}

@GetMapping("/getEmployee")

public List<Employee> getDetails(){

return empservice.getAllDetails();

}

}