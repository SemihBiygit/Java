package com.bilgeadam.boost.java.lesson032.builder;

public class BuilderTest {
	
	public static void main(String[] args) {
		House house = new House.HouseBuilder(200, 4, 2, 20, new Adress("cadde", 95, 16135, "Bursa", "Turkiye"))
				.areaOfBackGarden(300).areaOfPorch(20).build();

		System.out.println(house);

		House house2 = new House.HouseBuilder(100, 4, 2, 20, new Adress("sokak", 195, 16250, "Bursa", "Turkiye"))
				.areaOfFrontGarden(150).areaOfPorch(20).numOfBalconies(3).build();

		System.out.println(house2);

	}

}
