package org.junit;

import java.io.IOException;

import org.basclass.BaseClass;
import org.openqa.selenium.WebElement;

public class SearchHotel extends BaseClass {

//	@BeforeClass
//	public static void beforeClass() {
//
//		
//		getDriver();
//		sendUrl("https://adactinhotelapp.com/");
//		maximizeWindow();
//	}
//	
	
	
	
	
	
	
	@Test
	public void searchHotel() throws IOException {

	
	
	WebElement verifyWelcome = findLocatorById("username_show");
		
		
	String attributeValue = getAttributeValue(verifyWelcome);
	System.out.println(attributeValue);
	Assert.assertEquals("verify hotel","Hello DineshShanmugam123!",attributeValue);
		
    WebElement location = findLocatorById("location");
	
	String data = getData("Sheet1",1,2);
	
	elementSendKeys(location, data);	
		
	WebElement hotels = findLocatorById("hotels");
	
	String data2 = getData("Sheet1",1,3);
	
	elementSendKeys(hotels, data2);
		
WebElement room = findLocatorById("room_type");
	
	String data3 = getData("Sheet1",1,4);
	
	elementSendKeys(room, data3);
		
WebElement roomnos = findLocatorById("room_nos");
	
	String data4 = getData("Sheet1",1,5);
	
	elementSendKeys(roomnos, data4);
		
					
WebElement datein = findLocatorById("datepick_in");
	
	String data5 = getData("Sheet1",1,6);
	
	elementSendKeys(datein, data5);
			
WebElement dateout = findLocatorById("datepick_out");
	
	String data6 = getData("Sheet1",1,7);
	
	elementSendKeys(datein, data6);
				
		
WebElement adult = findLocatorById("adult_room");
	
	String data7 = getData("Sheet1",1,8);
	
	elementSendKeys(adult, data7);
					
WebElement child = findLocatorById("child_room");
	
	String data8 = getData("Sheet1",1,9);
	
	elementSendKeys(child, data8);
						
	WebElement findLocatorById = findLocatorById("Submit");
	elementClick(findLocatorById);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
