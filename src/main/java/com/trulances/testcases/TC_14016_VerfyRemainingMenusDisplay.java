package com.trulances.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TrulanceProjectSpecificMethods;
import com.trulance.pages.TrulanceHomePage;

public class TC_14016_VerfyRemainingMenusDisplay extends TrulanceProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_14016_VerfyRemainingMenusDisplay";
		testDescription ="CR_TR_HP_006_Verify the remaining section present on the Home page are displayed as per the existing live site";
		authors="Ravichandran";
		category ="Regression";

		/* excelFileName="TC_14014"; sheetName="Sheet1"; */

	}

	@Test  /*(dataProvider = "fetchData") */
	public void runVerfyRemainingMenusDisplay() {
		new TrulanceHomePage()
		.VerifyRemainingSectionmenus();

}
}
