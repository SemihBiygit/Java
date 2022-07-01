package com.bilgeadam.boost.java.lesson043.factory;

public abstract class Car {

	private CarType model;

	public Car(CarType model) {
		this.model = model;
	}

	protected abstract void insertTyres();

	protected abstract void placeGasTank();

	protected void construct() {
		insertTyres();
		placeGasTank();
	}

	public CarType getModel() {
		return this.model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

}
