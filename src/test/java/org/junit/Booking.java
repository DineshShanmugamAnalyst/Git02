package org.junit;

import java.io.IOException;

import org.basclass.BaseClass;
import org.openqa.selenium.WebElement;

public class Booking extends BaseClass {

   @Test
	public void booking() throws IOException {

	   WebElement xpath = findLocatorByXpath("//td[text()='Book A Hotel ']");
	   
	   String text = getText(xpath);
	   
	   System.out.println(text);
	   
	   Assert.assertEquals("Verify book","Book A Hotel",text);
	   
	   
	   WebElement first = findLocatorById("first_name");
	   
	   String data = getData("Sheet1",1,10);
	   
	   elementSendKeys(first, data);
	   
       WebElement last = findLocatorById("last_name");
	   
	   String data1 = getData("Sheet1",1,11);
	   
	   elementSendKeys(last, data1);
	   
       WebElement add = findLocatorById("address");
	   
	   String data2 = getData("Sheet1",1,12);
	   
	   elementSendKeys(add, data2);
	    
	   
 WebElement addd = findLocatorById("cc_num");
	   
	   String data3= getData("Sheet1",1,13);
	   
	   elementSendKeys(addd, data3);
	   
WebElement cct = findLocatorById("cc_type");
	   
	   String data4= getData("Sheet1",1,14);
	   
	   elementSendKeys(cct, data4);
	    
WebElement cctt = findLocatorById("cc_exp_month");
	   
	   String data5= getData("Sheet1",1,15);
	   
	   elementSendKeys(cctt, data5);
	    
	   
WebElement year = findLocatorById("cc_exp_year");
	   
	   String data6= getData("Sheet1",1,16);
	   
	   elementSendKeys(year, data6);
	    
WebElement cvv = findLocatorById("cc_cvv");
	   
	   String data7= getData("Sheet1",1,17);
	   
	   elementSendKeys(cvv, data7);
	    
WebElement book = findLocatorById("book_now");

elementClick(book);
	    
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
