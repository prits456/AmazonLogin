package com.amazon.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class Listerners implements ITestListener {


	  WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) {
		
	System.out.println("In side Listerrs----- On Test success");
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("sc taken.................................................................");
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile , new File("C:\\Users\\Vaibhav\\eclipse-workspace3\\AmezonLogin\\test-output\\screenshot.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		//System.out.println("In side Listerrs--------On Test failure  takes A SC SUCCESSFULLY");
	}

		
	
	

