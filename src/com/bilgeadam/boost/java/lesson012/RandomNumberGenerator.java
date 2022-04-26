package com.bilgeadam.boost.java.lesson012;

import java.util.Random;
import java.util.Scanner;
//////////Program that generates random numbers up to the number entered except 12.//////////
public class RandomNumberGenerator {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number up to which number you want to generate random numbers: ");
		int upperBound = in.nextInt();
		in.close();
		System.out.println("1.Random Number: " + getRandomNumber(upperBound));
		System.out.println("2.Random Number: " + getRandomNumber(upperBound));
		System.out.println("3.Random Number: " + getRandomNumber(upperBound));
		System.out.println("4.Random Number: " + getRandomNumber(upperBound));
		System.out.println("5.Random Number: " + getRandomNumber(upperBound));
		System.out.println("6.Random Number: " + getRandomNumber(upperBound));
		
		
	}

	private static int getRandomNumber(int upperBound) {
		Random rnd = new Random();
		int randomNumber = -1;
		
		do {
			randomNumber = rnd.nextInt(upperBound+1);
		}while (randomNumber == 12);
		
		return randomNumber;
		
	}

}
