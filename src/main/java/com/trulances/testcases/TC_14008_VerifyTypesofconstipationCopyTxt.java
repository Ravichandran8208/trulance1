package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14008_VerifyTypesofconstipationCopyTxt extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14008_VerifyTypesofconstipationCopyTxt";
		testDescription ="Verify the Copy text1 Of Typesofconstipation page in Trulance Website";
		authors="Ravichandran";
		category ="Regression";
		
		excelFileName="TC_14008"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifySubheadofHeader2 (String CopyTextinHeader1) {
		
		new TrulanceHomePage()
		.VerifyTypesofconstipationCopyTxt( CopyTextinHeader1);
}
}
