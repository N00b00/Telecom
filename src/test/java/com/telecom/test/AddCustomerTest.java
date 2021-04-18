package com.telecom.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.telecom.pageObject.AccountConfirmationPage;
import com.telecom.pageObject.AddCustomerPage;
import com.telecom.pageObject.HomePage;
import com.telecom.utility.DataDriver;

public class AddCustomerTest extends BaseTest {

	@DataProvider
	public Object[][] getCustomerData() {
		Object[][] data = DataDriver.getTestData("Sheet1");
		return data;
	}

	@Test(dataProvider = "getCustomerData")
	public void addCustomer(String firstname, String lastname, String address, String email, String phno) {
		HomePage hp = new HomePage(driver);
		hp.clickMenu();
		hp.clickLeftMenuAddCustomer();

		AddCustomerPage customerPage = new AddCustomerPage(driver);
		Assert.assertEquals(customerPage.getHeader(), "Add Customer");
		customerPage.clickDoneRadio();
		customerPage.getFirstName().sendKeys(firstname);
		customerPage.getLastName().sendKeys(lastname);
		customerPage.getAddress().sendKeys(address);
		customerPage.getEmail().sendKeys(email);
		customerPage.getPhno().sendKeys(phno);
		customerPage.getSubmit();

		AccountConfirmationPage cp = new AccountConfirmationPage(driver);
		Assert.assertEquals(cp.getAcConfirmHeader(), "Access Details to Guru99 Telecom");
		System.out.println(cp.getCustomerId());
		cp.clickHome();
	}

}
