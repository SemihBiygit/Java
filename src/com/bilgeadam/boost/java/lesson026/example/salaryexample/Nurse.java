package com.bilgeadam.boost.java.lesson026.example.salaryexample;

public class Nurse extends Employee {

	public Nurse(String firstName, String lastName, String job, double salary) {
		super(firstName, lastName, job, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String increaseSalary(double salary) {
		salary = salary * 1.4;
		return "New salary " + salary;

	}

}