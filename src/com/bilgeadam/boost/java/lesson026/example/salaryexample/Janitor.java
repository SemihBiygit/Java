package com.bilgeadam.boost.java.lesson026.example.salaryexample;

public class Janitor extends Employee {

	public Janitor(String firstName, String lastName, String job, double salary) {
		super(firstName, lastName, job, salary);
	}

	@Override
	public String increaseSalary(double salary) {
		salary = salary * 1.4;
		return "New salary " + salary;

	}

}
