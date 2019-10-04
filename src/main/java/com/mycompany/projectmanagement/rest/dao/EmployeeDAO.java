package com.mycompany.projectmanagement.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.projectmanagement.rest.model.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Long>{

}
