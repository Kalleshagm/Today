package com.testNG.crm;

import org.testng.annotations.Test;

import com.genericutility.crm.BaseClass;

public class SecondBathTest extends BaseClass{

	@Test
	void signupToApp() {
		System.out.println("Login to the application");
	}

	@Test
	void goToHomePage() {
		System.out.println("Navigate to the Home Page");
	}

	@Test
	void signoutoutFromApp() {
		System.out.println("Logout from the application");
	}
}