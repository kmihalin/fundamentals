package kmihalin_lab05;

public class kmihalin_lab05_q1 {
	
	public static void print(char a) { //Method for outputting a character

		System.out.println("The character is " + a + "."); //Output the statement and character value to user
	}

	public static void print(int b) {//Method for outputting an integer

		System.out.println("The integer is " + b + "."); //Output the statement and integer value to user

	}

	public static void print(String c) {//Method for outputting a string

		System.out.println("The string is " + c + ".");//Output the statement and string value to user

	}

	public static void print(double d) {//Method for outputting a double

		System.out.println("The double is " + d + ".");//Output the statement and double value to user

	}

	public static void print(boolean e) {//Method for outputting a boolean type

		System.out.println("The boolean is " + e + ".");//Output the statement and boolean value to user

	}
	
	public static void main(String[] args) {
		print(3); //Call on different methods for specific input types
		print('f');
		print(4>3);
		print(9.81);
		print("great");

	}
}
