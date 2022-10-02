package org.pages;

import org.basclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {

	public BookHotelPage() {

	PageFactory.initElements(driver,this);
	
	
	}
	
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	
	private WebElement txtBookHotel;
	
	
	
  @FindBy(id="first_name") 
	
	private WebElement firstName;
	
  @FindBy(id="last_name")
	
	private WebElement lastName;
	
  @FindBy(id="address")
	
 	private WebElement addressBox;
 	
  @FindBy(id="cc_num")
	
	private WebElement ccNumbers;
	
  @FindBy(id="cc_type")
	
	private WebElement ccType;
  
  
  @FindBy(id="cc_exp_month")
	
 	private WebElement ccMonth;
   
  
  @FindBy(id="cc_exp_year")
	
	private WebElement ccYear;
 

  @FindBy(id="cc_cvv")
	
 	private WebElement cVVNum;


  @FindBy(id="book_now")
	
	private WebElement bookingNow;


public WebElement getTxtBookHotel() {
	return txtBookHotel;
}


public WebElement getFirstName() {
	return firstName;
}


public WebElement getLastName() {
	return lastName;
}


public WebElement getAddressBox() {
	return addressBox;
}


public WebElement getCcNumbers() {
	return ccNumbers;
}


public WebElement getCcType() {
	return ccType;
}


public WebElement getCcMonth() {
	return ccMonth;
}


public WebElement getCcYear() {
	return ccYear;
}


public WebElement getcVVNum() {
	return cVVNum;
}


public WebElement getBookingNow() {
	return bookingNow;
}

  
  public void booking(String firstName,String lastName,String addresses,String numbers,String ccType,String month,String year,String cvvNum) {

	  
	elementSendKeys(getFirstName(), firstName);  
	elementSendKeys(getLastName(), lastName);  
	elementSendKeys(getAddressBox(), addresses);
	elementSendKeys(getCcNumbers(), numbers);
	elementSendKeys(getCcType(), ccType);
	elementSendKeys(getCcMonth(), month);
	elementSendKeys(getCcYear(), year);
	elementSendKeys(getcVVNum(), cvvNum);
  elementClick(getBookingNow());
  
  }
  
  
  
  
  
  
  
  
  
  
	
	
	
	
}
