package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14013_VerifyLayoutSec1 extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14013_VerifyLayoutSec1";
		testDescription ="CR_TR_HP_005_Verify the background, padding and layout of section 1 on the Home page of the Trulance DTC Website";
		authors="Ravichandran";
		category ="Regression";

		excelFileName="TC_14013"; sheetName="Sheet1";

	}

	@Test  (dataProvider = "fetchData") 
	public void runVerifyLayoutSec1(String layout) {
		new TrulanceHomePage()
		.Verify_LayoutSec1(layout);
	}

}
