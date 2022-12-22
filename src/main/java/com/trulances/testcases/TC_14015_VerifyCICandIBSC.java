package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14015_VerifyCICandIBSC extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14015_VerifyCICandIBSC";
		testDescription ="CR_TR_TOC_003_Verify the CIC and IBS-C columns are swapped below the hero section on the TYPES OF CONSTIPATION page of the Trulance DTC Website";
		authors="Ravichandran";
		category ="Regression";

		/* excelFileName="TC_14014"; sheetName="Sheet1"; */

	}

	@Test  /*(dataProvider = "fetchData") */
	public void runVerifyCICandIBSC() {
		new TrulanceHomePage()
		.verifyCICandIBS_CColumns();

}
}
