package com.demowebshop.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

public class GetScreenshot implements Framework_Constants{

	public static void getPhoto(WebDriver driver,ITestResult result) {
		
		Date d=new Date();
		String actual_date = d.toString().replaceAll(":", "-");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(screenshot_path+actual_date+result.getName()+" .jpeg");
		try {
			FileHandler.copy(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}