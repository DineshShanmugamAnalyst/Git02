package org.pages;

import org.basclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage extends BaseClass {

	public BookingConfirmPage() {

		PageFactory.initElements(driver, this);
	}


@FindBy(xpath="//td[text()='Booking Confirmation '] ")
private WebElement txtBookingCnfm;


public WebElement getTxtBookingCnfm() {
	return txtBookingCnfm;
}








}


















