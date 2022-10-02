package org.pages;

import java.io.IOException;

import org.basclass.BaseClass;
import org.junit.AfterClass;
import org.junit.Assert;
//import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Employee extends BaseClass{

@BeforeClass
	public static void beforeClass() {

	getDriver();
	
	sendUrl("https://adactinhotelapp.com/");
	
	maximizeWindow();
	}


@AfterClass
public static void afterClass() {

//	quitWindow();
	
}

@Test
public void booking() throws IOException, InterruptedException {

//	Login
	
	LoginPage loginPage = new LoginPage();
	
	loginPage.login(getData("Sheet1",1, 0),getData("Sheet1",1,1));
	
	
//	searchHotel
	
	SearchHotelPage search = new SearchHotelPage();
	
	
	WebElement txtWelcomeMsg = search.getTxtWelcomeMsg();
	
	String attributeValue = getAttributeValue(txtWelcomeMsg);
	
	Assert.assertEquals("verify after login","Hello DineshShanmugam123!",attributeValue);
	
	search.SearchHotels(getData("Sheet1",1,2),getData("Sheet1",1,3),getData("Sheet1",1,4),getData("Sheet1",1,5),getData("Sheet1",1,6),getData("Sheet1",1,7),getData("Sheet1",1,8),getData("Sheet1", 1, 9));
	
	
//Select hotel	
	
	SelectHotelPage select = new SelectHotelPage();
	
//   WebElement txtSelectHotel = select.getTxtSelectHotel();
//   String text = getText(txtSelectHotel);
   WebElement txtSelectHotel = select.getTxtSelectHotel();
   String values = getText(txtSelectHotel);
   
   

   Assert.assertEquals("verify select hotel","Select Hotel",values);
   
   select.continueClick();
   
// Book Hotel  
   
	BookHotelPage b = new BookHotelPage();
	
	WebElement txtBookHotel = b.getTxtBookHotel();
	String text = getText(txtBookHotel);
	
	Assert.assertEquals("verify Book Hotel","Book A Hotel",text);
	
	b.booking(getData("Sheet1",1,10),getData("Sheet1",1,11),getData("Sheet1",1,12),getData("Sheet1",1,13),getData("Sheet1",1,14),getData("Sheet1",1,15),getData("Sheet1",1,16),getData("Sheet1",1,17));
	
	
	Thread.sleep(7000);
	
	BookingConfirmPage booking = new BookingConfirmPage();
	
	WebElement txtBookingCnfm = booking.getTxtBookingCnfm();
	
	String text2 = getText(txtBookingCnfm);
	
	Assert.assertEquals("Verify Booking confirm","Booking Confirmation",text2);
	
//	cancel
	
	BookinCancelPage bp = new BookinCancelPage();
	WebElement orderId = bp.getOrderId();
	
	String attributeValue2 = getAttributeValue(orderId);
	
	
	bp.writeData("Sheet1",1,33, attributeValue2);
	
//	Thread.sleep(7000);
	bp.bookingCancel(getData("Sheet1",1,33));
	
	
	
	WebElement cancelled = bp.getCancelled();
	
	String text3 = getText(cancelled);
	
	Assert.assertEquals("Veriy cancelled","The booking has been cancelled.",text3);
	
	System.out.println(text3);
	
	
}

}
	

