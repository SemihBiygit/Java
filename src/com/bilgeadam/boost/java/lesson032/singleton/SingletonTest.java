package com.bilgeadam.boost.java.lesson032.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		System.out.println("herhangi bir sey yaptim");
		
		Commons.getInstance().getLogger().info("logger uzerinden");
		Commons.getInstance().setSomething("bla bla");
		System.out.println(Commons.getInstance().getSomething());

	}

}
