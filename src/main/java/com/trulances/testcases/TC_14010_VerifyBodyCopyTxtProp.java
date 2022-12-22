package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14010_VerifyBodyCopyTxtProp extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14010_VerifyBodyCopyTxtProp";
		testDescription ="CR_TR_HP_002_Verify the font properties of the content present in section 1 of the Home page of the Trulance DTC Website";
		authors="Ravichandran";
		category ="Regression";

		excelFileName="TC_14010"; sheetName="Sheet1";

	}

	@Test  (dataProvider = "fetchData") 
	public void runVerifyBodyCopyTxtProp (String HeadcopyTextFontFamily,String HeadcopyTexttSize,String HeadcopyTextClr,String HeadcopyTextWeight,
			String copyTxt1FontFamily,String copyTxt1Size,String copyTxt1Clr,String copyTxt1Weight,
			String copyTxt2FontFamily,String copyTxt2Size,String copyTxt2Clr,String copyTxt2Weight,
			String copyTxt3FontFamily,String copyTxt3Size,String copyTxt3Clr,String copyTxt3Weight,String FootNoteFontFamily) {

		new TrulanceHomePage()
		.verifyBodyCopyTxtProp( HeadcopyTextFontFamily, HeadcopyTexttSize, HeadcopyTextClr, HeadcopyTextWeight,
				copyTxt1FontFamily, copyTxt1Size, copyTxt1Clr, copyTxt1Weight,
				copyTxt2FontFamily, copyTxt2Size, copyTxt2Clr, copyTxt2Weight,
				copyTxt3FontFamily, copyTxt3Size, copyTxt3Clr, copyTxt3Weight, FootNoteFontFamily);

	}
}
