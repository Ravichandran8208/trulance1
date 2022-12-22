package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14005_VerifyHeader1 extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14005_VerifyHeader1";
		testDescription ="Verify the Header Text in hero area";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_14005"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyHeader1 (String  HeaderText) {
		
		new TrulanceHomePage()
		.VerifyHeader1(HeaderText);
}
}
