package com.bilgeadam.boost.java.lesson027;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndCalendarExample {

	public static void main(String[] args) {

		Date today = new Date();
		System.out.println("Today: "+today);
		
		Date d27022017 = new Date(117,1,27); //yıl için -1900 yapılır.
		System.out.println(d27022017);
		
		Calendar c27022017 = new GregorianCalendar(2017,1,27);
		System.out.println(c27022017.getTime());
		
		DateFormat ddMMyyyy = new SimpleDateFormat("dd/MMMM/yyyy");
		System.out.println(ddMMyyyy.format(d27022017));
		
		
	}

}
