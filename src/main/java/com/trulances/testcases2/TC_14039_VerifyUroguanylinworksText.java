package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14039_VerifyUroguanylinworksText extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14039_VerifyUroguanylinworksText";
		testDescription ="CR_TRU_HTW_001_Verify the font properties on the section 1 of the body text on the  how trulance works page of the trulance website";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14039"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyUroguanylinworksText(String UroguanylinworksText1,String UroguanylinworksTextClr,String UroguanylinworksTextFontFam,String UroguanylinworksTextSize,String UroguanylinworksTextWeight) {
		new TrulanceOtherPages()
		.verifyUroguanylinworksText( UroguanylinworksText1, UroguanylinworksTextClr, UroguanylinworksTextFontFam, UroguanylinworksTextSize, UroguanylinworksTextWeight);
}
}
