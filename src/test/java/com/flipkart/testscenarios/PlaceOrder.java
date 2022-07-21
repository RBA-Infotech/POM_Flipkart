package com.flipkart.testscenarios;

import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.SearchProductPage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PlaceOrder extends TestBase {
	
	@BeforeClass
	public void setUp() {
		launchBrowser();
		navigateToURL();
	}

	@AfterClass
	public void tearDown() {
	}
	
	@Test
	public void loginTest() {
		LoginPage loginPage = new LoginPage();
		boolean actResult = loginPage.validateLogin("9094018902", "Asdf@1234");
		Assert.assertTrue(actResult);
	}

	
	@Test
	public void seachProductTest() {
		SearchProductPage searchProductPage = new SearchProductPage();
		searchProductPage.validateSearchProduct("laptop");
	}
	
	@Test
	public void selectProductTest() {
	}
	
	@Test
	public void addToCartTest() {
	}
	
	@Test
	public void placeOrderTest() {
	}
	
	@Test
	public void makePayment() {
	}
	
	@Test
	public void logoutTest() {
	}
	
}
