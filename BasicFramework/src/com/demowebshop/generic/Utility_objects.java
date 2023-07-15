package com.demowebshop.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_objects {

	public static Select dropdown(WebElement element) {
		Select select=new Select(element);
		return select;
	}
	
	public static Actions mouse_actions(WebDriver driver) {
		Actions actions=new Actions(driver);
		return actions;
	}
	
	public static JavascriptExecutor java_script(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		return js;
	}
}
