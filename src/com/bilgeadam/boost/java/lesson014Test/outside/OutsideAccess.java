package com.bilgeadam.boost.java.lesson014Test.outside;

import com.bilgeadam.boost.java.lesson014Test.Test;

public class OutsideAccess extends Test {

	public static void main(String[] args) {
		Test testObject = new Test();
		
		System.out.println("Eristigim degiskenler :"+ testObject.publicVariable);
	
		OutsideAccess outsideAccess = new OutsideAccess();
		System.out.println("Eristigim degiskenler :"+outsideAccess.protectedVariable+", "+outsideAccess.publicVariable);
	
	}
	
	

}
