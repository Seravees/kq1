package com.qqq.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.qqq.data.Dao;
import com.qqq.model.Var;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		Date start = new Date();

		String path = System.getProperty("user.dir");
		@SuppressWarnings("resource")
		BufferedReader r = new BufferedReader(new InputStreamReader(
				new FileInputStream(new File(path + "/config/config.txt")),
				"UTF-8"));
		String str;
		List<String> list = new ArrayList<String>();
		while ((str = r.readLine()) != null) {
			System.out.println(str);
			list.add(str);
		}

		for (String s : list) {
			if (s.startsWith("﻿源路径：")) {
				Var.setInPath(s.substring(new String("﻿源路径：").length()));
			}
			if (s.startsWith("目标路径：")) {
				Var.setOutPath(s.substring(new String("目标路径：").length()));
			}
			if (s.startsWith("源表格：")) {
				Var.setSrc(s.substring(new String("源表格：").length()));
			}
			if (s.startsWith("人员名单：")) {
				Var.setName(s.substring(new String("人员名单：").length()));
			}
			if (s.startsWith("排班1：")) {
				Var.setPb1(s.substring(new String("排班1：").length()));
			}
			if (s.startsWith("排班2：")) {
				Var.setPb2(s.substring(new String("排班2：").length()));
			}
			if (s.startsWith("考勤打卡1：")) {
				Var.setKq1(s.substring(new String("考勤打卡1：").length()));
			}
			if (s.startsWith("考勤打卡2：")) {
				Var.setKq2(s.substring(new String("考勤打卡2：").length()));
			}
			if (s.startsWith("请假：")) {
				Var.setHoliday(s.substring(new String("请假：").length()));
			}
			if (s.startsWith("统筹加班：")) {
				Var.setAdd1(s.substring(new String("统筹加班：").length()));
			}
			if (s.startsWith("临时加班：")) {
				Var.setAdd2(s.substring(new String("临时加班：").length()));
			}
			if (s.startsWith("临时加班未结束：")) {
				Var.setAdd2se(s.substring(new String("临时加班未结束：").length()));
			}
			if (s.startsWith("外出：")) {
				Var.setOut(s.substring(new String("外出：").length()));
			}
		}

		Dao.createPerson();
		Dao.setPB();
		Dao.setKQ();
		Dao.setOut();
		Dao.setHoliday();
		Dao.setAdd();
		Dao.fix();
		Dao.setRowHeight();
		Dao.merge();

		Date end = new Date();
		System.out.println("use:" + (end.getTime() - start.getTime()) + "ms");
	}
}
