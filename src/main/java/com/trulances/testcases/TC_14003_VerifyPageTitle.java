package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14003_VerifyPageTitle extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14003_VerifyPageTitle";
		testDescription ="CR_TR_GH_002_Very the changes made on the alt tag of the Trulance logo present in the Global Header of the Trulance DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_14003"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyPageTitle (String Title,String TitleDescription,String AltContent) {
		
		new TrulanceHomePage()
		.VerifyMetaTitle(Title,TitleDescription,AltContent);

}
}
