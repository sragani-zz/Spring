package com.database.Assignment2.services;

import java.util.List;

import com.database.Assignment2.entity.Employee;

public interface Serivces2 {
	public List<Employee>getEmployee();
	public Employee getOneEmployee( int empId);
	public Employee addEmployee( Employee emp);
	public Employee updateEmployee( Employee emp);
	public void deleteEmployee(int empId);
}
