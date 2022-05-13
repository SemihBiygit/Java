package com.bilgeadam.boost.java.lesson019.model.product;

import java.time.LocalDate;

import com.bilgeadam.boost.java.lesson019.model.person.Costumer;
import com.bilgeadam.boost.java.lesson019.model.person.Employee;
import com.bilgeadam.boost.java.lesson019.model.person.EmployeePosition;
import com.bilgeadam.boost.java.lesson019.model.person.Person;

public class MyMarket {

	public static void main(String[] args) {

		Person e3 = new Employee ("Çalışan3", LocalDate.of(1979, 4, 20));
		Person c3 = new Costumer ("MÜşteri3", LocalDate.of(1980, 4, 20));
		Employee e1 = new Employee ("Çalışan1",LocalDate.now());
		Employee e2 = new Employee ("Çalışan2",LocalDate.now());
		e1.setPosition(EmployeePosition.CASHIER);
		e2.setPosition(EmployeePosition.MANAGER);
		Costumer c1 = new Costumer ("Müşteri1",LocalDate.of(1977, 4, 5));
		Costumer c2 = new Costumer ("Müşteri2",LocalDate.of(1987, 4, 5));
		
		System.out.println(e2);
		System.out.println(e1);
		System.out.println(c2);
	}

}
