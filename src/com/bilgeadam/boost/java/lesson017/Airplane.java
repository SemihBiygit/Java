package com.bilgeadam.boost.java.lesson017;

public class Airplane extends Vehicle {
	private double spanLength;
	private double maxHeight;

	public Airplane(String brand) {
		super(brand);
	}

	public Airplane(String brand, String color) {
		super(brand, color);
		this.engine = "Hibrid";
		this.setName("THY");
		this.setSpeed(1000);
	}

	public void tellAboutYourself() {
		System.out.println("Ben bir ucagım");
	}

	public double getSpanLength() {
		return this.spanLength;
	}
}
