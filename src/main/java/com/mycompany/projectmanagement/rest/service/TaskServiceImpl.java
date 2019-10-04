package com.mycompany.projectmanagement.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.projectmanagement.rest.dao.TaskDAOImpl;
import com.mycompany.projectmanagement.rest.model.Task;

@Component
public class TaskServiceImpl implements TaskService{
	
	@Autowired
	TaskDAOImpl taskdaoimpl;

	@Override
	public List<Task> findAllTasks() {
		return taskdaoimpl.findAllTasks();
	}

	@Override
	public Task findTaskById(Long Id) {
		return taskdaoimpl.findTaskById(Id);
	}

	
}
