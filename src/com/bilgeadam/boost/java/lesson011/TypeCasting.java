package com.bilgeadam.boost.java.lesson011;

public class TypeCasting {

	public static void main(String[] args) {
		
		//widening
		int myInt = 9;
		double myDouble = myInt; //Automatic casting : int to double
		
		System.out.println(myInt);
		System.out.println(myDouble);
		
		
		//narrowing
		double myDouble2 = 9.78d;
		int myInt2 = (int) myDouble2; //Manuel casting : double to int
		
		System.out.println(myDouble2);
		System.out.println(myInt2);
		
		//////////////////////////////////////////////////////////////////
		int num = 10;
		System.out.println("The integer value is:"+num);
		
		String data = String.valueOf(num); // converts int to string type
		System.out.println("The string value is: "+data);
		
		//type conversion from string to int
		
		String data2 = "10";
		System.out.println("The string value is : "+data2);
		
		int num2= Integer.parseInt(data2); // converts string variable to int
		System.out.println("The integer value is:"+num2);
		
		
	}

}
