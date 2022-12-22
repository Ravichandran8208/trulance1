package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14035_VerifySubHeadOfTrulanceIBSC extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14035_VerifySubHeadOfTrulanceIBSC";
		testDescription ="CR_TRU_TR IBS_001_Verify the font properties of the subheading on the trulance IBS-C page of the trulance website";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14035"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifySubHeadOfTrulanceIBSC(String SubHeadOfTrulanceIBSCText,String SubHeadOfTrulanceIBSCTextClr,String SubHeadOfTrulanceIBSCFontFam,String SubHeadOfTrulanceIBSCTextSize,String SubHeadOfTrulanceIBSCTextWeight) {
		new TrulanceOtherPages()
		.verifySubHeadOfTrulanceIBSC( SubHeadOfTrulanceIBSCText, SubHeadOfTrulanceIBSCTextClr, SubHeadOfTrulanceIBSCFontFam, SubHeadOfTrulanceIBSCTextSize, SubHeadOfTrulanceIBSCTextWeight);
}
}
