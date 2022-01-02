package com.blz.day10;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class EmpWage implements IComputeEmpWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;
	private LinkedList<EmpWage> companyEmpWagesList;
	private Map<String, EmpWage> companyToEmpWageMap;

	public EmpWage() {
		companyEmpWagesList = new LinkedList<>();
		companyToEmpWageMap = new HashMap<>();
	}

	public void addCompanyEmpWage(String company, int empRatePerhour, int numOfWorkingDays, int maxHoursPerMonth) {
		EmpWage companyEmpWage = new EmpWage(company, empRatePerhour, numOfWorkingDays, maxHoursPerMonth);

		companyEmpWagesList.add(companyEmpWage);
		companyToEmpWageMap.put(company, companyEmpWage);
	}

	public int computeEmpWage(EmpWage companyEmpWage) {
		// variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		// computation
		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
		}
		return totalEmpHrs * companyEmpWage.empRatePerHour;
	}

	public void computeEmpWage() {
		for (int i = 0; i < companyEmpWagesList.size(); i++) {
			EmpWage companyEmpWage = companyEmpWagesList.get(i);
			companyEmpWage.setTotalEmpwage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	@Override
	public int getTotalWage(String company) {
		return companyToEmpWageMap.get(company).totalEmpWage;
	}

	public static void main(String[] args) {
	        EmpWage emp = new EmpWage();
	        emp.addCompanyEmpWage("BridgeLabz", 25, 20, 80);
	        emp.addCompanyEmpWage("MasterCard", 30, 22, 100);
	        emp.computeEmpWage();
	}
