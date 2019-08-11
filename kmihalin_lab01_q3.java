package kmihalin_lab01;

import java.util.Scanner;

public class kmihalin_lab01_q3 {

	public static void main(String[] args) {

		// Information and program mission
		System.out.println("******************************************************");
		System.out.println("ES1036: Lab 01 Q2");
		System.out.println("Date: Oct. 02, 2018");
		System.out.println("Name: Keeana Mihalin");
		System.out.println("Student Number: 250966393");
		System.out.println("Program's mission: Solve a quadratic with the form\n" + "   ax^2 + bx + c = 0. ");
		System.out.println("******************************************************");

		// Declare a different type of variable
		Scanner inputScanner = new Scanner(System.in);

		// Declare variables
		double a = 0, b = 0, c = 0;

		// Declare imaginary unit
		char imagNum;
		imagNum = 'i';

		// User inputs variable coefficients
		System.out.println("Please input a:");
		a = inputScanner.nextDouble();
		System.out.println("Please input b:");
		b = inputScanner.nextDouble();
		System.out.println("Please input c:");
		c = inputScanner.nextDouble();

		// Calculation for discriminant
		double disc = (Math.pow(b, 2.0)) - (4 * a * c);

		if (a == 0 & b != 0 & c == 0) {
			System.out.println("There are infinitely many solutions!");
		} else if (a == 0 & b == 0 & c == 0) {
			System.out.println("The solution is trivial!");
		} else if (a == 0 & b != 0 & c != 0) {
			double x = -c / b;
			System.out.println("Your equation has one real root: " + (x) + ".");
		} else if (a != 0 & disc > 0) {
			double x1 = ((-b + Math.sqrt(disc)) / 2 * a);
			double x2 = ((-b - Math.sqrt(disc)) / 2 * a);
			System.out.println("Your equation has real roots: " + (x1) + " , " + (x2) + ".");
		} else {
			double real = (-b / (2 * a));
			double imag = (Math.sqrt(-disc)) / 2 * a;
			System.out.println("Your equation has complex roots: " + (real) + " + " + (imag) + (imagNum) + " , "
					+ (real) + " - " + (imag) + (imagNum) + ".");
		}
		// Close scanner
		inputScanner.close();
	}
}
