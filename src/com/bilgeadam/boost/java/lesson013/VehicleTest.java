package com.bilgeadam.boost.java.lesson013;

public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle();
		v1.setAutomaticGear(true);
		v1.setColor("blue");
		v1.setLabel("Porsche");
		v1.setMaxSpeed(250);
		
		System.out.println(v1.toString());			
	}
}
