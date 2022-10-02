package org.dataprovider;

import org.basclass.BaseClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProgram extends BaseClass {
	
   @Parameters({"user123","pass123"})
	@Test
	public void test1(String user,String pass) {

	   getDriver();
		sendUrl("https://www.facebook.com/login/");
		maximizeWindow();
		findLocatorById("email").sendKeys(user);
		findLocatorById("pass").sendKeys(pass);
		  
	   
	   
}
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
