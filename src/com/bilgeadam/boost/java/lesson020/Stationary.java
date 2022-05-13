package com.bilgeadam.boost.java.lesson020;

public class Stationary extends Product {
	private String color;

	public Stationary(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	@Override
	public String toString() {
		return "Stationary [color=" + this.color + "]";

	}

	@Override
	public double endPrice(double discountRate) {

		return this.getPrice() * discountRate * 0.18 * 0.20;
	}
}
