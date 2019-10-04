package com.mycompany.projectmanagement.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.projectmanagement.rest.model.Role;

public interface RoleDAO extends JpaRepository<Role, Long>{

}
