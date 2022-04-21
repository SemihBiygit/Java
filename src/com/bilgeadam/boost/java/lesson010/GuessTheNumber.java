package com.bilgeadam.boost.java.lesson010;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Random rnd = new Random();					//class for generating random numbers
		int numberToGuess; 			
		do {
			numberToGuess = rnd.nextInt(101);		
		} while (numberToGuess ==0 || numberToGuess ==50);	//generates an integer between 1 and 100 except 50
		boolean numberFound = false; 				//in the first case the number is not found
		Scanner scanner = new Scanner(System.in);	//we opened the scanner
		int guess;									//predicted number
		int guessCount = 0;
		
	do {
		do {
			System.out.println("Please enter a intiger number between 0-100");
			guess = scanner.nextInt();
			if (0> guess || guess > 100) {
				System.err.println("Please be careful!");
			}
		} while (!( 0 <= guess && guess <=100));
		
		if (guess == 0) {
			break;				//break immediately terminates a loop.
		}
		if(guess == 50) {
			System.out.println("You cannot enter 50");
			continue;			// continue stops a loop from continuing and returns to the beginning of the loop
		}
		guessCount++;
		System.out.println();
		if (guess == numberToGuess) {
			System.out.println("Congrasts!!You got the right number on the "+ guessCount+". try");
			numberFound = true ;					//number found
			}
		else {
			if (guess > numberToGuess) {
					System.out.println(guessCount+". try is too high");
			}
			else {
					System.out.println(guessCount+". try is too low");
				}
			}
		} while (!numberFound && guessCount <= 10);
		
		scanner.close();
		if (!numberFound) {
			System.err.println("You tried too many wrong");
		}
		System.out.println("I hope you had fun!!");
		
	}

}
