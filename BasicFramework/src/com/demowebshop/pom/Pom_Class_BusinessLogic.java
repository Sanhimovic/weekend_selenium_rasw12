package com.demowebshop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.generic.Base_Test;

public class Pom_Class_BusinessLogic extends Base_Test{
	
	@FindBy(xpath = "//ul[@class='top-menu']/li[6]/a")
	private WebElement jew_tab;
	
	@FindBy(linkText = "Create Your Own Jewelry")
	private WebElement product;
	
	@FindBy(xpath = "//input[@class='textbox']")
	private WebElement length_textbox;
	
	public Pom_Class_BusinessLogic(WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement getJew_tab()
	{
		return jew_tab;
	}
	
	public WebElement getProduct()
	{
		return product;
	}
	
	public WebElement getLength_textbox()
	{
		return length_textbox;
	}
}
