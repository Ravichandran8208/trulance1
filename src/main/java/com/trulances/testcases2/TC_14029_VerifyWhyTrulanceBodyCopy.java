package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14029_VerifyWhyTrulanceBodyCopy extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14029_VerifyWhyTrulanceBodyCopy";
		testDescription ="CR_TRU_AT_006_Verify the changes in ABOUT TRULANCE page on trulance site";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14029"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyWhyTrulanceBodyCopy(String WhyTrulanceHeader2BelowBodyCopyText,String WhyTrulanceHeader2BelowBodyCopyTextclr,String WhyTrulanceHeader2BelowBodyCopyFontFam,String WhyTrulanceHeader2BelowBodyCopyTextsize,String WhyTrulanceHeader2BelowBodyCopyWeight,String WhyTrulanceHeader2BelowBodyCopyHeight) {
		
		new TrulanceOtherPages()
		.verifyWhyTrulanceHeader2BelowBodyCopy( WhyTrulanceHeader2BelowBodyCopyText, WhyTrulanceHeader2BelowBodyCopyTextclr, WhyTrulanceHeader2BelowBodyCopyFontFam, WhyTrulanceHeader2BelowBodyCopyTextsize, WhyTrulanceHeader2BelowBodyCopyWeight, WhyTrulanceHeader2BelowBodyCopyHeight);

}
}
