package com.qqq.model;

import java.util.List;

public class AddPerson {
	String name;
	String department;
	List<Add> adds;

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

	public List<Add> getAdds() {
		return adds;
	}

	public void setAdds(List<Add> adds) {
		this.adds = adds;
	}

	@Override
	public String toString() {
		return "AddPerson [name=" + name + ", department=" + department
				+ ", adds=" + adds + "]";
	}
}
