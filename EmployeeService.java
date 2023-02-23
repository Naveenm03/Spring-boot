package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service

public class EmployeeService {

@Autowired

private EmpRepo emp;

public Employee saveDetails(Employee e) {

return emp.save(e);

}

public List <Employee> getAllDetails(){

return emp.findAll();

}

public void deleteDepartmentById(int id) {

emp.deleteById(id);

}

}