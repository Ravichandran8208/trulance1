
package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;

import com.trulance.pages.TrulanceHomePage;

public class TC_14001_VerifyMainMenuDDChanges extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14001_VerifyMainMenuDDChanges";
		testDescription ="CR_TR_GH_001_Verify the changes made on the Global Header of the Trulance DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_14001"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyMainMenuDDChanges (String FirstDDinaboutTrulanceMenu1,String SecondDDinaboutTrulanceMenu1,String AltContent) {
		
		new TrulanceHomePage()
		.verifyMainMenuDDChanges(FirstDDinaboutTrulanceMenu1,SecondDDinaboutTrulanceMenu1,AltContent);

}
	

}
