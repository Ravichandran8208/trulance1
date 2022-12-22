package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14028_VerifyHowItsWorksHeader2BodyCopy extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14028_VerifyHowItsWorksHeader2BodyCopy";
		testDescription ="CR_TRU_AT_004_Verify the changes in ABOUT TRULANCE page on trulance site";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14028"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyHowItsWorksHeader2BodyCopy(String AboutTrulanceHeader2BelowBodyCopyText,String AboutTrulanceHeader2BelowBodyCopyTextclr,String AboutTrulanceHeader2BelowBodyCopyFontFam,String AboutTrulanceHeader2BelowBodyCopyTextsize,String AboutTrulanceHeader2BelowBodyCopyWeight,String AboutTrulanceHeader2BelowBodyCopyHeight) {
		
		new TrulanceOtherPages()
		.verifyAboutTrulanceHeader2BelowBodyCopy( AboutTrulanceHeader2BelowBodyCopyText, AboutTrulanceHeader2BelowBodyCopyTextclr, AboutTrulanceHeader2BelowBodyCopyFontFam, AboutTrulanceHeader2BelowBodyCopyTextsize, AboutTrulanceHeader2BelowBodyCopyWeight, AboutTrulanceHeader2BelowBodyCopyHeight);
}
}
