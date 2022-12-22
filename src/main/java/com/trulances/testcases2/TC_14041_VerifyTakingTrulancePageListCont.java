package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14041_VerifyTakingTrulancePageListCont extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14041_VerifyTakingTrulancePageListCont";
		testDescription ="CR_TRU_TT_001_Verify the font properties section 2 of the body text of the taking trulance page of the trulance website";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14041"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyTakingTrulancePageListCont(String LiTextKeepTrulanceClr,String LiTextKeepTrulanceFontFam,String LiTextKeepTrulanceTextSize,String LiTextKeepTrulanceTextWeight) {
		new TrulanceOtherPages()
		.verifyTalkingTrulancePage(  LiTextKeepTrulanceClr, LiTextKeepTrulanceFontFam, LiTextKeepTrulanceTextSize, LiTextKeepTrulanceTextWeight);
}
}
