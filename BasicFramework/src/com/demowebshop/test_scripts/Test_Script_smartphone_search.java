package com.demowebshop.test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.demowebshop.generic.Base_Class;
import com.demowebshop.pom.Pom_Class_smartphone_search;

public class Test_Script_smartphone_search extends Base_Class{

	@Test
	public void smartphone() {
		test=reports.createTest(this.getClass().getName()).assignAuthor("Sandeep");
		Pom_Class_smartphone_search smart_search=new Pom_Class_smartphone_search(driver);
		smart_search.getSearch_field().sendKeys("smartphone");
		test.log(Status.INFO, "data is entered");
		Assert.fail();
		smart_search.getSearch_btn().click();
		test.log(Status.INFO, "button is clicked");
	}
}
