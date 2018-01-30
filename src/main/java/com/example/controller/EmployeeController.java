package com.example.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.pojo.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {

	/* @Autowired
	 private RestTemplate restTemplate;*/
	
	@Autowired
	public EmployeeService employeeService;
	
	@RequestMapping("/employee/find/{id}")
	public Employee findById(@PathVariable Long id) {
		return employeeService.findEmployee(id);
	}
	
	@RequestMapping("/employee/findAll")
	public Collection<Employee> findAll() {
		return employeeService.findAll();
	}
	
	/*@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}*/
	
	@Bean 
	public AlwaysSampler defaultSampler() { 
	  return new AlwaysSampler(); 
	}
	
}
