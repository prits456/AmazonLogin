package com.amazon.logintest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.base.Base;
import com.amazon.loginpage.Pomloginpage;
import com.amazon.loginpage.Verify;

public class Pomlogintest extends Base {

	@Test(priority = 1 )
	public void loginpage() throws InterruptedException {

		Pomloginpage l = new Pomloginpage(driver);
		l.signclick();
		l.unmethod();
		l.cont();
		l.passmethod();
		l.loginbuttonSmethod();

		Thread.sleep(10000);
		String loginurl = driver.getCurrentUrl();
		System.out.println(loginurl);
		String url = "https://www.amazon.com/?tag=hp2-brobookmark-us-20&ref_=nav_ya_signin";

		Assert.assertTrue(true);
		Assert.assertEquals(url, loginurl);

		System.out.println("Verification of login  is  successfully");
	}

	@Test(priority = 2, dependsOnMethods = { "loginpage" })
	public void verifyelements() {

		Verify vf = new Verify(driver);
		vf.Verify();
		System.out.println("verification of subelements is successfully");
		driver.close();

	}

}
