package com.mycompany.projectmanagement.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mycompany.projectmanagement.rest.model.Task;

@Service
public interface TaskService {

	public List<Task> findAllTasks();

	public Task findTaskById(Long Id);

}
