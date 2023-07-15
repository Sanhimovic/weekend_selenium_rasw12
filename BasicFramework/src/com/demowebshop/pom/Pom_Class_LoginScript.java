package com.demowebshop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.generic.Base_Test;

public class Pom_Class_LoginScript extends Base_Test{

	@FindBy(linkText = "Log in")
	private WebElement login_link;
	
	@FindBy(id = "Email")
	private WebElement user_textfield;
	
	@FindBy(id = "Password")
	private WebElement pass_textfield;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement login_btn;
	
	@FindBy(linkText = "Log out")
	private WebElement logout_link;
	
	public Pom_Class_LoginScript(WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement getLogin_link()
	{
		return login_link;
	}
	
	public WebElement getUsername()
	{
		return user_textfield;
	}
	
	public WebElement getPassword()
	{
		return pass_textfield;
	}
	
	public WebElement getLogin_btn()
	{
		return login_btn;
	}
	
	public WebElement getLogout_link()
	{
		return logout_link;
	}
}
