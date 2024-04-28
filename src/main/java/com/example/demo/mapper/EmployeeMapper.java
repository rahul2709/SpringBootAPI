package com.example.demo.mapper;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;

public class EmployeeMapper {
	
	public static EmployeeDto MaptoEmployeeDto(Employee emp) {
		
		return new EmployeeDto(
				   emp.getId(),
				   emp.getFirstName(),
				   emp.getLastName(),
				   emp.getEmail()				   			  
				);
	}
	
	public static Employee mapToEmployeeEntity(EmployeeDto empDto) {
		
		return new Employee(
				
				   empDto.getId(),
				   empDto.getFirstName(),
				   empDto.getLastName(),
				   empDto.getEmail()	
				 
				
				);
		
	}

}
