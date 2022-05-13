package com.bilgeadam.boost.java.lesson020.InterfaceExamples.Examples;

public class Square implements Polygon {

	double sideLength;
	double square;
	
	@Override
	public double calculateArea(int sideLength) {
		
		square= Math.pow(sideLength, 2);
		System.out.println("Dortgenin alani: "+square);
		return square;
	}


}
