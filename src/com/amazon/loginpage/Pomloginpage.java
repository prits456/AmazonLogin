package com.amazon.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Pomloginpage {
	WebDriver driver;
	
	By signinclick=By.xpath("//span[text()='Hello, sign in']");
	
	 By username =By.xpath("//input[@type='email']");
			 
	By contin=By.xpath("//input[contains(@id,'continue')]");
	
	By password=By.xpath("//input[contains(@type,'password')]");
	
	By submit=By.xpath("//input[contains(@id,'signInSubmit')]");

	public Pomloginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void signclick()
	{
		driver.findElement(signinclick).click();
	}
	public void unmethod()
	{
		
		//Assert.assertTrue(username.);
		driver.findElement(username).sendKeys("9096857144");
	}
	
	
	public void cont()
	{
		driver.findElement(contin).click();;
	}
	public void passmethod()
	{
		driver.findElement(password).sendKeys("Pritam@12345");
	}
	public void loginbuttonSmethod()
	{
		driver.findElement(submit).click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
