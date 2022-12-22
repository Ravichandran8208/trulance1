package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14027_VerifyAboutTrulanceBodyCopy extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14027_VerifyAboutTrulanceBodyCopy";
		testDescription ="CR_TRU_AT_002_Verify the changes in ABOUT TRULANCE page on trulance site";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14027"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyAboutTrulanceBodyCopy (String BodyCopyInAboutTrulanceText,String BodyCopyInAboutTrulanceTextclr,String BodyCopyInAboutTrulanceTextFontFam,String BodyCopyInAboutTrulanceTextsize,String BodyCopyInAboutTrulanceTextWeight,String BodyCopyInAboutTrulanceStrongTextWeight) {
		
		new TrulanceOtherPages()
		.verifyBodyCopyInAboutTrulance( BodyCopyInAboutTrulanceText, BodyCopyInAboutTrulanceTextclr, BodyCopyInAboutTrulanceTextFontFam, BodyCopyInAboutTrulanceTextsize, BodyCopyInAboutTrulanceTextWeight, BodyCopyInAboutTrulanceStrongTextWeight);
	}
}
