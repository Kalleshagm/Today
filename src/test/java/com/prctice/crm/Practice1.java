package com.prctice.crm;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.genericutility.crm.BaseClass;

public class Practice1 extends BaseClass{

	@Test
	void regression() {
		System.out.println("regerssion test");
		throw new SkipException("Functionality not  fixed yet");
	}

	@Test
	void smoke() {
		System.out.println("smoke test");
	}
}
