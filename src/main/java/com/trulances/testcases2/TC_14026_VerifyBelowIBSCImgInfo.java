package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14026_VerifyBelowIBSCImgInfo extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14026_VerifyBelowIBSCImgInfo";
		testDescription ="CR_TRU_TOC_005_Verify the changes in TYPES OF CONSTIPATION page  on trulance website";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14026"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyBelowIBSCImgInfo (String IBSCInfoTextBelowImg,String IBSCInfoTextBelowImgclr,String IBSCInfoTextBelowFontFam,String IBSCInfoTextBelowImgsize,String IBSCInfoTextBelowImgWeight,String IBSCInfoTextBelowImgHeight ) {
		
		new TrulanceOtherPages()
		.verifyIBSCInfoBelowImg( IBSCInfoTextBelowImg, IBSCInfoTextBelowImgclr, IBSCInfoTextBelowFontFam, IBSCInfoTextBelowImgsize, IBSCInfoTextBelowImgWeight, IBSCInfoTextBelowImgHeight) ;

}
}
