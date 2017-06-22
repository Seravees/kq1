package com.qqq.model;

public class PB {
	String name;
	String department;
	String date;
	String weekday;
	String pb;

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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

	public String getPb() {
		return pb;
	}

	public void setPb(String pb) {
		this.pb = pb;
	}

	@Override
	public String toString() {
		return "PB [name=" + name + ", department=" + department + ", date="
				+ date + ", weekday=" + weekday + ", pb=" + pb + "]";
	}

}
