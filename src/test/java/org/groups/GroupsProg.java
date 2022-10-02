package org.groups;

import org.testng.annotations.Test;

public class GroupsProg {
	
	
	@Test(groups= {"Smoke","Sanity"})
	private void test1() {
  
		System.out.println("Class A test1");	
		
	}
	@Test(groups= "Smoke")
	private void test2() {
		  
		System.out.println("Class A test2");	
		
	}
	@Test(groups= "Smoke")
	private void test3() {
		  
		System.out.println("Class A test3");	
		
	}
	
	@Test(groups= "Sanity")
	private void test4() {
		  
		System.out.println("Class A test4");	
		
	}
	@Test(groups= "Sanity")
	private void test5() {
		  
		System.out.println("Class A test5");	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
