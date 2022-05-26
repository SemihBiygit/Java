package com.bilgeadam.boost.java.lesson027;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthDayExample {

	public static void main(String[] args) {

		DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		DateTimeFormatter shortFormat = DateTimeFormatter.ofPattern("dd/MMMM");
		System.out.println("Today : " + LocalDate.now().format(inputFormat));

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your birthday(dd.MM.yy) :");
		String input = scanner.nextLine();
		
		LocalDate birthDate = LocalDate.parse(input,inputFormat);
		
		if(birthDate.isAfter(LocalDate.now())) {
			System.err.println("You were not born yet!");
		}
		
		System.out.println(birthDate.format(inputFormat)+" was a wonderful day...");
		System.out.println("You were born on "+birthDate.getDayOfWeek());
		
		long days = birthDate.until(LocalDate.now(),ChronoUnit.DAYS);
		long weeks = birthDate.until(LocalDate.now(),ChronoUnit.WEEKS);
		long years = birthDate.until(LocalDate.now(),ChronoUnit.YEARS);
		
		System.out.println("You have lived "+days+ " days, "+weeks+ " weeks, "+years+ " years until to date.");
		
		LocalDate nextBDate = birthDate.plusYears(years+1);
		System.out.println("Your next birthday is :"+nextBDate.format(inputFormat));
		System.out.println(LocalDate.now().until(nextBDate, ChronoUnit.DAYS)+" more days to celebrate your next birthday.");
		
		LocalDate halfBDate = birthDate.plusMonths(6);
		System.out.println("You celebrate your half birthday at "+halfBDate.format(shortFormat));
		
		scanner.close();
	
	
	}

}
