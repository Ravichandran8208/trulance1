package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14020_VerifyAboutTrulanceHeadings extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14020_VerifyAboutTrulanceHeadings";
		testDescription ="CR_TR_AT_003_Verify the content changes made in the body copy of the ABOUT TRULANCE page of the Trulance DTC Website";
		authors="Ravichandran";
		category ="Regression";

		 excelFileName="TC_14020"; sheetName="Sheet1"; 

	}

	@Test  (dataProvider = "fetchData") 
	public void runVerifyAbout_TrulanceMenuContent(String WhyTrulanceHeadingTxt1,String WhyTrulanceBodyCopyTxtFontFamily,String WhyTrulanceBodyCopyTxtSize,String WhyTrulanceBodyCopyTxtClr,String WhyTrulanceBodyCopyTxtWeight,String TakingTrulanceHeadingTxt1,String TakingTrulanceBodyCopytxtFontFamily,String TakingTrulanceBodyCopytxtSize,String TakingTrulanceBodyCopytxtClr,String TakingTrulanceBodyCopytxtWeight,String HowItsWorksHeadingTxt1,String HowItsWorksBodyCopytxtFontFamily,String HowItsWorksBodyCopytxtSize,String HowItsWorksBodyCopytxtClr,String HowItsWorksBodyCopytxtWeight) {
		new TrulanceHomePage()
		.VerifyWhyTrulanceHeading( WhyTrulanceHeadingTxt1, WhyTrulanceBodyCopyTxtFontFamily, WhyTrulanceBodyCopyTxtSize, WhyTrulanceBodyCopyTxtClr, WhyTrulanceBodyCopyTxtWeight)
		.VerifyTakingTrulanceHeading( TakingTrulanceHeadingTxt1, TakingTrulanceBodyCopytxtFontFamily, TakingTrulanceBodyCopytxtSize, TakingTrulanceBodyCopytxtClr, TakingTrulanceBodyCopytxtWeight)
		.VerifyHowItsWorksHeading( HowItsWorksHeadingTxt1, HowItsWorksBodyCopytxtFontFamily, HowItsWorksBodyCopytxtSize, HowItsWorksBodyCopytxtClr, HowItsWorksBodyCopytxtWeight);

}
}
