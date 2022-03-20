package com.database.Assignment2.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.database.Assignment2.entity.Employee;
import com.database.Assignment2.repo.DaoRepo;

	@Service
	public class implementService  implements Serivces2{
		
		
		
		@Autowired
		private DaoRepo daoRepo;//dependency injection
		
		//List<Employee> allEmp;
		public  implementService()
		{
			
		}
		
		
		
		@Override
		public List<Employee> getEmployee() {
			
			return daoRepo.findAll();
			// TODO Auto-generated method stub
			
		}
		
		
		
		@Override
		public Employee getOneEmployee( int empId){


						return daoRepo.getOne(empId);
			
		}
		
		
		
		
		@Override
		public Employee addEmployee( Employee emp){
			return daoRepo.save(emp);
		}
		
		
		
		@Override
		public Employee updateEmployee(Employee emp) {

	return daoRepo.save(emp);

	}
		
		@Override
		public void deleteEmployee(int empId){
			
		Employee es =daoRepo.getOne(empId);
			daoRepo.delete(es);

		}
	
	}


