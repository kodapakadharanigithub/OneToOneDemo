package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.Employee;
import com.hcl.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	public Employee registerEmoloyee(Employee e)
	{
		return empRepo.save(e);
	}

}
