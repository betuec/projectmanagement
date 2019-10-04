package com.mycompany.projectmanagement.rest.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Tasks")
@EntityListeners(AuditingEntityListener.class)
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long t_id;

	@NotBlank
	private String t_name;
	private Date s_date;
	private Date e_date;
	
	@NotBlank
	private String t_status;
	private Long p_id;
	private Long emp_id;

	public Task() {
		super();
	}

	public Task(Long t_id, String t_name, Date s_date, Date e_date, String t_status, Long p_id, Long emp_id) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.s_date = s_date;
		this.e_date = e_date;
		this.t_status = t_status;
		this.p_id = p_id;
		this.emp_id = emp_id;
	}

	public Long getT_id() {
		return t_id;
	}

	public void setT_id(Long t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public Date getS_date() {
		return s_date;
	}

	public void setS_date(Date s_date) {
		this.s_date = s_date;
	}

	public Date getE_date() {
		return e_date;
	}

	public void setE_date(Date e_date) {
		this.e_date = e_date;
	}

	public String getT_status() {
		return t_status;
	}

	public void setT_status(String t_status) {
		this.t_status = t_status;
	}

	public Long getP_id() {
		return p_id;
	}

	public void setP_id(Long p_id) {
		this.p_id = p_id;
	}

	public Long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}

}
