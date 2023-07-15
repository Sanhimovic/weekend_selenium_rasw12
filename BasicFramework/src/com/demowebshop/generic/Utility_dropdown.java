package com.demowebshop.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_dropdown {

	public static void option_select(WebElement element,Object value) {
		Select select = Utility_objects.dropdown(element);
		
		if(value instanceof Integer) {
			select.selectByIndex((Integer) value);
		}
		
		else if(value instanceof String) {
			try {
			select.selectByValue((String) value);
			}
			catch(Exception e) {
				select.selectByVisibleText((String) value);
			}
		}
	}
	
	public static void option_deselect(WebElement element,Object value)
	{
		Select select = Utility_objects.dropdown(element);
		
		if(value instanceof Integer) {
			select.deselectByIndex((Integer) value);
		}
		
		else if(value instanceof String) {
			try {
			select.deselectByValue((String) value);
			}
			catch(Exception e) {
				select.deselectByVisibleText((String) value);
			}
		}
	}
}
