package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase1;

public class LoginPage extends TestBase1{
	
	

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//-------Object Repository-------
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_txtbox;
	

	@FindBy(xpath="//input[@name='password']")
	private WebElement password_txtbox;
	

	@FindBy(xpath="//div[@class='mt-3 d-grid']")
	private WebElement login_button;
	

	//-------Action Method------------
	
	public void enterEmailAddress()
	{
		 email_txtbox.sendKeys("smitakawathe91@gmail.com");
	}
	
	public void enterPassword()
	{
		password_txtbox.sendKeys("Mayursmita");
	}
	
	public void clickOnLoginButton()
	{
		 login_button.click();
	}
	
	
	
}
