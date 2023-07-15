package com.demowebshop.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility_actions {

	public static void mouse_hover(WebDriver driver,WebElement element) {
		Utility_objects.mouse_actions(driver).moveToElement(element).perform();
	}
	
	public static void double_click(WebDriver driver,WebElement element) {
		Utility_objects.mouse_actions(driver).doubleClick(element).perform();
	}
}
