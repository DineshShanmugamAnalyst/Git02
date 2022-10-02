package org.pages;

import org.basclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	
	public SearchHotelPage() {

		PageFactory.initElements(driver,this);
	
	}
	
	
@FindBy(id="location")
	
private	WebElement dDnLocation;
	
@FindBy(id="username_show")

private WebElement txtWelcomeMsg ;

@FindBy(id="hotels")

private	WebElement dDnHotels ;
		

@FindBy(id="room_type")

private	WebElement dDnRoomType ;
		

@FindBy(id="room_nos")

private	WebElement dDnNoOfRooms ;
		

@FindBy(id="datepick_in")

private	WebElement dDnCheckInDate ;
		

@FindBy(id="datepick_out")

private	WebElement dDnCheckOutDate ;
		

@FindBy(id="adult_room")

private	WebElement dDnAdultPerRooms ;
		

@FindBy(id="child_room")

private	WebElement dDnChildPerRooms ;
		

@FindBy(id="Submit")

private	WebElement btnSearch ;


public WebElement getdDnLocation() {
	return dDnLocation;
}


public WebElement getTxtWelcomeMsg() {
	return txtWelcomeMsg;
}


public WebElement getdDnHotels() {
	return dDnHotels;
}


public WebElement getdDnRoomType() {
	return dDnRoomType;
}


public WebElement getdDnNoOfRooms() {
	return dDnNoOfRooms;
}


public WebElement getdDnCheckInDate() {
	return dDnCheckInDate;
}


public WebElement getdDnCheckOutDate() {
	return dDnCheckOutDate;
}


public WebElement getdDnAdultPerRooms() {
	return dDnAdultPerRooms;
}


public WebElement getdDnChildPerRooms() {
	return dDnChildPerRooms;
}


public WebElement getBtnSearch() {
	return btnSearch;
}
		
public void SearchHotels(String location,String hotels,String roomType,String noOfRooms,String checkInDate,String checkOutDate,String adultsPerRoom,String chilPerRoom) {
	
	
	
	
	
	selectOptionByText(getdDnLocation(), location);
	
	selectOptionByText(getdDnHotels(), hotels);
	
//	selectOptionByText(getdDnRoomType(), roomType);
elementSendKeys(getdDnRoomType(), roomType);
	
	
//	selectOptionByText(getdDnNoOfRooms(), noOfRooms);
	

elementSendKeys(getdDnNoOfRooms(), noOfRooms);
	
//selectOptionByText(getdDnCheckInDate(), checkInDate);

elementSendKeys(getdDnCheckInDate(), checkInDate);
//	selectOptionByText(getdDnCheckOutDate(), checkOutDate);

elementSendKeys(getdDnCheckOutDate(), checkOutDate);
	
//selectOptionByText(getdDnAdultPerRooms(), adultsPerRoom);

elementSendKeys(getdDnAdultPerRooms(), adultsPerRoom);
	
//selectOptionByText(getdDnChildPerRooms(), chilPerRoom);
elementSendKeys(getdDnChildPerRooms(), chilPerRoom);	
	elementClick(getBtnSearch());
	
	
	
}



	
	
	
	
	

}
