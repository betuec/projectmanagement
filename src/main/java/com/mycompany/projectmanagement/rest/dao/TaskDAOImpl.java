package com.mycompany.projectmanagement.rest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.projectmanagement.rest.model.Task;

@Component
public class TaskDAOImpl {
	
	@Autowired
	TaskDAO taskdao;
	
	public List<Task> findAllTasks()	{
		
		return taskdao.findAll();
		
	}
	
	public Task findTaskById(Long Id)	{
		
		return taskdao.findById(Id).get();
		
	}

}
