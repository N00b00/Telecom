package com.telecom.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.telecom.pageObject.AddTariffConfirmationPage;
import com.telecom.pageObject.AddTariffPlansPage;
import com.telecom.pageObject.HomePage;
import com.telecom.utility.DataDriver;

public class AddTariffPlansTest extends BaseTest{
	
	@DataProvider
	public Object[][] getTariffData(){
		Object [] [] data = DataDriver.getTestData("Sheet2");
		return data;
	}
	
	@Test(dataProvider = "getTariffData")
	public void addTariffPlansTest(String monthly_rent,String free_local_min,String free_int_min, String free_sms_pack,String local_per_min_charges,String international_charges,String sms_per_charge) {
		HomePage hp = new HomePage(driver);
		hp.clickMenu();
		hp.clickLeftMenuAddTariffPlans();
		
		AddTariffPlansPage tp = new AddTariffPlansPage(driver);
		Assert.assertEquals(tp.getTariffPlanHeader(), "Add Tariff Plans");
		tp.getMonthlyRental().sendKeys(monthly_rent);
		tp.getFeeLocalmin().sendKeys(free_local_min);
		tp.getFeeInternationalmin().sendKeys(free_int_min);
		tp.getFreeSmsPack().sendKeys(free_sms_pack);
		tp.getLocalPerMinCharges().sendKeys(local_per_min_charges);
		tp.getInternationalCharges().sendKeys(international_charges);
		tp.getSmsPerCharges().sendKeys(sms_per_charge);
		tp.clickSubmit();
		
		AddTariffConfirmationPage tpc = new AddTariffConfirmationPage(driver);
		Assert.assertEquals(tpc.getConfirmationHeader(), "Congratulation you add Tariff Plan");
		tpc.clickHome();
		
	}
}
