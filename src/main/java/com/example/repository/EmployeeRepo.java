package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pojo.Employee;

//@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
