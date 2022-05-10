package com.bilgeadam.boost.java.lesson017;

public class Computer {

	private String brand;
	private int ramSize;
	private double screenSize;

	public Computer() {

	}

	public Computer(String brand, int ramSize, double screenSize) {
		this.brand = brand;
		this.ramSize = ramSize;
		this.screenSize = screenSize;

	}

	void connectWeb() {
		System.out.println(brand + " internete baglandi.");
	}

	void runProgram(String program) {
		System.out.println(brand + program + " programini calistirdi.");
	}
	void showFeatures() {
		
		System.out.println( "Computer [brand=" + this.brand + ", ramSize=" + this.ramSize + ", screenSize=" + this.screenSize + "]");;
	}

	
	

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRamSize() {
		return this.ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public double getScreenSize() {
		return this.screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
}
