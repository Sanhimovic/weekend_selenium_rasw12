package com.demowebshop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demowebshop.generic.Base_Test;

public class Pom_Class_smartphone_search extends Base_Test{

	@FindBy(id = "small-searchterms")
	private WebElement search_field;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement search_btn;
	
	public Pom_Class_smartphone_search(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getSearch_field() {
		return search_field;
	}
	
	public WebElement getSearch_btn() {
		return search_btn;
	}
}
