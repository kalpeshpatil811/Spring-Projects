package com.capg.springbootcontrollerserviceadd.controller;

public class Topics {
	private String name;
	private String description;
	private String id;

	public Topics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Topics(String name, String description, String id) {
		super();
		this.name = name;
		this.description = description;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}