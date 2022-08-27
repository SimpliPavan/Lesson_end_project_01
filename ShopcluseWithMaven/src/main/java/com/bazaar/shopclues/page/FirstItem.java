package com.bazaar.shopclues.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstItem {
	
	WebDriverWait wait;
	
	@FindBy(xpath = "(//div[contains(@class , 'row')])[1]/div[1]")
	private WebElement firstItem;
	
	public FirstItem(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver , Duration.ofSeconds(10));
	}
	public void clickfirstItem() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class , 'row')])[1]/div[1]")));
		firstItem.click();
	}
}