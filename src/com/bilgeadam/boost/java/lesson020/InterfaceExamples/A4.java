package com.bilgeadam.boost.java.lesson020.InterfaceExamples;

public class A4 implements Printable,Drawable {

	@Override
	public void print() {
		System.out.println("I am printed A4!!");
		
	}

	@Override
	public void draw() {
		System.out.println("I am drawed A4!!");
		
		
	}

}
