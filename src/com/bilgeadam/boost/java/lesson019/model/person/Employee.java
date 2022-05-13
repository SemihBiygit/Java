package com.bilgeadam.boost.java.lesson019.model.person;

import java.time.LocalDate;
/*
 * Çalışan numarası EMP-001
 */

public class Employee extends Person {

	private static int employeeCounter;
	private double salary;
	private LocalDate startDate;
	private EmployeePosition position;
	
	public Employee(String name, LocalDate birthDate) {
		super(name, birthDate);
		idNumber = this.generateID(); 

	}

	@Override
	public String toString() {
		return "Employee [salary=" + this.salary + ", startDate=" + this.startDate + ", position=" + this.position
				+ ", employeeID=" + this.idNumber + "]";
	}

	@Override
	public String generateID() {
		String num = String.format("%03d",++employeeCounter);
		return "EMP-"+ num;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public EmployeePosition getPosition() {
		return this.position;
	}

	public void setPosition(EmployeePosition position) {
		this.position = position;
	}
}
