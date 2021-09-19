package com.genericutility.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {

	WebDriver driver;

	/*
	 * @Parameters("browser")
	 * 
	 * @BeforeTest public void configBeforeTest(String browser) { if
	 * (browser.equals("chrome")) driver = new ChromeDriver(); else if
	 * (browser.equals("firefox")) driver = new FirefoxDriver(); else driver = new
	 * EdgeDriver(); }
	 * 
	 * @AfterTest public void configAfterTest() { driver.quit(); }
	 */

	@BeforeTest
	public void configBt() {
		String var = System.getProperty("browser");
		if (var.equals("chrome")) {
			driver = new ChromeDriver();
		}

		System.out.println("launch browser");
	}

	@AfterTest
	public void configAt() {
		 driver.quit();
		System.out.println("close browser");
	}
}
