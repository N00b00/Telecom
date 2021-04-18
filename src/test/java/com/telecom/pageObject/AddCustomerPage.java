package com.telecom.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCustomerPage extends BasePage {

	public AddCustomerPage(WebDriver driver) {
		super(driver);
	}

	private By header = By.xpath("//h1[text()='Add Customer']");
	private By doneRadio = By.xpath("//div[@class='row uniform']/div/label[@for='done']");
	private By pendingRadio = By.xpath("//div[@class='row uniform']/div/label[@for='pending']");
	private By firstName = By.xpath("//input[@name='fname']");
	private By lastName = By.xpath("//input[@name='lname']");
	private By email = By.xpath("//input[@name='emailid']");
	private By address = By.xpath("//textarea[@name='addr']");
	private By phno = By.xpath("//input[@name='telephoneno']");
	private By submit = By.xpath("//input[@type='submit']");
	private By reset = By.xpath("//input[@type='reset']");

	public String getHeader() {
		return driver.findElement(header).getText();
	}

	public void clickDoneRadio() {
		driver.findElement(doneRadio).click();
	}

	public void clickPendingRadio() {
		driver.findElement(pendingRadio).click();
	}

	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}

	public WebElement getLastName() {
		return driver.findElement(lastName);
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getAddress() {
		return driver.findElement(address);
	}

	public WebElement getPhno() {
		return driver.findElement(phno);
	}

	public void getSubmit() {
		driver.findElement(submit).click();
	}

	public void getReset() {
		driver.findElement(reset).click();
	}
}
