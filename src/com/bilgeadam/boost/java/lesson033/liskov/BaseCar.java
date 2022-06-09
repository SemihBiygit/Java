package com.bilgeadam.boost.java.lesson033.liskov;
/* 
(S.O.L.I.D. Princibles) 
Single Responsibility Principle (
Open-Closed Principle
Liskov's Substituion Principle
Interface Segregation Principle
Depency Injection Principle
*/
public abstract class BaseCar {

	public int tripKm(int distance) {
			return distance;
	}
	public abstract double getCostPerKm();	
	
	public void sendTripInfoMailToDrive() {
		System.out.println("E-mail: some trip info...");
	}
	
//	public void sendTripInfoSMSToDrive() {                          
//		System.out.println("SMS : some trip info...");
//	}
}
