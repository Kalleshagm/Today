package com.dependenceOnMethod.crm;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.genericutility.crm.BaseClass;

public class DependsOnMethod extends BaseClass {
	
	@Test(priority=-1)
	void regression() {
	System.out.println("regerssion test");
	//throw new SkipException("Functionality not  fixed yet");
	}

	@Test(priority=0 /*, dependsOnMethods = {"regression"}*/)
	void smoke() {
		System.out.println("smoke test");
	}
}
/*
 * 
 * *** Tricky Question ***
 * 
 */