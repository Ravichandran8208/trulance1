package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14033_VerifyBelowContentHeading3Identity extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14033_VerifyBelowContentHeading3Identity";
		testDescription ="CR_TRU_TFC_006_Verify the changes in the submenu Trulance for CIC in ABOUT TRULANCE page on trulance site";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14033"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyBelowContentHeading3Identity(String BelowContHeading3Text,String BelowContHeading3BodyCopyText,String BelowContHeading3BodyCopyClr,String BelowContHeading3BodyCopyFontFam,String BelowContHeading3BodyCopySize,String BelowContHeading3BodyCopyTextWeight,String BelowContHeading3BodyCopyTextHeight ,String BelowContHeading3BodyCopyli1Text,
				String BelowContHeading3BodyCopyLI1Clr,String BelowContHeading3BodyCopyLI1FontFam,String BelowContHeading3BodyCopyLI1Size,String BelowContHeading3BodyCopyLI1TextWeight,String BelowContHeading3BodyCopyLI1TextHeight,
				String BelowContHeading3BodyCopyli2Text,String BelowContHeading3BodyCopyLI2Clr,String BelowContHeading3BodyCopyLI2FontFam,String BelowContHeading3BodyCopyLI2Size,String BelowContHeading3BodyCopyLI2TextWeight,String BelowContHeading3BodyCopyLI2TextHeight) {
		
		new TrulanceOtherPages()
		.verifyBelowContHeading3( BelowContHeading3Text, BelowContHeading3BodyCopyText, BelowContHeading3BodyCopyClr, BelowContHeading3BodyCopyFontFam, BelowContHeading3BodyCopySize, BelowContHeading3BodyCopyTextWeight, BelowContHeading3BodyCopyTextHeight , BelowContHeading3BodyCopyli1Text,
				 BelowContHeading3BodyCopyLI1Clr, BelowContHeading3BodyCopyLI1FontFam, BelowContHeading3BodyCopyLI1Size, BelowContHeading3BodyCopyLI1TextWeight, BelowContHeading3BodyCopyLI1TextHeight,
				 BelowContHeading3BodyCopyli2Text, BelowContHeading3BodyCopyLI2Clr, BelowContHeading3BodyCopyLI2FontFam, BelowContHeading3BodyCopyLI2Size, BelowContHeading3BodyCopyLI2TextWeight, BelowContHeading3BodyCopyLI2TextHeight);
}
}
