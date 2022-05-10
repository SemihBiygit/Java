package com.bilgeadam.boost.java.lesson017;

public class VehicleTest {

	public static void main(String[] args) {

		Vehicle v1 = new Vehicle("Fiat", "blue", "tofas");
		v1.setSpeed(100);
		System.out.println("Brand: " + v1.getBrand() + " Speed: " + v1.getSpeed() + " Color: " + v1.getColor()
				+ " Name: " + v1.getName());

		Airplane a1 = new Airplane("Boing", "grey");
		System.out.println("Brand: " + a1.getBrand() + " Speed: " + a1.getSpeed() + " Color: " + a1.getColor()
		+ " Name: " + a1.getName());
		a1.tellAboutYourself();
		v1.tellAboutYourself();
	}

}
