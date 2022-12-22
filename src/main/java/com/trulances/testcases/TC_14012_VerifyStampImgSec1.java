package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14012_VerifyStampImgSec1 extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14012_VerifyStampImgSec1";
		testDescription ="CR_TR_HP_004_Verify the alt tag of the ACG GUIDELINES STAMP image present in the section 1 of the Trulance DTC Website";
		authors="Ravichandran";
		category ="Regression";

		excelFileName="TC_14012"; sheetName="Sheet1";

	}

	@Test  (dataProvider = "fetchData") 
	public void runVerifyStampImgSec1(String AlttagStampImgSec1) {
		new TrulanceHomePage()
		.Verify_alttag_ACGGUIDELINES_STAMPSec1(AlttagStampImgSec1);

}
}
