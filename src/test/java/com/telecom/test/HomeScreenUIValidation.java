package com.telecom.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.telecom.pageObject.HomePage;

public class HomeScreenUIValidation extends BaseTest {
	public WebDriver driver1;
	@Test
	public void HomeScreenValidation() {
		HomePage hp = new HomePage(driver);
		driver1=driver;
		System.out.println(driver1);
		Assert.assertEquals(hp.getTitle(), "Guru99 Telecom");
		Assert.assertEquals(hp.getHeader(), "Guru99 telecom");
		Assert.assertEquals(hp.getAddCustomer(), "Add Customer");
		Assert.assertEquals(hp.getAddTariff(), "Add Tariff Plan to Customer");
		Assert.assertEquals(hp.getAddTariffPlan(), "Add Tariff Plan");
		Assert.assertEquals(hp.getPayBilling(), "Pay Billingg");
	}

}
