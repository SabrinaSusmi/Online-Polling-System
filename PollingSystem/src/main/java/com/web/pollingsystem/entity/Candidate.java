package com.web.pollingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidate", schema ="public")
public class Candidate {
	public Candidate(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Candidate() {
		super();
	}

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
}
