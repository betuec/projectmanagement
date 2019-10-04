package com.mycompany.projectmanagement.rest.model;

public class JwtUser {

	private String userName;
	private long Id;
	private String role;

	public void setUserName(String userName) {

		this.userName = userName;

	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

}
