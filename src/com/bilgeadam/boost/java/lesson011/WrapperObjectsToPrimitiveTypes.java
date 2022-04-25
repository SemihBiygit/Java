package com.bilgeadam.boost.java.lesson011;

public class WrapperObjectsToPrimitiveTypes {

	public static void main(String[] args) {
		
		//Unboxing
		Integer aObj = Integer.valueOf(23);
		int a = aObj.intValue(); // converts into primitive types
		System.out.println("The value of a :"+a);
		
		Integer a1Obj = Integer.valueOf(23);
		int a1 = a1Obj; //converts into primitive types
		System.out.println("The value of a :"+a);
		
		//////////////////////////////////////////////////////////////////
		
		//Unboxing
		Double bObj = Double.valueOf(23);
		double b = bObj.doubleValue(); // converts into primitive types
		System.out.println("The value of b :"+b);
		
		Double b1Obj = Double.valueOf(23);
		double b1 = b1Obj;
		System.out.println("The value of b :"+b);		
		
	}

}
