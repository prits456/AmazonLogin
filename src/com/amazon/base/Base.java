package com.amazon.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base 
{

	public static WebDriver driver;
	
	@BeforeSuite
	public void openBrowser()
	{
		System.out.println("In OpenBrowser Method under BeforeSuite");
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new EdgeDriver();
	}
	@BeforeTest
	public void enterApplicationUrl()
	{
	System.out.println("This is Before Test");
    driver.get("https://www.amazon.com/?tag=hp2-brobookmark-us-20");
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.manage().window().maximize();

}
}