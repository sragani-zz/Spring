package com.assignment1.sukanya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment1.sukanya.controller.services.empSer;
import com.assignment1.sukanya.entities.Employee;



@RestController
@RequestMapping("/ragini")



public class MyController {
	@Autowired
	private empSer emp;
	@GetMapping("/get")

public List<Employee>getEmployee()
{
	return this.emp.getEmployee();
}
	@GetMapping("/get/{empId}")
	public Employee getOneEmployee(@PathVariable int empId){
	return this.emp.getOneEmployee(empId);
	}

	@PostMapping("/add")
	public String addEmployee(@RequestBody Employee emp){
	return this.emp.addEmployee(emp);
	}
	@PutMapping("/put")
	public String updateEmployee(@RequestBody Employee emp){
	return this.emp.updateEmployee(emp);
	}
	
	@DeleteMapping("/delete")
	public String deleteEmployee(int empId){
	return this.emp.deleteEmployee(empId);
	}
}
