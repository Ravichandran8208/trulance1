package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14043_VerifyPatientStoriesPageBody extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14043_VerifyPatientStoriesPageBody";
		testDescription ="CR_TRU_PS_001_Verify the font properties on the section 1 of the body text of the  patient stories page of the trulance website";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14043"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyPatientStoriesPageBody(String BodyCopyofHeading1Text,String BodyCopyofHeading1Clr,String BodyCopyofHeading1FontFam,String BodyCopyofHeading1TextSize,String BodyCopyofHeading1TextWeight) {
		new TrulanceOtherPages()
		.verifypatientstoriespage( BodyCopyofHeading1Text, BodyCopyofHeading1Clr, BodyCopyofHeading1FontFam, BodyCopyofHeading1TextSize, BodyCopyofHeading1TextWeight);

}
}
