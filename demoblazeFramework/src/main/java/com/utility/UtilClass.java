package com.utility;

import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase1;

public class UtilClass extends TestBase1 {

		public void utilClass()
		{
			PageFactory.initElements(driver, this);
		}
		
		
		//url get
		public void getUrl()
		{
			String current_url = driver.getCurrentUrl();
			//return current_url;
		}
	}


