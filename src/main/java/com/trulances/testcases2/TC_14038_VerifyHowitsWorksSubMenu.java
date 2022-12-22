package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14038_VerifyHowitsWorksSubMenu extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14038_VerifyHowitsWorksSubMenu";
		testDescription ="CR_TRU_HTW_001_Verify the font properties on the section 1 of the body text on the  how trulance works page of the trulance website";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14038"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyHowitsWorksSubMenu(String Head1BodyCopyText,String Head1BodyCopyextClr,String Head1BodyCopyFontFam,String Head1BodyCopyTextSize,String Head1BodyCopyTextWeight) {
		new TrulanceOtherPages()
		.verifyHowitsWorksSubMenu( Head1BodyCopyText, Head1BodyCopyextClr, Head1BodyCopyFontFam, Head1BodyCopyTextSize, Head1BodyCopyTextWeight);
}
}
