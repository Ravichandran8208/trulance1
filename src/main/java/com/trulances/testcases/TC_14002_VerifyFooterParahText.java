package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14002_VerifyFooterParahText extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14002_VerifyFooterParahText";
		testDescription ="check the Footer Text Contains Year 2020 or not";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_14002"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyFooterParahText (String FooterParahText,String FooterFontFamily,String FooterTextClr,String FooterTextSize,String FooterTextWeight) {
		
		new TrulanceHomePage()
		.verifyFooterTextContainsYear2020(FooterParahText,FooterFontFamily,FooterTextClr,FooterTextSize,FooterTextWeight);
}
}
