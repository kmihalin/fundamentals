/* This program is supposed to calculate the
weighted average of four grades. */

package kmihalin_lab01;

import java.util.Scanner;

public class kmihalin_lab01_q1 {

	public static void main(String[] args) {

		// Information and program mission
		System.out.println("******************************************************");
		System.out.println("ES1036: Lab 01 Q1");
		System.out.println("Date: Oct. 02, 2018");
		System.out.println("Name: Keeana Mihalin");
		System.out.println("Student Number: 250966393");
		System.out.println("Program's mission: This program calculates the weighted average of four grades. ");
		System.out.println("******************************************************");

		// Declare grade variables
		int grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0;

		// Declare grade weight variables
		double weight1 = 0, weight2 = 0, weight3 = 0, weight4 = 0;

		// Declare weighted average
		double weightedAve = 0;

		// Declare a different type of variable
		Scanner inputScanner = new Scanner(System.in);

		// Grades and weights to be input by user
		System.out.println("Input the first grade:");
		grade1 = inputScanner.nextInt();
		System.out.println("Input the first grade weight:");
		weight1 = inputScanner.nextDouble();
		System.out.println("Input the second grade:");
		grade2 = inputScanner.nextInt();
		System.out.println("Input the second grade weight:");
		weight2 = inputScanner.nextDouble();
		System.out.println("Input the third grade:");
		grade3 = inputScanner.nextInt();
		System.out.println("Input the third grade weight:");
		weight3 = inputScanner.nextDouble();
		System.out.println("Input the fourth grade:");
		grade4 = inputScanner.nextInt();
		System.out.println("Input the fourth grade weight:");
		weight4 = inputScanner.nextDouble();

		// Calculation for weighted average
		weightedAve = ((weight1 * grade1) + (weight2 * grade2) + (weight3 * grade3) + (weight4 * grade4));

		// Output to console
		System.out.println("The course grade is: " + Double.toString(weightedAve) + ".");

		// Close Scanner
		inputScanner.close();
	}
}