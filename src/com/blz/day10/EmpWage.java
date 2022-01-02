package com.blz.day10;

import java.util.Random;

public class EmpWage {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxWorkingHoursPerMonth;
	private int totalEmpWage;

	public EmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxWorkingHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxWorkingHoursPerMonth = maxWorkingHoursPerMonth;
	}

	public void computeWage() {
		int empHours = 0;
		int total_empHrs = 0;
		int totalWorkingDay = 0;

		while (total_empHrs <= maxWorkingHoursPerMonth && totalWorkingDay < numOfWorkingDays) {
			totalWorkingDay++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_FULL_TIME:
				empHours = 8;
				System.out.println("Employee is Present");
				break;
			case IS_PART_TIME:
				System.out.println("Employee is Part Time");
				empHours = 4;
				break;
			default:
				empHours = 0;

				System.out.println("Employee is Absent");
			}
			total_empHrs += empHours;
		}
		totalEmpWage = total_empHrs * empRatePerHour;
	}

	@Override
	public String toString() {
		return "Total Emp wage for company : " + company + " is " + totalEmpWage;
	}

	public static void main(String[] args) {

		
		 EmpWage bridgeLabz = new EmpWage("BridgeLabz", 45, 30, 70);
		 EmpWage infosys = new EmpWage("Infosys", 35, 45, 90);
         bridgeLabz.computeWage();
         System.out.println(bridgeLabz);
         infosys.computeWage();
         System.out.println(infosys);

	}

}
