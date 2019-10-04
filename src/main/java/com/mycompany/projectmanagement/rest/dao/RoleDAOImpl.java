package com.mycompany.projectmanagement.rest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.projectmanagement.rest.model.Role;

@Component
public class RoleDAOImpl {

	@Autowired
	RoleDAO roledao;

	public List<Role> findAllRoles() {

		return roledao.findAll();

	}

	public Role findRoleById(Long Id) {

		return roledao.findById(Id).get();

	}

}
