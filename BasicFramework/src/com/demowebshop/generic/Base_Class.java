package com.demowebshop.generic;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.demowebshop.pom.Pom_Class_LoginScript;

public class Base_Class implements Framework_Constants{

	public static WebDriver driver;
	public Pom_Class_LoginScript log_in;
	public static ExtentReports reports;
	public static ExtentHtmlReporter reporter;
	public static ExtentTest test;
	
	@BeforeTest
	public void reportconfig(){
		reports=new ExtentReports();
		reporter=new ExtentHtmlReporter(extentpath);
		reports.attachReporter(reporter);
	}
	
	@BeforeClass
	public void openApp() {
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(time_out, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void login() throws IOException {
		String username = GetDataFromProperty.getData("username");
		String pass = GetDataFromProperty.getData("password");
		log_in=new Pom_Class_LoginScript(driver);
		log_in.getLogin_link().click();
		log_in.getUsername().sendKeys(username);
		log_in.getPassword().sendKeys(pass);
		log_in.getLogin_btn().click();
	}
	
	@AfterMethod
	public void logout()
	{
		log_in.getLogout_link().click();
	}
	
	@AfterClass
	public void closeApp() {
		driver.quit();
	}
	
	@AfterTest
	public void endReport() throws IOException {
		reports.flush();
		Desktop.getDesktop().browse(new File(extentpath).toURI());
	}
}
