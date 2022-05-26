package com.bilgeadam.boost.java.lesson027;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {

		ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault());
		System.out.println(zonedDateTime);
		
		ZoneId australiaSydneyZoneId = ZoneId.of("Australia/Sydney");
		ZonedDateTime australiaSydneyZoneDateTime = ZonedDateTime.of(LocalDateTime.now(), australiaSydneyZoneId);
		System.out.println(australiaSydneyZoneDateTime);
		
		
	}

}
