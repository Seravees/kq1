package com.qqq.model;

import java.util.List;

public class PBPerson {
	String name;
	String department;
	List<PB> pbs;
	int zhongban;
	int yeban;

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

	public List<PB> getPbs() {
		return pbs;
	}

	public void setPbs(List<PB> pbs) {
		this.pbs = pbs;
	}

	public int getZhongban() {
		return zhongban;
	}

	public void setZhongban(int zhongban) {
		this.zhongban = zhongban;
	}

	public int getYeban() {
		return yeban;
	}

	public void setYeban(int yeban) {
		this.yeban = yeban;
	}

	@Override
	public String toString() {
		return "PBPerson [name=" + name + ", department=" + department
				+ ", pbs=" + pbs + ", zhongban=" + zhongban + ", yeban="
				+ yeban + "]";
	}

}
