package org.junit;

import java.io.IOException;

import org.basclass.BaseClass;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {

@BeforeClass
	public static void beforeClass() {

	getDriver();
	sendUrl("https://adactinhotelapp.com/");
	maximizeWindow();
		

}


@Before
public void befores() {

}
@Test
public void login() throws IOException {

	WebElement usrname = findLocatorById("username");
	
	String data = getData("Sheet1",1,0);
	
	elementSendKeys(usrname, data);
	
	
	WebElement pass = findLocatorById("password");
	
	String data2 = getData("Sheet1",1,1);
	
	elementSendKeys(pass, data2);

	WebElement logins = findLocatorById("login");
	
	elementClick(logins);
	}
@After
public void after() {

}

//@AfterClass
//public static void afterClass() {
//
//System.out.println("m");
//}
}

















