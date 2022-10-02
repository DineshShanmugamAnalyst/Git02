package org.findbysfindall;

import org.basclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FbLogin extends BaseClass {
	
	
	public FbLogin() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@type='text']")})
	
	
	private WebElement username;
	
	
	@CacheLookup
	@FindAll({@FindBy(id="pass"),@FindBy(name="text")})
	private WebElement password;



	public WebElement getUsername() {
		return username;
	}



	public WebElement getPassword() {
		return password;
	}
	
	
	
	
	
	

}
