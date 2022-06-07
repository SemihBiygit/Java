package com.bilgeadam.boost.java.lesson032.singleton;

import java.util.logging.Logger;

public class Commons {

	private static Commons instance = null ;
	private Logger logger;
	private String something;
	
	private Commons() { // ilk adım. sınıfın yapıcı yöntemi private olmalı. 
		super(); // Bu şekilde başka bir yerden sınıf örneği oluşturulamaz.
		this.logger= Logger.getLogger("bla bla");
		this.something = "";
	}
	
	public static Commons getInstance() { // ikinci adım: bir static metod üzerinden sınıf örneğine erişebilmek gerekli.
		if(Commons.instance==null) { // lazy initialization
			Commons.instance = new Commons();
		}
		return Commons.instance;
	}
	
	public Logger getLogger() {
		return this.logger;
	}
	public String getSomething() {
		return this.something;
	}
	public void setSomething(String something) {
		this.something=something;
	}

}
