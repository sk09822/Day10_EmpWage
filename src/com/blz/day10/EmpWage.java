package com.blz.day10;

import java.util.Random;

class utilityEmpWage {
	Random rand = new Random();
	public final int isPresent = 1;
	public final int isAbsent = 2;
	public final int isPartTime = 3;
	public int wagePerHr = 20;
	public int fullDayHr = 8;
	public int partTimeHr = 4;
	public int maxWorkingDays = 20;
	public int workingDays = 0;
	public int maxWorkingHr = 100;
	public int workingHr = 0;
	public int dailyWage;
	public int hrs = 0;

	public void present(String name, int wagePerHr, int maxWorkingDays, int maxWorkingHr) {
		while (workingHr < maxWorkingHr && workingDays < maxWorkingDays) {
			int check = rand.nextInt(3) + 1;
			switch (check) {
			case isPresent -> {
				System.out.println("Employee is present.");
				hrs = fullDayHr;
			}
			case isPartTime -> {
				System.out.println("Employee is present part time.");
				hrs = partTimeHr;
			}
			case isAbsent -> hrs = 0;
			}
			workingHr = workingHr + hrs;
			workingDays = workingDays + 1;
		}
		int salary = workingHr * wagePerHr;
		System.out.println("the salary of month is of " + name + " employee is " + salary);
	}
}

public class EmpWage {

	public static void main(String[] args) {

		System.out.println("Welcome To Employee Wage Computation");
		utilityEmpWage bridgrLabz = new utilityEmpWage();
		utilityEmpWage airtel = new utilityEmpWage();
		System.out.println("For bridgeLabz employee : ");
		bridgrLabz.present("bridgeLabz", 20, 25, 180);
		System.out.println("For airtel employee : ");
		airtel.present("airtel", 25, 22, 150);
	}

}
