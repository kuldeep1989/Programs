package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	// Helps you to run the test case again and again.
	@Test(invocationCount=10)
	public void sum() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
	
	
}
