package com.flipkart.pages;

import org.openqa.selenium.By;

import com.flipkart.base.TestBase;

public class SearchProductPage extends TestBase {

	By searchLoc = By.name("q");
	By searchIcon = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg");

	
	public void validateSearchProduct(String productName) {
		driver.findElement(searchLoc).sendKeys(productName);
		wait(2000);
		driver.findElement(searchIcon).click();
		
		//*[@id="container"]/div/div[3]/div[1]/div[2]/div[1]/div/div/span/text()[1]
	}
}
