package com.demowebshop.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility_javascript {

	public static void pass_data(WebDriver driver,String data,WebElement element){
		Utility_objects.java_script(driver)
		.executeScript("arguments[0].value='"+data+"'", element);
	}
	
	public static void click_disabled(WebDriver driver,WebElement element) {
		Utility_objects.java_script(driver)
		.executeScript("arguments[0].click();", element);
	}
	
	public static void scroll_to_element(WebDriver driver,WebElement element) {
		Utility_objects.java_script(driver)
		.executeScript("arguments[0].scrollIntoView()", element);
	}
}
