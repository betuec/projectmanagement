package com.mycompany.projectmanagement.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.projectmanagement.rest.dao.EmployeeDAOImpl;
import com.mycompany.projectmanagement.rest.model.Employee;

@Component
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDAOImpl employeedaoimpl;

	@Override
	public List<Employee> findAllEmployees() {
		return employeedaoimpl.findAllEmployees();
	}

	@Override
	public Employee findEmployeeById(Long Id) {
		return employeedaoimpl.findEmployeeById(Id);
	}

	
}
