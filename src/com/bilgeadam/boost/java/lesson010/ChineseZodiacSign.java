package com.bilgeadam.boost.java.lesson010;

import java.util.Scanner;

public class ChineseZodiacSign {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your birth year:");
		int birthYear = scanner.nextInt();
		int mod = birthYear%12;
		String zodiac ="";
		scanner.close();
		
		switch (mod) {
		case 0:
			zodiac ="Monkey";
			break;
		case 1:
			zodiac = "Rooster";
			break;
		case 2:
			zodiac = "Dog";
			break;
		case 3:
			zodiac = "Pig";
			break;
		case 4:
			zodiac = "Mouse";
			break;
		case 5:
			zodiac = "Ox";
			break;
		case 6:
			zodiac = "Tiger";
			break;
		case 7:
			zodiac = "Rabbit";
			break;
		case 8:
			zodiac = "Dragon";
			break;
		case 9:
			zodiac = "Snake";
			break;
		case 10:
			zodiac = "Horse";
			break;
		case 11:
			zodiac = "Goat";
			break;
			
		default:
			System.out.println("Wrong Entry");
			break;
}
		System.out.println("Your Chineese Zodiac is " + zodiac);
}
}