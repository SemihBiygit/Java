package com.bilgeadam.boost.java.lesson027;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodOrDuration {

	public static void main(String[] args) {

		// period. (days, weeks, months, years.)
		Period examplePeriod = Period.of(1, 01, 14);
		System.out.println(examplePeriod);
		
		LocalDate localDate = LocalDate.now().plus(examplePeriod);
		System.out.println(localDate);
		
		// duration. (days, hours, minutes, seconds.)
		Duration exampleDuration = Duration.ofHours(5);
		System.out.println(exampleDuration);
		
		LocalTime localTime = LocalTime.now().plus(exampleDuration);
		System.out.println(localTime);
	}

}
