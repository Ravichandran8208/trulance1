package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14021_VerifyIBSCandCICButton extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = " TC_14021_VerifyIBSCandCICButton";
		testDescription ="CR_TR_TFI_001_Verify the changes made on the IBS-C and CIC CTA buttons of the TRULANCE FOR IBS-C and CIC subpage of the Trulance DTC Website";
		authors="Ravichandran";
		category ="Regression";

		/*
		 * excelFileName="TC_14021"; sheetName="Sheet1";
		 */
	}

	@Test  /*(dataProvider = "fetchData") */
	public void runVerifyIBSCandCICButton () {
		new TrulanceHomePage()
		.VerifyIBSCandCICButtonLocation();

}
}
