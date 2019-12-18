package com.woniu.a_spring;

public class Dept {
	private String name;

	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Dept(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dept [name=" + name + "]";
	}
	
	
}
