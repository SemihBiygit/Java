package com.bilgeadam.boost.java.lesson017;

public class ComputerTest {

	public static void main(String[] args) {

		Computer computer = new Computer();
		computer.setBrand("Apple");
		computer.setRamSize(16);
		computer.setScreenSize(13.2);
		computer.showFeatures();

		Computer computer2 = new Computer("Monster", 32, 15.6);
		computer2.showFeatures();

		Laptop laptop = new Laptop();
		laptop.setBrand("Msi");
		laptop.setRamSize(16);
		laptop.setScreenSize(18);
		laptop.setColor("Blue");
		laptop.setBatteryCapacity(85);
		laptop.showFeatures();
		laptop.connectWeb();

		Desktop desktop = new Desktop();
		desktop.setBrand("Lenovo");
		desktop.setRamSize(8);

	}

}
