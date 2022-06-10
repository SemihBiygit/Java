package com.bilgeadam.boost.java.lesson034.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtility {

	public static Properties readProperties(String path, String fileName) {
		Properties props = new Properties();

		try (InputStream input = new FileInputStream(path + "\\" + fileName);) {
			props.load(input);
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return props;
	}
}
