package com.bilgeadam.boost.java.lesson018;

public abstract class Employee {
	private String name;
	private String address;
	private int number;

	public Employee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public double computePay() {
		System.out.println("Inside Employee computePay");
		return 0.0;
	}

	public void mailCheck() {
		System.out.println("Mailing check to " + this.name + " " + this.address);
	}

	@Override
	public String toString() {
		return "Employee [name=" + this.name + ", address=" + this.address + ", number=" + this.number + "]";
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public int getNumber() {
		return this.number;
	}

}
