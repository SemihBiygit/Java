package com.bilgeadam.boost.java.lesson015;

public class ToyCar {
	private int batteryCapacity=5;
	int distanceTravelledForward;
	int distanceTravelledRight;
	
	private void remainingBattery() {
		System.out.println("Remaining Battery: "+batteryCapacity);
		if(batteryCapacity<=0) {
			System.err.println("Dead Battery!! Please charge!");
		}
	}
	void charge() {
		if(batteryCapacity>=5) {
			System.err.println("Battery Full!");
		}else {
			batteryCapacity=5;
			remainingBattery();
		}
	}
	
	
	
	void moveOneMeterForward() {
		if(batteryCapacity<=0) {
			remainingBattery();
		}else {
		distanceTravelledForward++;
		batteryCapacity--;
		System.out.println("\nCurrent Position: "+distanceTravelledForward+","+distanceTravelledRight);
		remainingBattery();
		}
	}
	
	void moveOneMeterBackward() {
		if(batteryCapacity<=0) {
			remainingBattery();
		}else {
		distanceTravelledForward--;
		batteryCapacity--;
		System.out.println("\nCurrent Position: "+distanceTravelledForward+","+distanceTravelledRight);
		remainingBattery();
		}
	}
	void moveOneMeterRight() {
		if(batteryCapacity<=0) {
			remainingBattery();
		}else {
		distanceTravelledRight++;
		batteryCapacity--;
		System.out.println("\nCurrent Position: "+distanceTravelledForward+","+distanceTravelledRight);
		remainingBattery();
		}
	}
	void moveOneMeterLeft() {
		if(batteryCapacity<=0) {
			remainingBattery();
		}else {
		distanceTravelledRight--;
		batteryCapacity--;
		System.out.println("\nCurrent Position: "+distanceTravelledForward+","+distanceTravelledRight);
		remainingBattery();
		}
	}
	
}
