package com.mycompany.projectmanagement.rest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.projectmanagement.rest.model.Project;

@Component
public class ProjectDAOImpl {

	@Autowired
	ProjectDAO projectdao;

	public List<Project> findAllProjects() {

		try {

			return projectdao.findAll();

		}

		catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public Project findById(Long id) {

		return projectdao.findById(id).get();

	}

	public Project findByName(String name) {

		for (Project project : findAllProjects()) {

			if (project.getP_name().equalsIgnoreCase(name)) {

				return project;

			}

		}

		return null;

	}

}
