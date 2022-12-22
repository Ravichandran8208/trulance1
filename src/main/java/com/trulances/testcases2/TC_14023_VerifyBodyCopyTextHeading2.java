package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14023_VerifyBodyCopyTextHeading2 extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14023_VerifyBodyCopyTextHeading2";
		testDescription ="CR_TRU_TOC_001_Verify the changes in TYPES OF CONSTIPATION page  on trulance website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_14023"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyBodyCopyTextHeading2 (String BodyCopyTextOfHeading2,String BodyCopyTextOfHeading2clr,String BodyCopyTextOfHeading2FontFam,String BodyCopyTextOfHeading2Size,String BodyCopyTextOfHeading2Weight,String BodyCopyTextOfHeading2Height) {
		
		new TrulanceOtherPages()
		.VerifyBodyCopyOfHeading2( BodyCopyTextOfHeading2)
		.VerifyBodyCopyPropertiesOfHeading2( BodyCopyTextOfHeading2clr, BodyCopyTextOfHeading2FontFam, BodyCopyTextOfHeading2Size, BodyCopyTextOfHeading2Weight, BodyCopyTextOfHeading2Height);
}
}
