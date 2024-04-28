package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;


//To perform CRUD operation on the entity
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
   	
		
}
