package com.bilgeadam.boost.java.lesson043.factory;

public class SedanCar extends Car {

	public SedanCar() {
		super(CarType.SEDAN);
		construct();
	}

	@Override
	protected void insertTyres() {
		System.out.println("Inserted 18' tyres.");		
	}

	@Override
	protected void placeGasTank() {
		System.out.println("50L tank placed.");
		
	}

}
