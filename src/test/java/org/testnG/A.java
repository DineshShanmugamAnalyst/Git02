package org.testnG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A {
	@BeforeSuite
	private void test1() {
System.out.println("@BeforeSuite");
	}
	@AfterSuite
	private void test2() {
		System.out.println("@AfterSuite");
	}
	@BeforeTest
	private void test3() {
		System.out.println("@BeforeTest");
	}
	@AfterTest
	private void test4() {
		System.out.println("@AfterTest");
	}
	@BeforeClass
	private void test5() {
		System.out.println("@BeforeClass");
	}
	@AfterClass
	private void test6() {
		System.out.println("@AfterClass");
	}
	@BeforeMethod
	private void test7() {
		System.out.println("@BeforeMethod");
	}
	@AfterMethod
	private void test8() {
		System.out.println("@AfterMethod");
	}
	@Test
	private void test9() {
		System.out.println("@Test");
	}
	
	@Test
	private void test10() {
		System.out.println("@Test10");
	}
	
	
	}
