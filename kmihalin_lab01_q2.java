/* This program is supposed to convert 
 * a lowercase character
   to its uppercase variant */

package kmihalin_lab01;

import java.util.Scanner;

public class kmihalin_lab01_q2 {

	public static void main(String[] args) {

		// Information and program mission
		System.out.println("******************************************************");
		System.out.println("ES1036: Lab 01 Q2");
		System.out.println("Date: Oct. 02, 2018");
		System.out.println("Name: Keeana Mihalin");
		System.out.println("Student Number: 250966393");
		System.out.println("Program's mission: convert a lowercase character to its uppercase variant. ");
		System.out.println("******************************************************");

		// Declare a different type of variable
		Scanner inputScanner = new Scanner(System.in);

		// Initialize letter
		char ascii = 'x';

		// User inputs a lowercase character for 'x'
		System.out.println("Input a character:");
		ascii = inputScanner.next().charAt(0);

		// Initialize letter value
		int let = 0;
		let = (int) ascii;

		// Uppercase ASCII value is 32 less than the lowercase letter value
		let = let - 32;
		ascii = (char) let;

		// Output to console
		System.out.println("The uppercase character is: " + ascii + ".");
		ascii = inputScanner.next().charAt(0);

		// Close scanner
		inputScanner.close();
	}
}