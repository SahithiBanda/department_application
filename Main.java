package com.greatlearning.assigment;

public class Main {

	public static void main(String[] args) {
		AdminDepartment ad = new AdminDepartment();
		System.out.println(ad.deparmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		
		
		HrDepartment hd = new HrDepartment();
		System.out.println(hd.deparmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayAHoliday());
		
		TechDepartment td = new TechDepartment();
		System.out.println((td.deparmentName()));
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
	}

}
