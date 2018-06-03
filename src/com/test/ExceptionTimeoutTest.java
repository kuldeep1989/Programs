package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
	
	// Help to wait maximum time for test case to execute or it will terminate.
	// It works with Jenkins mostly because of eclipse.
	
	@Test(invocationTimeOut=2000, expectedExceptions=NumberFormatException.class)
	public void infiniteLoop() {
		int i = 1;
		while (i==1) {
			System.out.println("i");
		}
	}	
}