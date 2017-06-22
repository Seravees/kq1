package com.qqq.model;

import java.util.List;

public class OutPerson {
	String name;
	String department;
	List<Out> outs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<Out> getOuts() {
		return outs;
	}

	public void setOuts(List<Out> outs) {
		this.outs = outs;
	}

	@Override
	public String toString() {
		return "OutPerson [name=" + name + ", department=" + department
				+ ", outs=" + outs + "]";
	}

}
