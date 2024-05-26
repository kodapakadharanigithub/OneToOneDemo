package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Employee;
import com.hcl.service.EmployeeService;

@RestController
@RequestMapping("/user")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@PostMapping("/registerEmp")
	public ResponseEntity<?> registerEmployee(@RequestBody Employee e)
	{
		return new ResponseEntity<>(empService.registerEmoloyee(e),HttpStatus.CREATED);
	}

}
