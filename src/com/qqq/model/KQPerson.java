package com.qqq.model;

import java.util.List;

public class KQPerson {
	String name;
	String department;
	List<KQ> kqs;

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

	public List<KQ> getKqs() {
		return kqs;
	}

	public void setKqs(List<KQ> kqs) {
		this.kqs = kqs;
	}

	@Override
	public String toString() {
		return "KQPerson [name=" + name + ", department=" + department
				+ ", kqs=" + kqs + "]";
	}
}
