package com.bilgeadam.boost.java.lesson011;

public class IsEqual {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 5;
		
		Integer x1 = new Integer(5);
		Integer y1 = new Integer(5);
		
		String str1 = new String("semih");
		String str2 = new String("semih");
		
		if(str1==str2) {
			
			System.out.println("x y'ye ==");
			
		}else {
			
			System.out.println("x y'ye == değil");
//			System.out.println(x1);
//			System.out.println(y1);
		}
		
	}

}
