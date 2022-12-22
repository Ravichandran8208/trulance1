package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14004_VerifyEyeBroTextInHeroArea extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14004_VerifyEyeBroTextInHeroArea";
		testDescription ="Verify the Eyebro Text in hero area";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_14004"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyEyeBroTextInHeroArea (String  EyeBroText,String AlignmentOfText,String EyeBroTextWeight) {
		
		new TrulanceHomePage()
		.VerifyEyeBroTextInHeroArea(EyeBroText,AlignmentOfText,EyeBroTextWeight);
}
}