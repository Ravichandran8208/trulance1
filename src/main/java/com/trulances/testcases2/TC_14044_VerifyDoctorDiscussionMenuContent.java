package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14044_VerifyDoctorDiscussionMenuContent extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14044_VerifyDoctorDiscussionMenuContent";
		testDescription ="CR_TRU_DDG_001_Verify the font properties on the section1 of the body text of the doctor discussion guide page of the trulance website";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14044"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyPatientStoriesPageBody(String BodyCopyofHeading1Text,String BodyCopyofHeading1Clr,String BodyCopyofHeading1FontFam,String BodyCopyofHeading1TextSize,String BodyCopyofHeading1TextWeight) {
		new TrulanceOtherPages()
		.verifydoctordiscussionguidepageBody( BodyCopyofHeading1Text, BodyCopyofHeading1Clr, BodyCopyofHeading1FontFam, BodyCopyofHeading1TextSize, BodyCopyofHeading1TextWeight);

}
}