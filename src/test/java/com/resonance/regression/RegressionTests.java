package com.resonance.regression;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.resonance.config.BaseTest;
import com.resonance.keywords.UIKeywords;
import com.resonance.utils.PropertiesFile;
import com.resonannce.pages.HomePage;

public class RegressionTests extends BaseTest{
	UIKeywords keyword = new UIKeywords();
	@Test
	public void verifyTitleOfHomePage() throws FileNotFoundException {
		String actualTitle = UIKeywords.getTitle();
		WebElement element = null;
	}
	
	@Test
	public void verifyConfirmationAlertIsOpened() {
		PropertiesFile prop = new PropertiesFile();
		
		HomePage home = new HomePage();
		
		home.clickOnAssignments();
		
		
		UIKeywords.click(repo.confirmationAlertLocator());
	}
	
}
