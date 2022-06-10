package com.bilgeadam.boost.java.lesson034.client.common;

import java.util.Properties;

import com.bilgeadam.boost.java.lesson034.common.PropertyUtility;

public class Commons {

	private static Commons instance;
	private Properties clientProperties;
	private String path;
	private String fileName;

	private Commons() {
		super();
		clientProperties = null;
	}

	public static Commons getInstance() {
		if (instance == null) {
			instance = new Commons();
		}
		return instance;
	}

	public String getServerAdress() {
		return this.getClientProperties().getProperty("server");
	}
	public int getPort() {
		String str = this.getClientProperties().getProperty("port");
		return Integer.parseInt(str);
	}

	private Properties getClientProperties() {
		if (this.clientProperties == null) {
			this.clientProperties = PropertyUtility.readProperties(this.path, this.fileName);
		}
		return this.clientProperties;
	}

	public void setArguments(String path, String fileName) {
		this.path = path;
		this.fileName = fileName;
	}

}
