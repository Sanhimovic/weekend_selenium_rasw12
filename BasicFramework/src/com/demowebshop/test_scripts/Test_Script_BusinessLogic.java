package com.demowebshop.test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.demowebshop.generic.Base_Class;
import com.demowebshop.pom.Pom_Class_BusinessLogic;

public class Test_Script_BusinessLogic extends Base_Class {

	@Test
	public void script(){
		test=reports.createTest(this.getClass().getName()).assignAuthor("Sandeep");
		Pom_Class_BusinessLogic logic=new Pom_Class_BusinessLogic(driver);
		logic.getJew_tab().click();
		Assert.fail();
		test.log(Status.PASS, "button clicked");
	}
}