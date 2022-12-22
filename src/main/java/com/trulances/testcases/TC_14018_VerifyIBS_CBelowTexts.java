package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14018_VerifyIBS_CBelowTexts extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_17018_VerifyIBS_CBelowTexts";
		testDescription ="CR_TR_TOC_005_Verify the content changes made in the IBS-C column on the TYPES OF CONSTIPATION page of the Trulance DTC Website";
		authors="Ravichandran";
		category ="Regression";

		 excelFileName="TC_14018"; sheetName="Sheet1"; 

	}

	@Test  (dataProvider = "fetchData") 
	public void runVerifyIBS_CBelowTexts(String IBS_CColumnBodyCopytxt1,String BodyCopytFontFamily,String BodyCopytSize,String BodyCopytClr,String BodyCopytWeight,
			String HeadingBodyCopytxt1,String HeadingFontFamily,String HeadingBodyCopytSize,String HeadingBodyCopytClr,String HeadingBodyCopytWeight) {
		new TrulanceHomePage()
		.VerifyIBS_CColumnBodyCopytxt( IBS_CColumnBodyCopytxt1, BodyCopytFontFamily, BodyCopytSize, BodyCopytClr, BodyCopytWeight,
			 HeadingBodyCopytxt1, HeadingFontFamily, HeadingBodyCopytSize, HeadingBodyCopytClr, HeadingBodyCopytWeight);

}
}