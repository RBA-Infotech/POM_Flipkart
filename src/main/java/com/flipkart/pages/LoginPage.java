package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.base.TestBase;

public class LoginPage extends TestBase {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	By userNameLoc = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	By passwordLoc = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	By loginButtonLoc = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button");

	public boolean validateLogin(String uName, String pwd) {	
		wait(2000);
		driver.findElement(userNameLoc).sendKeys(uName);
		wait(2000);
		driver.findElement(passwordLoc).sendKeys(pwd);
		wait(2000);
		driver.findElement(loginButtonLoc).click();

		// validating Flipkart home page
		
		boolean flagResult = true;
		
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")));	
		}catch(TimeoutException te) {
			captureScreenshot("Login Failure");
			flagResult = false;
		}
		
		if(flagResult) {
		String actResult = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")).getText();
		return actResult.equals("Senthil");
		}
		else 
		return false;
	}

}
