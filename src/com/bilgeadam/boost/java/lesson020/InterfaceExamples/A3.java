package com.bilgeadam.boost.java.lesson020.InterfaceExamples;

public class A3 implements Printable,Drawable {

	@Override
	public void draw() {
		System.out.println("I am drawed A3!!");		
	}

	@Override
	public void print() {
		System.out.println("I am printed A3!!");		
	}

}
