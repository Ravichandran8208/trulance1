package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14034_VerifyCTAReduceButtonInTrulance extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14034_VerifyCTAReduceButtonInTrulance";
		testDescription ="CR_TRU_TR IBS_001_Verify the changes made on the trulance IBS-C page of the trulance website";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14034"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyBelowContentHeading3Identity(String reducepaintrulanceforibsc_CTAText,String reducepaintrulanceforibsc_CTATextClr,String reducepaintrulanceforibsc_CTATextFontFam,String reducepaintrulanceforibsc_CTATextSize,String reducepaintrulanceforibsc_CTATextWeight) {
		new TrulanceOtherPages()
		.verifyRightSideCTACont( reducepaintrulanceforibsc_CTAText, reducepaintrulanceforibsc_CTATextClr, reducepaintrulanceforibsc_CTATextFontFam, reducepaintrulanceforibsc_CTATextSize, reducepaintrulanceforibsc_CTATextWeight);
	}
}
