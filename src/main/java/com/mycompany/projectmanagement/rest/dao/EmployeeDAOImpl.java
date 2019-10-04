package com.mycompany.projectmanagement.rest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.projectmanagement.rest.model.Employee;

@Component
public class EmployeeDAOImpl {

	@Autowired
	EmployeeDAO employeedao;

	public List<Employee> findAllEmployees() {

		return employeedao.findAll();
	}

	public Employee findEmployeeById(Long Id) {

		return employeedao.findById(Id).get();
	}

}
