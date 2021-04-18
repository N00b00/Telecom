package com.telecom.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	private By header = By.xpath("//a[text()='Guru99 telecom']");
	private By addCustomer = By.xpath("//h3/a[text()='Add Customer']");
	private By addTariff = By.xpath("//h3/a[text()='Add Tariff Plan to Customer']");
	private By addTariffPlan = By.xpath("//h3/a[text()='Add Tariff Plan']");
	private By payBilling = By.xpath("//h3/a[text()='Pay Billing']");
	private By leftMenu = By.xpath("//span[@id='header']/nav/a[1]");
	private By leftMenuClose = By.xpath("//a[@class='close']");
	private By leftMenuHome = By.xpath("//a[text()='Home']");
	private By leftMenuAddCustomer = By.xpath("//nav[@id='menu']/ul/li[2]/a");
	private By leftMenuAddTariffPlans = By.xpath("//nav[@id='menu']/ul/li[3]/a");
	private By leftMenuAddTariffPlansCustomer = By.xpath("//nav[@id='menu']/ul/li[4]/a");
	private By leftMenuPayBilling = By.xpath("//nav[@id='menu']/ul/li[5]/a");

	public String getTitle() {
		return driver.getTitle();
	}

	public String getHeader() {
		return driver.findElement(header).getText();
	}

	public String getAddCustomer() {
		return driver.findElement(addCustomer).getText();
	}

	public String getAddTariff() {
		return driver.findElement(addTariff).getText();
	}

	public String getAddTariffPlan() {
		return driver.findElement(addTariffPlan).getText();
	}

	public String getPayBilling() {
		return driver.findElement(payBilling).getText();
	}

	public void clickMenu() {
		driver.findElement(leftMenu).click();
	}

	public void clickAddCustomer() {
		driver.findElement(addCustomer).click();
	}

	public void clickAddTariff() {
		driver.findElement(addTariff).click();
	}

	public void clickAddTariffPlan() {
		driver.findElement(addTariffPlan).click();
	}

	public void clickPayBilling() {
		driver.findElement(payBilling).click();
	}

	public void clickLeftMenuClose() {
		driver.findElement(leftMenuClose).click();
	}

	public void clickLeftMenuHome() {
		driver.findElement(leftMenuHome).click();
	}

	public void clickLeftMenuAddCustomer() {
		driver.findElement(leftMenuAddCustomer).click();
	}

	public void clickLeftMenuAddTariffPlans() {
		driver.findElement(leftMenuAddTariffPlans).click();
	}

	public void clickLeftMenuAddTariffPlansCustomer() {
		driver.findElement(leftMenuAddTariffPlansCustomer).click();
	}

	public void clickLeftMenuPayBilling() {
		driver.findElement(leftMenuPayBilling).click();
	}

}
