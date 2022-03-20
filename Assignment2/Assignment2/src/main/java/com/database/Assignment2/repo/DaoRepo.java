package com.database.Assignment2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.Assignment2.entity.Employee;

public interface DaoRepo extends JpaRepository<Employee, Integer>{

}
