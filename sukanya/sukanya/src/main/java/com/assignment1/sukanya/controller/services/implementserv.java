package com.assignment1.sukanya.controller.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.assignment1.sukanya.entities.Employee;


@Service
public class implementserv implements empSer {
	
	List<Employee> allEmp;
	public implementserv()
	{
		allEmp=new ArrayList<>();
		
		Employee obj1= new Employee(1,"ragini","B7","SDET-1","ragini201@gmail.com",2785);
		
		Employee obj2= new Employee(2,"sanjay","B7","SDET-1","sajay201@gmail.com",2781);
		
		Employee obj3= new Employee(3,"djay","B7","SDET-1","djay201@gmail.com",27874);
		allEmp.addAll(Arrays.asList(obj1,obj2,obj3));


	}
	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return allEmp;
	}
	
	
	
	@Override
	public Employee getOneEmployee( int empId){
	Employee employee = null;
	for(Employee e : allEmp) {
	if(e.getEmpId() == empId) {
	employee = e;
	break;
	}
	}
	return employee;
	}
	
	
	
	
	@Override
	public String addEmployee( Employee emp){
		if(emp==null)
		{
			return "no employee found";
		}
		allEmp.add(emp);
		
		return "Success";
		
	}
	@Override
	public String updateEmployee(Employee emp) {

	for(int i = 0 ; i < allEmp.size() ; i++) {
	Employee e = allEmp.get(i);
	if(e.getEmpId() == emp.getEmpId()) {
	allEmp.set(i, emp);
	
	}
	
	return "Successfully updated Employee status!";

	}
	
	return "Not found";

}
	
	@Override
	public String deleteEmployee(int empId){
		
		for(int i = 0 ; i < allEmp.size() ; i++) {
			Employee e = allEmp.get(i);
			if(e.getEmpId() == empId) {
			allEmp.remove(i);
			return "Successfully delete Employee status!";
			}
			

		}
		
		return "Not delete";
	}
}

