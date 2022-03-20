package com.database.Assignment2.controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.database.Assignment2.entity.Employee;
import com.database.Assignment2.services.Serivces2;


	@RestController
	@RequestMapping("/ragini")



	public class Controllerdatabase  {
		
		@Autowired
		private Serivces2 emp;
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
		public Employee addEmployee(@RequestBody Employee emp){
		return this.emp.addEmployee(emp);
		}
		@PutMapping("/put")
		public Employee updateEmployee(@RequestBody Employee emp){
		return this.emp.updateEmployee(emp);
		}
		
		@DeleteMapping("/delete")
		public ResponseEntity<HttpStatus> deleteEmployee(int empId){
			try {
				this.emp.deleteEmployee(empId);
				return new ResponseEntity<>(HttpStatus.OK);
				} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
		}
	}


