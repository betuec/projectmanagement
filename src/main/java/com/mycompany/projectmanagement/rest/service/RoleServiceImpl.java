package com.mycompany.projectmanagement.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.projectmanagement.rest.dao.RoleDAOImpl;
import com.mycompany.projectmanagement.rest.model.Role;

@Component
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	RoleDAOImpl roledaoimpl;

	@Override
	public List<Role> findAllRole() {
		return roledaoimpl.findAllRoles();
	}

	@Override
	public Role findRoleById(Long Id) {
		return roledaoimpl.findRoleById(Id);
	}
	
	

}
