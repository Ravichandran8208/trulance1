package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14042_VerifyCommonSideEffectPageBodyText extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14042_VerifyCommonSideEffectPageBodyText";
		testDescription ="CR_TRU_CSE_001_Verify the font properties on the section 1 of the body text of the common side effects page of the trulance website";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14042"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyCommonSideEffectPageBodyText(String BodyCopyofHeading1Text,String BodyCopyofHeading1Clr,String BodyCopyofHeading1FontFam,String BodyCopyofHeading1TextSize,String BodyCopyofHeading1TextWeight) {
		new TrulanceOtherPages()
		.verifyCommonSideEffectsTextPage( BodyCopyofHeading1Text, BodyCopyofHeading1Clr, BodyCopyofHeading1FontFam, BodyCopyofHeading1TextSize, BodyCopyofHeading1TextWeight);
		
}
}