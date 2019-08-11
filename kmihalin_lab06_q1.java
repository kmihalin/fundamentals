package kmihalin_lab06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class kmihalin_lab06_q1 {

	public static void main(String[] args) {//get output when methods are called for specified values
		ConsoleInput.getValidatedInteger(4, 19);
		ConsoleInput.getValidatedDouble(-34.6, 85.1);
		ConsoleInput.getValidatedChar('a', 'f');
	}
}

class ConsoleInput {
	static Scanner inputScanner = new Scanner(System.in);//declare static scanner; don't have to close after every method

	public static int getValidatedInteger(int minValue, int maxValue) { //method for integer values
		int integer = 0;
		while(integer==0) {//while loop for asking for integer in specified range
		try {
			System.out.println("Please input an integer between " + minValue + " and " + maxValue + " inclusive: ");// ask user for input
			integer = inputScanner.nextInt();
			while (integer < minValue || integer > maxValue) {//if value entered is out of range, output error statement
				System.out.println("Incorrect range!");
				System.out.print("Please input an integer between " + minValue + " and " + maxValue + " inclusive: ");//Request new value from user
				integer = inputScanner.nextInt();
			}
		} catch (InputMismatchException e) {//If incorrect data type is entered, exception is caught and error statement is output
			System.out.println("Incorrect format!");
			inputScanner.next();
		}
		}
		return integer;//integer value is returned when method is called
	}

	public static double getValidatedDouble(double minValue, double maxValue) {//method for double values
		double doubleVal = 0;
		while (doubleVal == 0) {//while loop for asking for double in specified range
			try {
				System.out.println("Please input a double between " + minValue + " and " + maxValue + " inclusive: ");// ask user for input
				doubleVal = inputScanner.nextDouble();
				while (doubleVal < minValue || doubleVal > maxValue) {//if value entered is out of range, output error statement
					System.out.println("Incorrect range!");
					System.out.println("Please input an integer between " + minValue + " and " + maxValue + " inclusive: ");//Request new value from user
					doubleVal = inputScanner.nextDouble();
				}
			} catch (InputMismatchException e) {//If incorrect data type is entered, exception is caught and error statement is output
				System.out.println("Incorrect format!");
				inputScanner.next();
			}
		}
		return doubleVal;//double value is returned when the method is called
	}

	public static char getValidatedChar(char minChar, char maxChar) {//method for character values
		char character = 0;
		while (character == 0) {//while loop asking for characters in specified range
			try {
				System.out.println("Please input a character between " + minChar + " and " + maxChar + " inclusive: ");// ask user for input
				character = inputScanner.next().charAt(0);
				while (character < minChar || character > maxChar) {//if value entered is out of range, output error statement
					System.out.println("Incorrect range!");
					System.out.println("Please input an integer between " + minChar + " and " + maxChar + " inclusive: ");//Request new value from user
					character = inputScanner.next().charAt(0);
				}
			} catch (InputMismatchException e) {//If incorrect data type is entered, exception is caught and error statement is output
				System.out.println("Incorrect format!");
				inputScanner.next();
			}
		}
		return character;//character is returned when the method is called

	}

}
