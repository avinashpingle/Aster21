package com.resonance.config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.resonance.keywords.UIKeywords;
import com.resonance.utils.Environment;
import com.resonance.utils.OR;

public class BaseTest {
	public Environment env = new Environment();
	public OR repo = new OR();
	
	@BeforeMethod
	public void setUp() throws Exception {
		UIKeywords.openBrowser("chrome");
		UIKeywords.launchUrl(env.getAppUrl());
	}
	
	@AfterMethod
	public void tearDown(){
		UIKeywords.quiteBrowser();
	}
}
