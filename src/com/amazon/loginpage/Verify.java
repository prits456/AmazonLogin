package com.amazon.loginpage;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Verify {
	
   public static   WebDriver driver ;
		
	By boxclicking=	By.xpath("//a[@id='nav-hamburger-menu']");

	
	public Verify(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Verify()
	{
	      driver.findElement(boxclicking).click();
          String title = driver.getTitle();
		  System.out.println(title);
         List<String> list = Arrays.asList("Amazon Music", "Kindle E-readers & Books", "Amazon Appstore", "Electronics",
				"Computers", "Smart Home", "Arts & Crafts", "Gift Cards", "Shop By Interest", "Amazon Live",
				"International Shopping", "Your Account", "English", "United States", "Customer Service", "Sign in");
		System.out.println(list);
         List<WebElement> eleme = driver.findElements(By.xpath("//div[@id='hmenu-content']/ul[@data-menu-id='1']/li/a[@class='hmenu-item']"));
		for (String elementFromList : list) 
		{
		   for (int i = 0; i<eleme.size()-1; i++) 
			{
				WebElement element = eleme.get(i);
				String text = element.getText();
				// System.out.println(text);

				if (text.equalsIgnoreCase(elementFromList)) {
					System.out.println("The " + elementFromList + " is displayed");
					break;
				} else 
				{
				if (eleme.get(i+1)==null) {
						System.out.println("The " + elementFromList + " is not displayed");

					}
				}
			}
		  // System.out.println("Verify all main menu elements");
		}

		
		List <String> list11=Arrays.asList("Amazon Music Unlimited","Free Streaming Music","Podcasts","Open Web Player","Open Web Player","Download the app");
		System.out.println(list11);
		System.out.println("List of webelement in submenu are ------------");
		
		driver.findElement(By.xpath("//div[text()='Amazon Music']")).click();

		
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='hmenu hmenu-visible hmenu-translateX']/li/a[@class='hmenu-item']"));
	  for(String subelemetn : list11) 
	  {
		for(int i=0;i<list1.size()-1;i++)
		{
		WebElement ele1=list1.get(i);
			String text1=ele1.getText();
			if(text1.equalsIgnoreCase(subelemetn))
               {
				System.out.println("The " + subelemetn + " is displayed");
			     break;
				}
			
	         else 
			{
			if (list1.get(i+1)==null) {
					System.out.println("The " + subelemetn + " is not displayed");

			}
		}
			
	  }
		
	}
	}
}