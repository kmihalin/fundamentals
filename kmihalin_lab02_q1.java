package kmihalin_lab02;

import java.util.Scanner;

public class kmihalin_lab02_q1 {

	public static void main(String[] args) {
		// Declare a different type of variable
		Scanner inputScanner = new Scanner(System.in);

		// Information and program mission
		System.out.println("------------------------------");
		System.out.println("Name: Keeana Mihalin");
		System.out.println("Lab 02");
		System.out.println("Date: Oct. 16, 2018");
		System.out.println("Question 1");
		System.out.println("------------------------------");
		String conversions = "******************************\n" + "****** Value Conversion ******\n"
				+ "******************************\n" + "* 1. Celsius -> Fahrenheit *\n"
				+ "* 2. Centimeters -> Inches *\n" + "* 3. Meters -> Feet        *\n" + "* 4. Km/h -> MPH           *\n"
				+ "* 5. Exit                  *\n" + "******************************";

		// Use to loop program once conversion is complete
		boolean loop = true;
		while (loop) {
			System.out.println(conversions);

			// User must input integer to select conversion
			System.out.println("Please input a choice (1-5): ");

			// Declare and initialize variable
			int value = inputScanner.nextInt();

			// Validate user has entered an appropriate integer
			while (value < 0 || value > 5) {
				System.out.println("Input number is not valid.");
				System.out.println("Please input a choice (1-5): ");
				value = inputScanner.nextInt();
			}

			System.out.println("Input number has been validated.");

			// Declare switch cases
			String valueString;
			switch (value) {
			case 1:
				valueString = "Celsius to Farenheit";
				break;
			case 2:
				valueString = "Centimeters to Inches";
				break;
			case 3:
				valueString = "Meters to Feet";
				break;
			case 4:
				valueString = "Km/h to MPH";
				break;
			case 5:
				valueString = "Exit";
				break;
			default:
				valueString = conversions;
				break;
			}

			// State which case has been selected
			System.out.println(valueString);

			// conversion from Farenheit to Celsius
			if (value == 1) {
				System.out.println("Input a degree in Celsius: ");
				double celsius = inputScanner.nextInt();
				double farenheit;
				farenheit = (9.0 / 5) * celsius + 32;
				if (celsius < 0) {
					System.out.println("The conversion is " + farenheit + " F.");
					System.out.println("Ice may be possible, please be careful.");
				} else {
					System.out.println("The conversion is " + farenheit + " F.");
				}
			}

			// conversion from centimeters to inches
			if (value == 2) {
				System.out.println("Input a length in centimeters: ");
				double centimeter = inputScanner.nextInt();
				while (centimeter < 0) {
					System.out.println("Input a length in centimeters: ");
					centimeter = inputScanner.nextInt();
				}
				double inches;
				inches = 0.39 * centimeter;
				System.out.println("The conversion is " + inches + " in.");
			}

			// conversion from meters to feet
			if (value == 3) {
				System.out.println("Input a length in meters: ");
				double meter = inputScanner.nextInt();
				while (meter < 0) {
					System.out.println("Input a length in meters: ");
					meter = inputScanner.nextInt();
				}
				double feet;
				feet = 3.28 * meter;
				System.out.println("The conversion is " + feet + " ft.");
			}

			// conversion from Km/h to MPH
			if (value == 4) {
				System.out.println("Input a number of Km/h (0-160): ");
				double kmh = inputScanner.nextInt();
				while (kmh < 0 || kmh > 160) {
					System.out.println("Input a number of Km/h (0-160): ");
					kmh = inputScanner.nextInt();
				}
				double mph;
				mph = kmh / 1.609;
				System.out.println("The conversion is " + mph + " MPH.");
			}
			// exit program
			if (value == 5) {
				loop = false;
				System.out
						.println("------------------------------\n" + "Goodbye!\n" + "------------------------------");
			}

		}
		// Close scanner
		inputScanner.close();

	}

}