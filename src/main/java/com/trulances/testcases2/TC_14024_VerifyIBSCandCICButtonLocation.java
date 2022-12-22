package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14024_VerifyIBSCandCICButtonLocation extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14024_VerifyIBSCandCICButtonLocation";
		testDescription ="CR_TRU_TOC_003_Verify the changes in TYPES OF CONSTIPATION page  on trulance website";
		authors="Ravichandran";
		category ="Regression";
		
		/* excelFileName="TC_14023"; sheetName="Sheet1"; */
		 
	}

	@Test /* (dataProvider = "fetchData") */
		public void runVerifyIBSCandCICButtonLocation () {
		
		new TrulanceOtherPages()
		.VerifyIBSCandCICButtonLocation();

}
}
