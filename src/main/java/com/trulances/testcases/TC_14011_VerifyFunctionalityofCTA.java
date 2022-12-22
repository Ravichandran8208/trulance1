package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14011_VerifyFunctionalityofCTA extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14011_VerifyFunctionalityofCTA";
		testDescription ="CR_TR_HP_003_Verify the functionality of the link and CTA present in section 1 of the Home page of the Trulance DTC Website";
		authors="Ravichandran";
		category ="Regression";

//		excelFileName="TC_14010"; sheetName="Sheet1";

	}

	@Test /* (dataProvider = "fetchData") */
	public void runVerifyBodyCopyTxtProp() {
		new TrulanceHomePage()
		.Verifyfunctionalitylink_CTAsection1();
		
	}

}
