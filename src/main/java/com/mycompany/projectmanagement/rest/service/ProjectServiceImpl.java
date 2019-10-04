package com.mycompany.projectmanagement.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.projectmanagement.rest.dao.ProjectDAOImpl;
import com.mycompany.projectmanagement.rest.model.Project;

@Component
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectDAOImpl projectdaoimpl;

	@Override
	public List<Project> findAllProjects() {
		return projectdaoimpl.findAllProjects();
	}

	@Override
	public Project findProjectById(Long Id) {
		return projectdaoimpl.findById(Id);
	}

	@Override
	public Project findByName(String name) {
		return projectdaoimpl.findByName(name);
	}

}
