package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14022_VerifyTRULANCEMenuOpenedinSametab extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = " TC_14022_VerifyTRULANCEMenuOpenedinSametab";
		testDescription ="CR_TR_TFI_002_Verify the changes made in section 1 on the TRULANCE FOR IBS-C subpage of the Trulance DTC Website";
		authors="Ravichandran";
		category ="Regression";

		
		  excelFileName="TC_14022"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
	public void runVerifyTRULANCEMenuOpenedinSametab(String TRULANCE_IBSCMenuTitle) {
		new TrulanceHomePage()
		.VerifySubMenuOpenInSameTab(TRULANCE_IBSCMenuTitle);
}
}