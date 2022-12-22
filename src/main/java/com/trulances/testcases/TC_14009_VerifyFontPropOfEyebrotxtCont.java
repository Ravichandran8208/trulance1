package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14009_VerifyFontPropOfEyebrotxtCont extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14009_VerifyFontPropOfEyebrotxtCont";
		testDescription ="CR_TR_HP_002_Verify the font properties of the content present in section 1 of the Home page of the Trulance DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_14009"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyFontPropOfEyebrotxtCont (String EyeBroTextFontFamily,String EyeBroTextSize,String EyeBroTextClr,String EyeBroTextWeight) {
		
		new TrulanceHomePage()
		.VerifyEyeBroTextFontProp( EyeBroTextFontFamily, EyeBroTextSize, EyeBroTextClr, EyeBroTextWeight);

}
}
