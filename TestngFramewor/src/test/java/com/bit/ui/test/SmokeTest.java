package com.bit.ui.test;

import org.testng.annotations.Test;

public class SmokeTest extends BaseTest{
	
	@Test(groups = "ui")
	public void test1() {
		System.out.println("test 1");
	}
	
	
	
    @Test(groups = "backend")
	public void test2() {
		System.out.println("test 2");
	}
}
