package com.telecom.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.telecom.pageObject.BasePage;
import com.telecom.utility.ReadConfig;

public class BaseTest {
	ReadConfig rc = new ReadConfig();
	public WebDriver driver;
	public BasePage page;
	public String browser = rc.getBrowser();
	public String url = rc.getUrl();

	@BeforeTest
	public void setup() {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\mahe\\Desktop\\Automation Project\\Telecom\\Telecom\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("chrome://settings/");
			driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
			System.out.println(driver);
		} else if (browser == "edge") {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\mahe\\Desktop\\Automation Project\\Telecom\\Telecom\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(url);
		page = new BasePage(driver);

	}

	@AfterTest
	public void tdown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}

	public String getScreenShot(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		String des = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
		FileUtils.copyFile(scr, new File(des));
		return des;

	}
}
