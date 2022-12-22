package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14017_VerifyIBSCandCICColumnImg extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14017_VerifyIBSCandCICColumnImg";
		testDescription ="CR_TR_TOC_004_Verify the CIC and IBS-C columns art images are updated on the TYPES OF CONSTIPATION page of the Trulance DTC Website";
		authors="Ravichandran";
		category ="Regression";

		 excelFileName="TC_14017"; sheetName="Sheet1"; 

	}

	@Test  (dataProvider = "fetchData") 
	public void runVerifyIBSCandCICColumnImg(String IBS_CImgsrc,String CICImgsrc) {
		new TrulanceHomePage()
		.VerifyCICandIBS_CImg( IBS_CImgsrc, CICImgsrc);
	}
}
