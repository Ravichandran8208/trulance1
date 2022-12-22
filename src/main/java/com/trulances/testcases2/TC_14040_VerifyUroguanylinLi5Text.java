package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14040_VerifyUroguanylinLi5Text extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14040_VerifyUroguanylinLi5Text";
		testDescription ="CR_TRU_HTW_001_Verify the font properties on the section 1 of the body text on the  how trulance works page of the trulance website";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14040"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyUroguanylinLi5Text(String Uroguanylinworks5TEXT1,String Uroguanylinworks5TextClr,String Uroguanylinworks5tFontFam,String Uroguanylinworks5TextSize,String Uroguanylinworks5TextWeight) {
		new TrulanceOtherPages()
		.verifyUroguanylinworks5Text( Uroguanylinworks5TEXT1, Uroguanylinworks5TextClr, Uroguanylinworks5tFontFam, Uroguanylinworks5TextSize, Uroguanylinworks5TextWeight);
}
}
