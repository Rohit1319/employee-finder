package com.example.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pojo.Employee;
import com.example.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	public EmployeeRepo employeeRepo;
	
	public Employee findEmployee(Long id) {
		
		return employeeRepo.findById(id).get();
	}
	
	 public Collection < Employee > findAll() {
	        return employeeRepo.findAll();
	    }
}
