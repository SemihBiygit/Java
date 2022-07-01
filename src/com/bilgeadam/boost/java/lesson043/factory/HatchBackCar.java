package com.bilgeadam.boost.java.lesson043.factory;

public class HatchBackCar extends Car {

	public HatchBackCar() {
		super(CarType.HATCHBACK);
		construct();

	}

	@Override
	protected void insertTyres() {
		System.out.println("Inserted 17' tyres.");

	}

	@Override
	protected void placeGasTank() {
		System.out.println("40L tank placed.");
	}

}
