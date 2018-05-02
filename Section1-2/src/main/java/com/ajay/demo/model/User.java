package com.ajay.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_USER")
public class User implements Serializable {

	private static final long serialVersionUID = 2711201708013908747L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)  
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name", length = 255)
	private String name;
	
	@Column(name = "pass", length = 255)
	private String pass;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
