package com.bilgeadam.boost.java.lesson043.factory;

public class Test {

	public static void main(String[] args) {
		
		Car car = CarFactory.buildCar(CarType.OFFROAD);
		System.out.println(car);
	}

}
