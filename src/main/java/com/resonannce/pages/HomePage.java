package com.resonannce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resonance.keywords.UIKeywords;
public class HomePage {
	UIKeywords keywords = new UIKeywords();
	
	@FindBy(css="a[href=\"/assignments\"]")
	public WebElement assignementsLnk;
	@FindBy(css="")
	public WebElement coursesLnk;
	
	
	//Locator StaleElementException
	@FindBy(css="")
	public WebElement videosLnk;
	
	
	//locator
	public By assignmentLink = By.cssSelector("a[href=\"/assignments\"]");
	
	public WebElement NotesLnk;// variable name = name or Id
	public WebElement recentPlacementsLnk;
	
	public HomePage() {
		UIKeywords keyword = new UIKeywords();
		PageFactory.initElements(keyword.driver, this);
	}
	public void clickOnAssignments() {
		assignementsLnk.click();
	}
	
	//@FindBy ? PageFactory
	public void clickOnAssignmentMenue() {
		keywords.driver.findElement(assignmentLink).click();
	}
	public String getTitle() {
		return keywords.driver.getTitle();
	}
	
}
