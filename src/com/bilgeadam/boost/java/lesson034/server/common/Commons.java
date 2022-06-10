package com.bilgeadam.boost.java.lesson034.server.common;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;

import com.bilgeadam.boost.java.lesson034.common.PropertyUtility;

public class Commons {

	private static Commons instance;
	private Properties serverProperties;
	private String path;
	private String fileName;

	private Commons() {
		super();
		serverProperties = null;
	}

	public static Commons getInstance() {
		if (instance == null) {
			instance = new Commons();
		}
		return instance;
	}

	public int getPort() {
		String str = this.getServerProperties().getProperty("port");
		return Integer.parseInt(str);
	}

	private String getTranslationFilesName() {
		return this.getServerProperties().getProperty("translation_files_name");
	}

	public ResourceBundle getResourceBundle(String lang) {
		Locale locale = new Locale(lang);
		String bundleName = Commons.class.getPackageName() + "\\" + getTranslationFilesName();
		return ResourceBundle.getBundle(bundleName, locale);

	}

	public String translate(String textToTranslate, String targetLanguage) {
		try {
			return this.getResourceBundle(targetLanguage).getString(textToTranslate);
		} catch (MissingResourceException e) {
			return '!' + textToTranslate + '!';
		}

	}

	private Properties getServerProperties() {
		if (this.serverProperties == null) {
			this.serverProperties = PropertyUtility.readProperties(this.path, this.fileName);
		}
		return this.serverProperties;
	}

	public void setArguments(String path, String fileName) {
		this.path = path;
		this.fileName = fileName;
	}

}
