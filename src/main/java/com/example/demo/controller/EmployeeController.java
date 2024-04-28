package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.service.EmployeeService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {
	
	private EmployeeService empService;
	
	//Add employee REST API
	@PostMapping
	public ResponseEntity<EmployeeDto>CreateEmp(@RequestBody EmployeeDto empDto)
	{
		EmployeeDto savedEmp = empService.createEmployee(empDto);
		return new ResponseEntity<>(savedEmp,HttpStatus.CREATED);
	}
	
	

}
