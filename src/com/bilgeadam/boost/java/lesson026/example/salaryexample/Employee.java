package com.bilgeadam.boost.java.lesson026.example.salaryexample;

public abstract class Employee implements Accountable {

	private String firstName;
	private String lastName;
	private String job;
	private double salary;

	public Employee(String firstName, String lastName, String job, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.job = job;
		this.salary = salary;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + this.firstName + ", lastName=" + this.lastName + ", job=" + this.job
				+ ", salary=" + this.salary + "]";
	}

}
