package com.example.demo.service.impl;


import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	
	private  EmployeeRepository empRepo;
	
   @Override
   public EmployeeDto createEmployee(EmployeeDto empDto) {
	   
	   //Convert employee DTO into entity to store.
	  Employee emp = EmployeeMapper.mapToEmployeeEntity(empDto);
	   //Save entity into
	  Employee savedEmp = empRepo.save(emp);
	  //return updated data back 
   	   return EmployeeMapper.MaptoEmployeeDto(savedEmp);
   }
 
}
