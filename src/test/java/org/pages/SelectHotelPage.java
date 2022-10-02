package org.pages;

import org.basclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage() {

		PageFactory.initElements(driver,this);
	
		}

	@FindBy(xpath="//td[text()='Select Hotel '] ")
	
	private WebElement txtSelectHotel;

	
	@FindBy(id="radiobutton_0")
	
	private WebElement radioButton;
	
  @FindBy(id="continue")
	
	private WebElement continues;

public WebElement getTxtSelectHotel() {
	return txtSelectHotel;
}

public WebElement getRadioButton() {
	return radioButton;
}

public WebElement getContinues() {
	return continues;
}
	
public void continueClick() {

//	elementClick(getTxtSelectHotel());
    
	elementClick(getRadioButton());

    elementClick(getContinues());
	
	
	
	
	
}	




















	
}
