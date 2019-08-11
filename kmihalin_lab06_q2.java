package kmihalin_lab06;

import java.util.Scanner;

public class kmihalin_lab06_q2 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);//declare scanner
		int i = 0;//Declare and initialize variables
		double finalGrade = 0, weightSum = 0;
		boolean sum = true, entry = true;
		System.out.println("How many assignments would you like to compute? ");//Ask user for number of assignments
		int assignments = inputScanner.nextInt();
		int grade[] = new int[assignments];//Initialize array for both grade and grade weight
		double weight[] = new double[assignments];
		while (sum == true) {//loop for the calculation of the weight sum and the final grade
			for (i = 0; i < assignments; i++) {//loop to ask user for grades and weights
				while(entry=true) {//loop for grade and weight of an iteration 
					try {
					System.out.println("Input grade " + (i + 1) + " (0-100): ");//Ask user for a grade value
					grade[i] = inputScanner.nextInt();
					System.out.println("Input grade weight " + (i + 1) + " (0.0-1.0): ");//Ask user for the weight of the grade
					weight[i] = inputScanner.nextDouble();
					if(weight[i]<0.0 || weight[i]>1.0 || grade[i]<0 || grade[i]>100) {//If the grade or weight is out of the range, throw an exception
						throw new Exception();
						}
				} catch (Exception e) {
					System.out.println("Incorrect grade input!");//When exception is caught, output error message
					entry=true;//loop again for specific grade and weight
				}
				finally {
					if((grade[i]<=100 & grade[i]>=0)&(weight[i]<=1.0 & weight[i]>=0.0)) {//If all conditions are satisfied, loop is broken
						entry=false;
						break;
					}
				}
				}
				weightSum = weightSum + weight[i];//Calculation for sum of the weights
				finalGrade = finalGrade + (grade[i]) * (weight[i]);//Calculation for the final grade
				
			}
			
			if(weightSum != 1.0) {//if the sum of the weights is not equal to one, output error message
				System.out.println("The weights do not sum to 1! " + "\n"
						+ "Please enter all weights again.");
				weightSum=0;//clear stored sum and grade
				finalGrade=0;
				sum=true;//loop again to ask user to reenter all grades and weights
			}
			else{
				sum=false;//if sum is equal to one, break loop
			}
				
		}

		System.out.print("The course grade is: " + finalGrade);//Output final grade to user
		inputScanner.close();//Close scanner
	}
}
