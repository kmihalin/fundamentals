package kmihalin_lab04;

import java.util.Scanner;

class WordGame {
	public WordGame() {// method for new word game
		// Declare and initialze variables
		int turn = 0;
		char guess = 'y', letter = 'x';
		boolean answer = false;
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter a word to begin the game: ");
		String secretWord = inputScanner.nextLine();// User enters a secret word
		StringBuilder word = new StringBuilder(secretWord);// Copies secret word
		StringBuilder hide = new StringBuilder(secretWord); // Hides all characters of secret word with asterisks

		for (int i = 0; i < hide.length(); i++)
			hide.setCharAt(i, '*');// Changes every letter of secret word to asterisks

		while (turn < 10) {// When the number of turns is less than 10, ask user the following
			do {
				System.out.println("Would you like to guess the word?");
				guess = inputScanner.next().charAt(0);// user decides to make a guess or enter word

				if (guess != 'y' & guess != 'n') {// If any other character is entered, user is asked for y/n again
					System.out.println("Incorrect input, please enter y or n: ");
					}
				}

			while (guess != 'y' & guess != 'n');
		
			if (guess == 'y') { // if user wants to guess word
				System.out.println("Please enter your choice: ");
				secretWord = inputScanner.next();

				turn++;// Increase turn count by 1

				if (word.toString().equals(secretWord)) { // If the word with inputed letter(s) matches the
															// secret word, win statement is shown
					System.out.println(secretWord);
					System.out.println("You win with " + (10 - turn) + " turn(s) remaining!");
					answer = true;// Loop ended; word guessed
				}
			
			else 
				System.out.println("That guess is incorrect!");//If guess is incorrect output to user
				
				
			}

			else if (guess == 'n') {// If user wants to guess a character
				System.out.println("Input a character to make a guess: ");
				letter = inputScanner.next().charAt(0);// User inputs character

				for (int i = 0; i < word.length(); i++)
					if (letter == word.charAt(i)) { // If the letter matches one in the secret word,
						hide.setCharAt(i, letter);// Asterisk is changed to real letter
					}

						System.out.println("\n" + hide); // Word with filled in letters is output
						turn++; // Increases turn count by 1
						
						if (word.toString().equals(hide.toString())) { // If the inputed letter(s) match the
							// secret word, win statement is shown
							System.out.println("You win with " + (10 - turn) + " turn(s) remaining!");
							answer = true;// Loop ended; word guessed
						}
			}
			
			if (answer == true) {// If the user guesses the secret word, the loop ends
				break;
			}
		}
		
		

		if (turn == 10) {// if all attempts used, secret word is output to user
			System.out.println("You have no more turns left. The secret word was " + secretWord + ".");
			inputScanner.close();
		}

		
	}
		
	}




public class kmihalin_lab04_q2 {

	public static void main(String[] args) {
		WordGame game = new WordGame();
	}

}
