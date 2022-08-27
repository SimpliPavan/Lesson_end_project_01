package com.bazaar.shopclues.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyNow {
	WebDriverWait wait;
	
	@FindBy(id ="buy")
	private WebElement clickbuy;
	
	public BuyNow(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver , Duration.ofSeconds(10));
	}
	public void clickBuyBtn() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buy")));
		clickbuy.click();
	}
}