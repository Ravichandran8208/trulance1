package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14007_VerifySubheadofHeader2 extends TrulanceProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14007_VerifySubheadofHeader2";
		testDescription ="Verify the Sub Heading Of Header 2 in Trulance Website";
		authors="Ravichandran";
		category ="Regression";
		
		excelFileName="TC_14007"; sheetName="Sheet1"; 
		 
	}

	@Test  (dataProvider = "fetchData")
		public void runVerifySubheadofHeader2 (String subHeadofHeader2Text,String CopyText1ofHeader2,String newurl1) {
		
		new TrulanceHomePage()
		.VerifyHeaderText2(subHeadofHeader2Text,CopyText1ofHeader2,newurl1);

}
}
