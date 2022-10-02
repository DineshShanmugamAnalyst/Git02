package org.groupssss;

import org.testng.annotations.Test;

public class C {
	
@Test(groups="Reg",dependsOnGroups="Sanity")	
private void test1() {

	
	System.out.println("Class test 1");
}	

@Test(groups="Sanity",dependsOnGroups="Smoke")
private void test2() {

	
	System.out.println("Class test 2");
}	
	
@Test(groups="Smoke")	
private void test3() {

	
	System.out.println("Class test 3");
}	
	
	
			
	
	
	
	
	
	
	
	

}
