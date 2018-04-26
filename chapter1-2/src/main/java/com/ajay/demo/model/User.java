package com.ajay.demo.model;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = -853504493430501564L;

	private Long id;
	
	private String name;
	
	private String pass;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

}
