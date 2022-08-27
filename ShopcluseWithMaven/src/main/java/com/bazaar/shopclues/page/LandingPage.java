package com.bazaar.shopclues.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	Actions actions;
	
	@FindBy(linkText = "ESSENTIALS")
	private WebElement Essentials;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	public void hoverOver() {
		actions.moveToElement(Essentials).build().perform();
	}
}