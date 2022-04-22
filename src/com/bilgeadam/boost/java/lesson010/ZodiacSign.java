package com.bilgeadam.boost.java.lesson010;

import java.util.Scanner;

public class ZodiacSign {

	public static void main(String[] args) {
		int day,month ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter day(1-31):");
		day = scanner.nextInt();
		System.out.println("Please enter month(1-12):");
		month = scanner.nextInt();
		scanner.close();
		
	if((month==1)&&(day<=20)||(month==12)&&(day>=22)) {
			System.out.println("Capricorn");
		}else if ((month == 1) || (month == 2) && (day <= 19)) {
			System.out.println("Aquarius");
		}else if ((month == 2) || (month == 3) && (day <= 20)) {
			System.out.println("Pisces");
		}else if ((month == 3) || (month == 4) && (day <= 19)) {
			System.out.println("Aries");
		}else if ((month == 4) || (month == 5) && (day <= 21)) {
			System.out.println("Taurus");
		}else if ((month == 5) || (month == 6) && (day <= 21)) {
			System.out.println("Gemini");
		}else if ((month == 6) || (month == 7) && (day <= 23)) {
			System.out.println("Cancer");
		}else if ((month == 7) || (month == 8) && (day <= 23)) {
			System.out.println("Leo");
		}else if ((month == 8) || (month == 9) && (day <= 23)) {
			System.out.println("Virgo");
		}else if ((month == 9) || (month == 10) && (day <= 23)) {
			System.out.println("Libra");
		}else if ((month == 10) || (month == 11) && (day <= 22)) {
			System.out.println("Scorpio");
		}else if ((month == 12)) {
			System.out.println("Sagittarius");

	}else System.out.println("Wrong data!");
		
		

	}

}
