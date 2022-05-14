package com.resonance.regression;

import org.testng.annotations.Test;

import com.resonannce.pages.HomePage;

import junit.framework.Assert;

public class HomePageTests {

	@Test
	public void verifyTitleOfTheHomePage() {
		HomePage home = new HomePage();
		String title = home.getTitle();
		Assert.assertEquals("Home Page", title, "Title didnt match");
	}
}
