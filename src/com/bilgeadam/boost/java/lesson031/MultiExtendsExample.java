package com.bilgeadam.boost.java.lesson031;

public class MultiExtendsExample extends Thread {

	public static void main(String[] args) {

		MultiExtendsExample m1 = new MultiExtendsExample();
		m1.start();
		MultiExtendsExample m2 = new MultiExtendsExample();
		m2.start();
		MultiExtendsExample m3 = new MultiExtendsExample();
		m3.start();
		MultiExtendsExample m4 = new MultiExtendsExample();
		m4.start();
		
	}

	public void run() {
		System.out.println("Thread is running..."+this.getName());
	}
	
}
