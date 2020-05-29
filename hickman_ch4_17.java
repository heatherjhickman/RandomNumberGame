package hickman_ch4_17;

import java.util.Random;
import java.util.Scanner;

public class hickman_ch4_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Author: Heather Hickman
		Class: CPT 236 H01 Intro to Java Programming
		Date written: 7/24/2019
		Date last updated: 7/24/2019
		Program name: hickman_ch4_17.java
		
		Program summary: Chapter 4, Challenge 17, "Random Number Guessing Game" - For Assignment Forgiveness
		Summary: Write a program that generates a random number and asks the user to guess what the number is.
		If the user's guess is higher than the random number, the program should display "Too high, try again."
		If the user's guess is lower than the random number, the program should display "Too low, try again."
		The program should use a loop that repeats until the user correctly guesses the random number. */
		
		// Import random to generate a random number and create scanner keyboard
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		// Initialize variables
		int randNum = random.nextInt(51);
		boolean correctGuess = false;
		int userGuess;
		
		// Tell the user what the range of possible numbers is
		System.out.print("A random number between 0-50 has been selected by the computer.");
		
		// Use a while loop to allow the user to guess until they get the number correct
		// Nest an if/else statement inside the while to tell the user if they are guessing too high or low
		// If user guesses correctly, set correctGuess to true to exit the loop
		while ( !correctGuess ) {
			System.out.print("\nGuess what the number is: ");
			userGuess = keyboard.nextInt();
			
			if (userGuess < randNum) {
				System.out.print("Too low, try again!\n"); }
			
			else if (userGuess > randNum) {
				System.out.print("Too high, try again!\n"); }
			
			else { System.out.print("You guessed correctly!");
					correctGuess = true;}	}
	
	}
}
