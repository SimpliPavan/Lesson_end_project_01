package com.bazaar.shopclues.testscripts;
import java.util.ArrayList;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bazaar.shopclues.page.BuyNow;
import com.bazaar.shopclues.page.DryFruitsAndNuts;
import com.bazaar.shopclues.page.FirstItem;
import com.bazaar.shopclues.page.LandingPage;

public class Shopclues {
	ChromeDriver driver;
	ChromeOptions options;
	@BeforeTest
	public void launchApp() {
		// 4. Close the push-notification
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		// 1. open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();         		// 2. maximize it
		driver.get("https://bazaar.shopclues.com/"); 	    // 3. navigate to URL Go to https://bazaar.shopclues.com/
	}
	@Test
	public void buyFirstItem() {
		// 5. Hover over ‘ESSENTIALS’
		LandingPage landingpage = new LandingPage(driver);
		landingpage.hoverOver();
		// 6. Click on ‘Dry Fruits Nuts & Seeds’ in the sub-menu
		DryFruitsAndNuts dryFruitsAndNuts = new DryFruitsAndNuts(driver);
		dryFruitsAndNuts.clickDryFruitsAndNutsSeeds();
		// 7. Shift focus on new tab
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		// 8. Click on the first product
		FirstItem firstItem = new FirstItem(driver);
		firstItem.clickfirstItem();
		// 9. Shift focus on new tab
		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(2));
		// 10. Click on Buy Now Btn
		BuyNow buyNow = new BuyNow(driver);
		buyNow.clickBuyBtn();
	}
	@AfterTest
	public void closeBrowser() {     // 11. Close the browser
		driver.quit();
	}
}