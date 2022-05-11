package com.bilgeadam.boost.java.lesson018;

public class Test {

	public static void main(String[] args) {

		// Abstract sınıftan neste üretmeye çalıştığımız için hata verdi.
//		Employee e = new Employee("Semih", "Bursa", 16);

		Salary s = new Salary("Semih", "Bursa", 16, 15000);
		Employee e = new Salary("Tuğce", "İstanbul", 34, 16000);
		s.mailCheck();
		e.mailCheck();
	}

}
