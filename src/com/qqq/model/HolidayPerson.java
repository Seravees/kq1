package com.qqq.model;

import java.util.List;

public class HolidayPerson {
	String name;
	String department;
	List<Holiday> holidays;
	double nianjia;
	double shijia;
	double bingjia;
	double tiaoxiu;
	double qita;

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

	public List<Holiday> getHolidays() {
		return holidays;
	}

	public void setHolidays(List<Holiday> holidays) {
		this.holidays = holidays;
	}

	public double getNianjia() {
		return nianjia;
	}

	public void setNianjia(double nianjia) {
		this.nianjia = nianjia;
	}

	public double getShijia() {
		return shijia;
	}

	public void setShijia(double shijia) {
		this.shijia = shijia;
	}

	public double getBingjia() {
		return bingjia;
	}

	public void setBingjia(double bingjia) {
		this.bingjia = bingjia;
	}

	public double getTiaoxiu() {
		return tiaoxiu;
	}

	public void setTiaoxiu(double tiaoxiu) {
		this.tiaoxiu = tiaoxiu;
	}

	public double getQita() {
		return qita;
	}

	public void setQita(double qita) {
		this.qita = qita;
	}

	@Override
	public String toString() {
		return "HolidayPerson [name=" + name + ", department=" + department
				+ ", holidays=" + holidays + ", nianjia=" + nianjia
				+ ", shijia=" + shijia + ", bingjia=" + bingjia + ", tiaoxiu="
				+ tiaoxiu + ", qita=" + qita + "]";
	}

}
