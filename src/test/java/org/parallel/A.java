package org.parallel;

import org.basclass.BaseClass;
import org.testng.annotations.Test;

public class A extends BaseClass{
	
 @Test
	private void test1() {

    getDriver();  	  
	sendUrl("https://www.amazon.in/");  
    maximizeWindow();
  
   }
 @Test

	private void test2() {

    getDriver();  	  
	sendUrl("https://www.flipkart.com/");  
	maximizeWindow();
		
	}
 @Test

	private void test3() {

		getDriver();  	  
		sendUrl("https://www.facebook.com/login/");  
	    maximizeWindow();

		
	}
	
	
	
	
	
	
	
	
	
	

}
