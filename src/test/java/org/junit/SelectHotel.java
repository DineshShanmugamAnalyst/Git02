package org.junit;

import org.basclass.BaseClass;
import org.openqa.selenium.WebElement;

public class SelectHotel extends BaseClass {
    
	@Test
	
	public void selectHotels() {

	WebElement wel = findLocatorByXpath("//td[text()='Select Hotel '] ");
	
	String text = getText(wel);
	
	System.out.println(text);

	Assert.assertEquals("verify select","Select Hotel",text);
		
		
	WebElement radio = findLocatorById("radiobutton_0");
	elementClick(radio);
		
	WebElement con = findLocatorById("continue");
	elementClick(con);
		
			
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
