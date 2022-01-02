package com.blz.day10;

import java.util.Random;

class utilityEmpWage {
	Random rand = new Random();
	public int isPresent = 1;
	public int isAbsent = 2;
	public int wagePerHr = 20;
	public int fullDayHr = 8;
	int check = rand.nextInt(2) + 1;

	public boolean present() {
		if (check == isAbsent) {
			System.out.println("Employee is absent.");
			return false;
		} else {
			System.out.println("Employee is present.");
			return true;
		}
	}

	public void dailyWage() {
		if (present()) {
			int dailyWage = wagePerHr * fullDayHr;
			System.out.println("Wage of the day of employee is : " + dailyWage);
		}
	}
}

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation");
		utilityEmpWage empWage = new utilityEmpWage();
		empWage.present();
		empWage.dailyWage();
	}

}
