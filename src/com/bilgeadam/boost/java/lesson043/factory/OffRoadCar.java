package com.bilgeadam.boost.java.lesson043.factory;

public class OffRoadCar extends Car {

	public OffRoadCar() {
		super(CarType.OFFROAD);
		construct();

	}

	@Override
	protected void insertTyres() {
		System.out.println("Inserted 19' tyres.");

	}

	@Override
	protected void placeGasTank() {
		System.out.println("70L tank placed.");

	}

}
