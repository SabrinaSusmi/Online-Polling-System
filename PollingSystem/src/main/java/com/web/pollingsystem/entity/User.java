package com.web.pollingsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="User", schema ="public")
public class User {
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;

	protected Long getId() {
		return id;
	}

	protected void setId(Long id) {
		this.id = id;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public User(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public User() {
		super();
	}
	
	

}
