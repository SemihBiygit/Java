package com.bilgeadam.boost.java.lesson011;

public class PrimitiveTypesToWrapperObjects {

	public static void main(String[] args) {
		
		int a = 5;
		double b = 5.56d;
		
		Integer aObj = Integer.valueOf(a); //converts into wrapper class
		Double bObj = Double.valueOf(b); //converts into wrapper class
		
		if(aObj instanceof Integer) {
			System.out.println("Integer nesnesi yaratildi: "+aObj);
		}
		if (bObj instanceof Double) {
		 System.out.println("Double nesnesi yaratildi: "+bObj);
		}
		
		//Autoboxing
		int a1 =5;
		Integer a1Obj = a1; //converts into wrapper class
		
		double b1 = 5.56d;
		Double b1Obj = b1; //converts into wrapper class
		
	}

}
