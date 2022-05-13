package com.bilgeadam.boost.java.lesson020.InterfaceExamples.Examples;

public class Triangle implements Polygon {

	double sideLength;
	double square;
	
	
	@Override
	public double calculateArea(int sideLength) {
		square=Math.pow(sideLength, 2)*Math.sqrt(3)/4;
		System.out.println("Ucgenin alani: "+square);
		return square;
	}
	


}
