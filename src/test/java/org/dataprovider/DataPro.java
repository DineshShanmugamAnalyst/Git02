package org.dataprovider;

import org.basclass.BaseClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro extends BaseClass {
	

	 @Test(dataProvider="result")
	   public void test1(String username ,String password) {

		getDriver();
		sendUrl("https://www.facebook.com/login/");
		maximizeWindow();
		
		
		findLocatorById("email").sendKeys(username);
		findLocatorById("pass").sendKeys(password);
		
	}
	
	 @DataProvider(name="result")
	 private Object[][] getdata() {

	Object[][] data= new Object[3][2];
	
	data[0][0]="Greens";
	data[0][1]="Greens";
	
	data[1][0]="Akash";
	data[1][1]="Greens";
	
	data[2][0]="Aanand";
	data[2][1]="Greens";
	return data;
	
	
	}

	
}
	
	
	
