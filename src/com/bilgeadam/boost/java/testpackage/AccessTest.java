package com.bilgeadam.boost.java.testpackage;

public class AccessTest {

	public static void main(String[] args) {
		
		Test testObject = new Test();
		
		System.out.println("Erisebildigim degiskenler:"+ testObject.publicVariable+", "+testObject.defaultVariable+", "+testObject.protectedVariable);
	}

}
