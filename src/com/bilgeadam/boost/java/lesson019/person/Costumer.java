package com.bilgeadam.boost.java.lesson019.person;
/*
 * Müşteri numarası CST-001
 */

import java.time.LocalDate;

public class Costumer extends Person {

	private static int customerCounter;
	private boolean isClose;
	private String favoriteProduct;

	public Costumer(String name, LocalDate birthDate) {
		super(name, birthDate);
		idNumber = this.generateID();
		
		
	}

	@Override
	public String toString() {
		return "Costumer [isClose=" + this.isClose + ", favoriteProduct=" + this.favoriteProduct + ", customerID="
				+ this.idNumber + "]";
	}

	@Override
	public String generateID() {
		String num = String.format("%03d",++customerCounter);		
		return "CST-"+ num;
	}
}
