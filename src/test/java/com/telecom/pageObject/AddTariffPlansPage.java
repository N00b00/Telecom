package com.telecom.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddTariffPlansPage extends BasePage {

	public AddTariffPlansPage(WebDriver driver) {
		super(driver);
	}

	private By tariffPlanHeader = By.xpath("//h1[text()='Add Tariff Plans']");
	private By monthlyRental = By.xpath("//input[@name='rental']");
	private By feeLocalmin = By.xpath("//input[@name='local_minutes']");
	private By feeInternationalmin = By.xpath("//input[@name='inter_minutes']");
	private By freeSmsPack = By.xpath("//input[@name='sms_pack']");
	private By localPerMinCharges = By.xpath("//input[@name='minutes_charges']");
	private By internationalCharges = By.xpath("//input[@name='inter_charges']");
	private By smsPerCharges = By.xpath("//input[@name='sms_charges']");
	private By submit = By.xpath("//input[@type='submit']");
	private By reset = By.xpath("//input[@type='reset']");

	public String getTariffPlanHeader() {
		return driver.findElement(tariffPlanHeader).getText();
	}

	public WebElement getMonthlyRental() {
		return driver.findElement(monthlyRental);
	}

	public WebElement getFeeLocalmin() {
		return driver.findElement(feeLocalmin);
	}

	public WebElement getFeeInternationalmin() {
		return driver.findElement(feeInternationalmin);
	}

	public WebElement getFreeSmsPack() {
		return driver.findElement(freeSmsPack);
	}

	public WebElement getLocalPerMinCharges() {
		return driver.findElement(localPerMinCharges);
	}

	public WebElement getInternationalCharges() {
		return driver.findElement(internationalCharges);
	}

	public WebElement getSmsPerCharges() {
		return driver.findElement(smsPerCharges);
	}

	public void clickSubmit() {
		driver.findElement(submit).click();
	}

	public void clickReset() {
		driver.findElement(reset).click();
	}

}
