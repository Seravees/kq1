package com.qqq.model;

public class Add {
	String name;
	String department;
	String date;
	String start;
	String end;
	String site;
	String apply;
	double hours;

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

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getApply() {
		return apply;
	}

	public void setApply(String apply) {
		this.apply = apply;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "Add [name=" + name + ", department=" + department + ", date="
				+ date + ", start=" + start + ", end=" + end + ", site=" + site
				+ ", apply=" + apply + ", hours=" + hours + "]";
	}

	
}
