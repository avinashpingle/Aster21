package com.resonance.utils;

public class OR {
	String filePath = "/src/main/resources/OR.properties";
	PropertiesFile prop = new PropertiesFile();
	public String assignmentLocator() {
		return prop.getValue(filePath, "assignments");
	}

	public String confirmationAlertLocator() {
		return prop.getValue(filePath, "confirmation_alert");
	}
}
