package org.testnG;

import org.testng.annotations.Test;

public class D {
	
	
	@Test(priority=250)
	private void test4() {

	System.out.println("test 4 priority=250");	
	}
	
//	@Test(priority=-25,invocationCount=3,enabled=false)
	@Test(priority=-25)
	private void test5() {

	System.out.println("test 5 priority=-25");	
	}
	
	@Test(priority=500)
	private void test6() {

	System.out.println("test 6 priority=500");	
	}

}
