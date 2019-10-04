package com.mycompany.projectmanagement.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.projectmanagement.rest.model.Task;

public interface TaskDAO extends JpaRepository<Task, Long> {

}
