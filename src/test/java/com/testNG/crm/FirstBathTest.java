package com.testNG.crm;

import org.testng.annotations.Test;

import com.genericutility.crm.BaseClass;

public class FirstBathTest extends BaseClass{

	@Test(groups = {"performance"})
	void loginToApp() {
		System.out.println("Login to the application");
	}

	@Test(groups = {"regression"})
	void goToHomePage() {
		System.out.println("Navigate to the Home Page");
	}

	@Test(groups = {"performance", "regression"})
	void logoutFromApp() {
		System.out.println("Logout from the application");
	}
}
