package kmihalin_lab03;

import java.util.Scanner;

public class kmihalin_lab03_q3 {

	public static void main(String[] args) {
		// Employ scanner to retrieve user values
		Scanner inputScanner = new Scanner(System.in);

		// Ask user for employee info
		System.out.println("Enter the employee’s first name: ");
		Employee.m_firstName = inputScanner.next();
		System.out.println("Enter the employee’s last name: ");
		Employee.m_lastName = inputScanner.next();
		System.out.println("Enter the employee’s salary: ");
		Employee.m_Salary = inputScanner.nextInt();

		// Calls method to print given employee info
		Employee.printInfo();
		System.out.println("Goodbye!");

		// Close scanner
		inputScanner.close();
	}

}

//Create new class for employee
class Employee {
	// Create methods for the member variables
	public static String m_firstName;
	public static String m_lastName;
	public static int m_Salary;

	// Create constructor to handle inputed values
	public Employee(String fName, String lName, int Salary) {
		// Declare data members
		Employee.m_firstName = fName;
		Employee.m_lastName = lName;
		Employee.m_Salary = Salary;
	}

	// Outputs user information to console
	static void printInfo() {
		System.out.println("First Name: " + m_firstName);
		System.out.println("Last Name: " + m_lastName);
		System.out.println("Salary: " + m_Salary + "\n");
	}

}
