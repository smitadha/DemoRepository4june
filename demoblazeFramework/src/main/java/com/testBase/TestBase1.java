package com.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase1 {
	
	public static WebDriver driver;
	
	@BeforeMethod
public void setUp()
{
		/*String br = "chrome";
		
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new EdgeDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new FirefoxDriver();
		}
		
		else
		{
			System.out.println("please provide correct browser");
		}*/

	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.get("https://demoblaze.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
