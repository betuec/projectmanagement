package com.mycompany.projectmanagement.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.projectmanagement.rest.model.Project;
import com.mycompany.projectmanagement.rest.service.ProjectServiceImpl;

@RestController
public class ProjectController {

	@Autowired
	ProjectServiceImpl projectserviceimpl;

	@GetMapping(value = "/projects")
	public ResponseEntity<List<Project>> findAllProjects() {

		List<Project> allprojects = projectserviceimpl.findAllProjects();

		if (allprojects != null) {

			return new ResponseEntity<List<Project>>(allprojects, HttpStatus.OK);

		}

		else {

			throw new NullPointerException();
		}

	}

	@GetMapping(value = "/project/id/{Id}")
	public ResponseEntity<Project> findProjectById(@PathVariable Long Id) {

		Project project = projectserviceimpl.findProjectById(Id);

		return new ResponseEntity<Project>(project, HttpStatus.OK);

	}

	@GetMapping(value = "/project/name/{name}")
	public ResponseEntity<Project> findProjectById(@PathVariable String name) {

		Project project = projectserviceimpl.findByName(name);

		return new ResponseEntity<Project>(project, HttpStatus.OK);

	}

}
