package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14025_VerifyBodyCopyTextPropInIBSCBelow extends TrulanceProjectSpecificMethods{
@BeforeTest
public void setValues() {
	testcaseName = "TC_14025_VerifyBodyCopyTextPropInIBSCBelow";
	testDescription ="CR_TRU_TOC_004_Verify the changes in TYPES OF CONSTIPATION page  on trulance website";
	authors="Ravichandran";
	category ="Regression";
	
	 excelFileName="TC_14025"; sheetName="Sheet1"; 
	 
}

@Test  (dataProvider = "fetchData")
	public void runVerifyBodyCopyTextPropInIBSCBelow (String BodyCopyText,String BodyCopyTextOfHeading2clr,String BodyCopyTextOfHeading2FontFam,String BodyCopyTextOfHeading2Size,String BodyCopyTextOfHeading2Weight,String BodyCopyTextOfHeading2Height) {
	
	new TrulanceOtherPages()
	.verifyTextofBodyCopyInIBSC( BodyCopyText, BodyCopyTextOfHeading2clr, BodyCopyTextOfHeading2FontFam, BodyCopyTextOfHeading2Size, BodyCopyTextOfHeading2Weight, BodyCopyTextOfHeading2Height);

}
}
