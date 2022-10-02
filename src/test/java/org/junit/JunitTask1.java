package org.junit;

public class JunitTask1 {
	
	@BeforeClass
	public static void beforeClass() {

		System.out.println("BeforeClass");
		
		
	}
	
	@AfterClass
	public static void afterClass() {
System.out.println("afterClass");
		
	}
	
	@Before
	public void beforeMethod() {
System.out.println("beforeMethod");
	}
	
	@Test
	public void payment() {

		System.out.println("payment");
	}
	
	@Test
	public void login() {

		System.out.println("login");
	}
	
	@After
	public void afterMethod() {

		
		System.out.println("afterMethod");
	}
	
	

}



















