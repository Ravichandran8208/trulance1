package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14006_VerifyBodyCopyText extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14006_VerifyBodyCopyText";
		testDescription ="Verify the BodyCopyText in Trulance Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_14006"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyBodyCopyText (String HeadcopyText1,String copyText1,String HeadCopyTextWeight,String copyText2,String copyText3,String FootNote1,String FootNote2txt,String FootNote2sup1) {
		
		new TrulanceHomePage()
		.VerifyBodyCopyTexts(HeadcopyText1,copyText1,HeadCopyTextWeight,copyText2,copyText3,FootNote1,FootNote2txt,FootNote2sup1);
}
}
