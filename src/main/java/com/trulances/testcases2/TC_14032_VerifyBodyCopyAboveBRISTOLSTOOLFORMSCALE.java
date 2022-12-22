package com.trulances.testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceOtherPages;

public class TC_14032_VerifyBodyCopyAboveBRISTOLSTOOLFORMSCALE extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14032_VerifyBodyCopyAboveBRISTOLSTOOLFORMSCALE";
		testDescription ="CR_TRU_TFC_003_Verify the changes in the submenu Trulance for CIC in ABOUT TRULANCE page on trulance site";
		authors="Ravichandran";
		category ="Regression";
		
		 excelFileName="TC_14032"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifyBodyCopyAboveBRISTOLSTOOLFORMSCALE(String BodyCopyAboveBRISTOLText,String BodyCopyAboveBRISTOLTextClr,String BodyCopyAboveBRISTOLTextFontFam,String BodyCopyAboveBRISTOLTextSize,String BodyCopyAboveBRISTOLTextWeight,String BodyCopyAboveBRISTOLTextHeight,String BodyCopyAboveBRISTOLStrongTextWeight) {
		
		new TrulanceOtherPages()
		.verifyBRISTOLSTOOLFORMSCALEAboveCont(  BodyCopyAboveBRISTOLText, BodyCopyAboveBRISTOLTextClr, BodyCopyAboveBRISTOLTextFontFam, BodyCopyAboveBRISTOLTextSize, BodyCopyAboveBRISTOLTextWeight, BodyCopyAboveBRISTOLTextHeight, BodyCopyAboveBRISTOLStrongTextWeight);

}
}
