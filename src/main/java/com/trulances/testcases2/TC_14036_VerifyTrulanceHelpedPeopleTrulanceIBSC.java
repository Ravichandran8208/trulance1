package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14036_VerifyTrulanceHelpedPeopleTrulanceIBSC extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14036_VerifyTrulanceHelpedPeopleTrulanceIBSC";
		testDescription ="CR_TRU_TR IBS_001_Verify the font properties of the body text on the trulance IBS-C page of the trulance website";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14036"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifySubHeadOfTrulanceIBSC(String TrulanceHelpedPeopleHeadText1,String TrulanceHelpedPeopleHeadTextClr,String TrulanceHelpedPeopleHeadTextFontFam,String TrulanceHelpedPeopleHeadTextSize,String TrulanceHelpedPeopleHeadTextWeight,String StrongTrulanceHelpedPeopleHeadTextWeight) {
		new TrulanceOtherPages()
		.verifyTrulanceHelpedPeopleTrulanceIBSC( TrulanceHelpedPeopleHeadText1, TrulanceHelpedPeopleHeadTextClr, TrulanceHelpedPeopleHeadTextFontFam, TrulanceHelpedPeopleHeadTextSize, TrulanceHelpedPeopleHeadTextWeight,StrongTrulanceHelpedPeopleHeadTextWeight);
}
}
