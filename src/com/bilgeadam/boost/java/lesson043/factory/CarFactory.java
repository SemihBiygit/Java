package com.bilgeadam.boost.java.lesson043.factory;

public class CarFactory {

	public static Car buildCar(CarType model) {

		Car car = null;

		switch (model) {

		case HATCHBACK: {
			car = new HatchBackCar();
			break;
		}
		case SEDAN: {
			car = new SedanCar();
			break;
		}
		case OFFROAD: {
			car = new OffRoadCar();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + model);
		}
		return car;
	}

}
