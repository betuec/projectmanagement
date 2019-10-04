package com.mycompany.projectmanagement.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.projectmanagement.rest.model.Project;

public interface ProjectDAO extends JpaRepository<Project, Long> {
	
}
