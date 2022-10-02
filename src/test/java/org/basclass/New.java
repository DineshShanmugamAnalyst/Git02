package org.basclass;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class New {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseClass b = new BaseClass();
		
		b.getDriver();
 
     	b.sendUrl("https://adactinhotelapp.com/");
		
		b.maximizeWindow();
		
		WebElement username = b.findLocatorById("username");
		
		String data = b.getData("Sheet1",1,0);
		
		b.elementSendKeysJs(username, data);
		
		 WebElement password = b.findLocatorById("password");
		 
		 String data2 = b.getData("Sheet1",1,1);
		 
		 b.elementSendKeys(password, data2);
		 
		 
		 WebElement login = b.findLocatorById("login");
		 
		 b.elementClick(login);
		 
		WebElement location = b.findLocatorById("location");
		 
		  String data3 = b.getData("Sheet1",1,2 );
		  
		  b.selectOptionByText(location,data3);
		 
		 
		WebElement hotels = b.findLocatorById("hotels"); 
		 
		 String data4 = b.getData("Sheet1", 1,3);
		 
		 b.selectOptionByText(hotels,data4);
		 
		 WebElement roomtype = b.findLocatorById("room_type");
		 
		 String data5 = b.getData("Sheet1",1,4);
		 
		 b.selectOptionByText(roomtype, data5);
		 
		 WebElement roomnos = b.findLocatorById("room_nos");
		 
		 String data6 = b.getData("Sheet1",1,5);
		 
//		 b.selectOptionByText(roomnos,data6);
		 b.elementSendKeys(roomnos, data6);
		WebElement entry = b.findLocatorById("datepick_in");
		
		String data7 = b.getData("Sheet1",1,6);
		 
//		 b.selectOptionByText(entry, data7);
		 b.elementSendKeys(entry, data7);
		WebElement exit = b.findLocatorById("datepick_out");
		
	String data8 = b.getData("Sheet1", 1, 7);
		
//		b.selectOptionByText(exit,data8);
		b.elementSendKeys(exit, data8); 
		 
		 
		WebElement adult = b.findLocatorById("adult_room");
		
		String data9 = b.getData("Sheet1",1,8);
		
		b.selectOptionByText(adult,data9);
		 
		 
	WebElement child = b.findLocatorById("child_room");	 
		 
		 String data10 = b.getData("Sheet1",1,9);
		 
	 b.selectOptionByText(child,data10);
		 
		 
		WebElement search = b.findLocatorById("Submit");
		
		b.elementClick(search);
		 
	WebElement radio = b.findLocatorById("radiobutton_0");
	
	b.elementClick(radio);
		 
	WebElement continues = b.findLocatorById("continue");
	
	b.elementClick(continues);  
	
	WebElement firstname = b.findLocatorById("first_name");
	
	String data11 = b.getData("Sheet1",1,10);
	
	b.elementSendKeys(firstname, data11);
	
 WebElement lastname = b.findLocatorById("last_name");
 
 String data12 = b.getData("Sheet1",1,11);
 
 b.elementSendKeys(lastname, data12);
		 
		 
	WebElement addre = b.findLocatorById("address");
	
	String data13 = b.getData("Sheet1",1,12);
	
	b.elementSendKeys(addre, data13);

	
	
	WebElement cc = b.findLocatorById("cc_num");
	
	String data14 = b.getData("Sheet1",1,13);
	
	b.elementSendKeys(cc, data14);
	
	
	
	WebElement ccc = b.findLocatorById("cc_type");
	
	String data15 = b.getData("Sheet1",1, 14);
	
	b.selectOptionByText(ccc, data15);
	
	WebElement month = b.findLocatorById("cc_exp_month");
	
	
	String data16 = b.getData("Sheet1", 1,15);
	b.selectOptionByText(month,data16);
			
	WebElement years = b.findLocatorById("cc_exp_year");
	
	String data17 = b.getData("Sheet1",1,16);
	
//	b.selectOptionByText(years, data17);
b.elementSendKeys(years, data17);
	WebElement cvvvv = b.findLocatorById("cc_cvv");
	
	String data18 = b.getData("Sheet1",1,17);
	
	b.elementSendKeys(cvvvv, data18);
	
	WebElement booking = b.findLocatorById("book_now");
	
	b.elementClick(booking);
    
	Thread.sleep(7000);
	
	WebElement ordernumber = b.findLocatorById("order_no");
//
   String attributeValue = b.getAttributeValue(ordernumber);
//	
//b.writeData("Sheet1", 1, 18,attributeValue );
//	
	
//b.createSheet("Today", 1,1, attributeValue);	
		
//	b.createRowData("Sheet1", 2, 2, attributeValue);	
	b.updateData("Sheet1", 1, 8,"1 - One",attributeValue);
	}

}
