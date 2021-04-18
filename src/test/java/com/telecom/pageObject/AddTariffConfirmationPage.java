package com.telecom.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddTariffConfirmationPage extends BasePage {

	public AddTariffConfirmationPage(WebDriver driver) {
		super(driver);
	}

	private By confirmationHeader = By.xpath("//h2[text()='Congratulation you add Tariff Plan']");
	private By home = By.xpath("//ul[@class='actions']/li/a[text()='Home']");

	public String getConfirmationHeader() {
		return driver.findElement(confirmationHeader).getText();
	}

	public void clickHome() {
		driver.findElement(home).click();
	}

}
