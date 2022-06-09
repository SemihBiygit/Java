package com.bilgeadam.boost.java.lesson033.liskov;

public class Mercedes extends BaseCar implements SMSSendable{

	@Override
	public double getCostPerKm() {

		return 5;
	}

	@Override
	public void sendTripInfoSMSToDrive() {
		System.out.println("SMS : some trip info...");
		
	}
	

}
