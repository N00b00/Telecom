package com.telecom.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountConfirmationPage extends BasePage {

	public AccountConfirmationPage(WebDriver driver) {
		super(driver);
	}

	private By acConfirmHeader = By.xpath("//h1[text()='Access Details to Guru99 Telecom']");
	private By customerId = By.xpath("//h3");
	private By home = By.xpath("//ul[@class='actions']/li/a[text()='Home']");

	public String getAcConfirmHeader() {
		return driver.findElement(acConfirmHeader).getText();
	}

	public String getCustomerId() {
		return driver.findElement(customerId).getText();
	}

	public void clickHome() {
		driver.findElement(home).click();
	}
}
