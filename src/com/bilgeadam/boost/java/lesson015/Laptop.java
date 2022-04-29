package com.bilgeadam.boost.java.lesson015;

public class Laptop {
	
	
	private String brand;
	private int ramSize;
	private int batteryCapacity;
	private int screenSize;
	
	void connectWeb() {
			System.err.println("You are connected to the internet.");
		}
	
	void showFeatures() {
		System.out.println("System Features:\nBrand: "+brand+"\nRam Size: "+ramSize+" \nBattery Capacity: "+batteryCapacity+"\nScreen Size: "+screenSize);
	}
	void remainingBattery() {
		System.out.println("Remaining Battery: "+batteryCapacity);
		if(batteryCapacity<=0) {
			System.err.println("Dead Battery!! Please charge!");
		}
	}
	
	////////////////SETTERS////////////////////
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}


	////////////////////GETTERS////////////////////
	public String getBrand() {
		return brand;
	}
	public int getRamSize() {
		return ramSize;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public int getScreenSize() {
		return screenSize;
	}

	}

