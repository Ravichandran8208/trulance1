package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14031_VerifyTrulanceForCICBodyCopy extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14031_VerifyTrulanceForCICBodyCopy";
		testDescription ="CR_TRU_TFC_002_Verify the changes in the submenu Trulance for CIC in ABOUT TRULANCE page on trulance site";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14031"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyVerifyTrulanceForCICBodyCopy(String TrulanceForCICHeader2BelowBodyCopyText,String TrulanceForCICHeader2BelowBodyCopyTextclr,String TrulanceForCICHeader2BelowBodyCopyFontFam,String TrulanceForCICHeader2BelowBodyCopyTextsize,String TrulanceForCICHeader2BelowBodyCopyWeight,String TrulanceForCICHeader2BelowBodyCopyHeight) {
		
		new TrulanceOtherPages()
		.verifyTrulanceForCICHeader2BelowBodyCopy( TrulanceForCICHeader2BelowBodyCopyText, TrulanceForCICHeader2BelowBodyCopyTextclr, TrulanceForCICHeader2BelowBodyCopyFontFam, TrulanceForCICHeader2BelowBodyCopyTextsize, TrulanceForCICHeader2BelowBodyCopyWeight, TrulanceForCICHeader2BelowBodyCopyHeight);
}
}
