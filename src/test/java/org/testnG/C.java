package org.testnG;

import org.testng.annotations.Test;

public class C {
	
	@Test(priority=-255)
	private void test1() {

	System.out.println(" test1 priority=-255");	
	}
	
	@Test(priority=10)
	private void test2() {
		
		System.out.println("test 2 priority=10");	

		
	}
//	@Test(priority=-150)
	@Test
	private void test3() {
		System.out.println("test 3 ");	

		
	}
	
//	@Test(priority=250)
//	private void test4() {
//
//	System.out.println("test 4 priority=250");	
//	}
//	
//	@Test(priority=-25)
//	private void test5() {
//
//	System.out.println("test 5 priority=-25");	
//	}
//	
//	@Test(priority=500)
//	private void test6() {
//
//	System.out.println("test 6 priority=500");	
//	}
	
	
	
	
	

}
	



