package com.mycompany.projectmanagement.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mycompany.projectmanagement.rest.model.Role;

@Service
public interface RoleService {

	public List<Role> findAllRole();
	
	public Role findRoleById(Long Id);
	
}
