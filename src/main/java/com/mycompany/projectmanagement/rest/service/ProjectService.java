package com.mycompany.projectmanagement.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mycompany.projectmanagement.rest.model.Project;

@Service
public interface ProjectService {

	public List<Project> findAllProjects();

	public Project findProjectById(Long Id);
	
	public Project findByName(String name);

}
