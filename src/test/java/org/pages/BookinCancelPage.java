package org.pages;

import org.basclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookinCancelPage extends BaseClass {
	
	public BookinCancelPage() {
		
		PageFactory.initElements(driver,this);
		
			}
	
	@FindBy(id="order_no")
	
	private WebElement orderId;

@FindBy(id="my_itinerary")
	
	private WebElement myItenary;

@FindBy(id="order_id_text")

private WebElement searchId;


@FindBy(id="search_hotel_id")

private WebElement goClick;

@FindBy(xpath="//input[contains(@id,'btn_id_')]")

private WebElement cancelClick;	

@FindBy(id="search_result_error")

private WebElement cancelled;	

public WebElement getOrderId() {
	return orderId;
}


public WebElement getMyItenary() {
	return myItenary;
}

public WebElement getSearchId() {
	return searchId;
}

public WebElement getGoClick() {
	return goClick;
}

public WebElement getCancelClick() {
	return cancelClick;
}

public WebElement getCancelled() {
	return cancelled;
}

public void bookingCancel(String id) {

	elementClick(getMyItenary());
	
	elementSendKeys(getSearchId(), id);	
	
	elementClick(getGoClick());
	elementClick(getCancelClick());
	alertOk();
	
	
}
}
