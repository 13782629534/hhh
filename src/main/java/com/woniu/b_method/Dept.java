package com.woniu.b_method;

public class Dept {
	
	private String dept;		
	public Dept() {
		super();		
	}
	public Dept(String dept) {
		super();
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Dept [dept=" + dept + "]";
	}
	
	
	
}
