package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14014_VerifyFontPropInHeroSec extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14014_VerifyFontPropInHeroSec";
		testDescription ="CR_TR_TOC_002_Verify the font properties of the body copy present in the hero section on the TYPES OF CONSTIPATION page of the Trulance DTC Website";
		authors="Ravichandran";
		category ="Regression";

		excelFileName="TC_14014"; sheetName="Sheet1";

	}

	@Test  (dataProvider = "fetchData") 
	public void runVerifyFontPropInHeroSec(String Header2FontFamily,String Header2Size,String Header2Clr,String Header2Weight,String BodyTxtWeight) {
		new TrulanceHomePage()
		.VerifyFontPropInHeroSec( Header2FontFamily, Header2Size, Header2Clr, Header2Weight,BodyTxtWeight);

}
}