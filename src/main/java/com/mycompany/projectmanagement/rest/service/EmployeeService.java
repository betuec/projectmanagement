package com.mycompany.projectmanagement.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mycompany.projectmanagement.rest.model.Employee;

@Service
public interface EmployeeService {

	public List<Employee> findAllEmployees();

	public Employee findEmployeeById(Long Id);

}
