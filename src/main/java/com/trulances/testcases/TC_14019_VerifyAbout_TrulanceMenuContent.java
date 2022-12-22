package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14019_VerifyAbout_TrulanceMenuContent extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14019_VerifyAbout_TrulanceMenuContent";
		testDescription ="Verify the changes made in the hero section on the ABOUT TRULANCE page of the Trulance DTC Website";
		authors="Ravichandran";
		category ="Regression";

		 excelFileName="TC_14019"; sheetName="Sheet1"; 

	}

	@Test  (dataProvider = "fetchData") 
	public void runVerifyAbout_TrulanceMenuContent(String BodyCopyTxtinAbout_TrulanceMenu1,String BodyCopyTxtinAbout_TrulanceMenuFontFamily,String BodyCopyTxtinAbout_TrulanceMenuSize,String BodyCopyTxtinAbout_TrulanceMenuClr,String BodyCopyTxtinAbout_TrulanceMenuWeight,String fontbelowBodyCopyWeight) {
		new TrulanceHomePage()
		.VerifyAbout_TrulanceMenu( BodyCopyTxtinAbout_TrulanceMenu1, BodyCopyTxtinAbout_TrulanceMenuFontFamily, BodyCopyTxtinAbout_TrulanceMenuSize, BodyCopyTxtinAbout_TrulanceMenuClr, BodyCopyTxtinAbout_TrulanceMenuWeight, fontbelowBodyCopyWeight);
}
}
