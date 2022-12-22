package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14037_VerifyMoreLetterInSubHeading extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14037_VerifyMoreLetterInSubHeading";
		testDescription ="CR_TRU_TR IBS_001_Verify the font properties of the body text on the trulance IBS-C page of the trulance website";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14037"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyVerifyMoreLetterInSubHeading(String MoreText,String LetterMORETextClr,String LetterMORETextFontFam,String LetterMORETextSize,String LetterMORETextWeight) {
		new TrulanceOtherPages()
		.verifySubHeadingLetterMORE( MoreText, LetterMORETextClr, LetterMORETextFontFam, LetterMORETextSize, LetterMORETextWeight);
}
}
