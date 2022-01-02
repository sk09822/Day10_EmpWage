package com.blz.day10;

import java.util.Random;

class utilityEmpWage {
	Random rand = new Random();
	public int isPresent = 1;
	public int isAbsent = 2;

	public void present() {
		int check = rand.nextInt(2) + 1;
		if (check == isAbsent) {
			System.out.println("Employee is absent.");
		} else {
			System.out.println("Employee is present.");
		}
	}
}

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation");
		utilityEmpWage empWage = new utilityEmpWage();
		empWage.present();
	}

}
