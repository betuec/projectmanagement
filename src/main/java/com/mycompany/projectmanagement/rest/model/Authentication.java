package com.mycompany.projectmanagement.rest.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "Authentication")
@EntityListeners(AuditingEntityListener.class)
public class Authentication {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userid;
	@NotBlank
	@NonNull
	@NotEmpty
	private String username;

	@NotBlank
	@NonNull
	@NotEmpty
	private String password;

	@Email
	private String email;

	public Authentication() {
	};

	public Authentication(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
