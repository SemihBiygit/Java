package com.bilgeadam.boost.java.lesson017;

public class Vehicle {

	private String brand;
	private String name;
	private String color;
	protected String engine;
	private int speed;

	public Vehicle(String brand) {
		this.brand = brand;
	}

	public Vehicle(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}

	public Vehicle(String brand, String color, String name) {
		this.brand = brand;
		this.color = color;
		this.name = name;
	}

	public void tellAboutYourself() {
		System.out.println("Ben bir aracım");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getBrand() {
		return this.brand;
	}

	public String getName() {
		return this.name;
	}

	public String getColor() {
		return this.color;
	}

	public String getEngine() {
		return this.engine;
	}

	public int getSpeed() {
		return this.speed;
	}

}