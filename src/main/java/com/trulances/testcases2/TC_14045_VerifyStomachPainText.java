package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14045_VerifyStomachPainText extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14045_VerifyStomachPainText";
		testDescription ="CR_TRU_DDG_001_Verify the font properties on the section1 of the body text of the doctor discussion guide page of the trulance website";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14045"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyStomachPainText (String StomachPainTextClr,String StomachPainTextFontFam,String StomachPainTextSize,String StomachPainTextWeight) {
		new TrulanceOtherPages()
		.verifydoctordiscussionguideStomachPainText(StomachPainTextClr, StomachPainTextFontFam, StomachPainTextSize, StomachPainTextWeight);
}
}
