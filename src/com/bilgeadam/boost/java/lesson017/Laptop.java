package com.bilgeadam.boost.java.lesson017;

public class Laptop extends Computer{
	
	private int batteryCapacity;
	private String color;
	
	void stateOfCharge(int batteryCapacity) {
		if(batteryCapacity<20) {
			System.out.println(getBrand()+"Pil zayif: "+batteryCapacity);
		}else {
			System.out.println(getBrand()+"Pil durumu: 0"+batteryCapacity);
		}
	}
	
	

	@Override
	void connectWeb() {
		System.out.println(getBrand()+" markali laptop internete baglandi");
	}



	public int getBatteryCapacity() {
		return this.batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
