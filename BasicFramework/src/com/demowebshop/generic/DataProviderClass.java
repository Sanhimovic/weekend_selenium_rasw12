package com.demowebshop.generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name="testdata")
	public static Object[][] getData() throws EncryptedDocumentException, IOException {
		Object[][] data = GetDataFromExcel.getDataFromExcel("Sheet 2");
		return data;
	}
}