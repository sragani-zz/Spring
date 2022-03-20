package com.assignment1.sukanya.controller.services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.assignment1.sukanya.entities.Employee;

public interface empSer {
	public List<Employee>getEmployee();
	public Employee getOneEmployee( int empId);
	public String addEmployee( Employee emp);
	public String updateEmployee( Employee emp);
	public String deleteEmployee(int empId);
	
}
