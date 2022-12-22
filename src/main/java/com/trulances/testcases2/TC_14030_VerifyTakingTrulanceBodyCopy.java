package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14030_VerifyTakingTrulanceBodyCopy extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14030_VerifyTakingTrulanceBodyCopy";
		testDescription ="CR_TRU_AT_008_Verify the changes in ABOUT TRULANCE page on trulance site";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14030"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyTakingTrulanceBodyCopy(String TakingTrulanceHeader2BelowBodyCopyText,String TakingTrulanceHeader2BelowBodyCopyTextclr,String TakingTrulanceHeader2BelowBodyCopyFontFam,String TakingTrulanceHeader2BelowBodyCopyTextsize,String TakingTrulanceHeader2BelowBodyCopyWeight,String TakingTrulanceHeader2BelowBodyCopyHeight) {
		
		new TrulanceOtherPages()
		.verifyTakingTrulanceHeader2BelowBodyCopy( TakingTrulanceHeader2BelowBodyCopyText, TakingTrulanceHeader2BelowBodyCopyTextclr, TakingTrulanceHeader2BelowBodyCopyFontFam, TakingTrulanceHeader2BelowBodyCopyTextsize, TakingTrulanceHeader2BelowBodyCopyWeight, TakingTrulanceHeader2BelowBodyCopyHeight);

}
}