package com.trulance.pages;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.TrulanceProjectSpecificMethods;

public class TrulanceOtherPages extends TrulanceProjectSpecificMethods{

	public TrulanceOtherPages VerifyBodyCopyOfHeading2(String BodyCopyTextOfHeading2) {
		click(locateElement(Locators.ID, "types-of-constipation-nav"));
		WebElement BodyCopyOfHeading2 = locateElement(Locators.XPATH, "//h2[text()='Constipation is common']/following-sibling::p");
		verifyExactText(BodyCopyOfHeading2, BodyCopyTextOfHeading2);

		return this;
	}
	public TrulanceOtherPages VerifyBodyCopyPropertiesOfHeading2(String BodyCopyTextOfHeading2clr,String BodyCopyTextOfHeading2FontFam,String BodyCopyTextOfHeading2Size,String BodyCopyTextOfHeading2Weight,String BodyCopyTextOfHeading2Height) {
		WebElement BodyCopyStrongTextsOfHeading2 = locateElement(Locators.XPATH, "//strong[text()=' irritable bowel syndrome with constipation (IBS-C) or chronic idiopathic constipation ']");
		verifytextBackgroundColor(BodyCopyStrongTextsOfHeading2, BodyCopyTextOfHeading2clr);
		verifytextFamily(BodyCopyStrongTextsOfHeading2, BodyCopyTextOfHeading2FontFam);
		verifytextSize(BodyCopyStrongTextsOfHeading2, BodyCopyTextOfHeading2Size);
		verifytextWeight(BodyCopyStrongTextsOfHeading2, BodyCopyTextOfHeading2Weight);
		verifytextLineHeight(BodyCopyStrongTextsOfHeading2, BodyCopyTextOfHeading2Height);

		return this;

	}
	public TrulanceOtherPages VerifyIBSCandCICButtonLocation() {
		WebElement typesofconstipationnav = locateElement(Locators.ID, "types-of-constipation-nav");
		click(typesofconstipationnav);
		WebElement IBSCButton = locateElement(Locators.XPATH, "//h1[text()='What is IBS-C?']");
		String IBSCMenu = IBSCButton.getText();
		Point location1 = IBSCButton.getLocation();
		System.out.println(location1);
		WebElement CICButton = locateElement(Locators.XPATH, "//h1[text()='What is CIC?']");
		String CICMenu = CICButton.getText();
		Point location2 = CICButton.getLocation();
		System.out.println(location2);
		if(location1.toString().equals("(204, 383)")) {
			reportStep(IBSCMenu+"is Displayed in left side", "pass");
		}
		if(location2.toString().equals("(774, 383)")) {
			reportStep(CICMenu+"is Displayed in Right Side", "pass");
		}
		return this;

	}
	public TrulanceOtherPages verifyTextofBodyCopyInIBSC(String BodyCopyText,String BodyCopyTextOfHeading2clr,String BodyCopyTextOfHeading2FontFam,String BodyCopyTextOfHeading2Size,String BodyCopyTextOfHeading2Weight,String BodyCopyTextOfHeading2Height) {
		click(locateElement(Locators.ID, "types-of-constipation-nav"));
		WebElement BodyCopyTextIBSCHeading = locateElement(Locators.XPATH, "//p[text()='Irritable Bowel Syndrome with Constipation, or IBS-C, is a condition where one experiences long periods of constipation accompanied by stomach pain and bloating.']");
		verifyExactText(BodyCopyTextIBSCHeading, BodyCopyText);
		verifytextBackgroundColor(BodyCopyTextIBSCHeading, BodyCopyTextOfHeading2clr);
		verifytextFamily(BodyCopyTextIBSCHeading, BodyCopyTextOfHeading2FontFam);
		verifytextSize(BodyCopyTextIBSCHeading, BodyCopyTextOfHeading2Size);
		verifytextWeight(BodyCopyTextIBSCHeading, BodyCopyTextOfHeading2Weight);
		verifytextLineHeight(BodyCopyTextIBSCHeading, BodyCopyTextOfHeading2Height);

		return this;
	}
	public TrulanceOtherPages verifyIBSCInfoBelowImg(String IBSCInfoTextBelowImg,String IBSCInfoTextBelowImgclr,String IBSCInfoTextBelowFontFam,String IBSCInfoTextBelowImgsize,String IBSCInfoTextBelowImgWeight,String IBSCInfoTextBelowImgHeight ) {
		click(locateElement(Locators.ID, "types-of-constipation-nav"));
		WebElement IBSCImg = locateElement(Locators.XPATH, "(//div[@class='info-graphic'])[2]");
		verifyDisplayed(IBSCImg);
		WebElement CICImg = locateElement(Locators.XPATH, "//p[text()='Prolonged periods of constipation without a known cause could be a condition called Chronic Idiopathic Constipation, or CIC.']/following-sibling::div");
		verifyDisplayed(CICImg);
		click(locateElement(Locators.ID, "types-of-constipation-nav"));
		WebElement IBSCInfoBelowImg = locateElement(Locators.XPATH, "//h2[text()='In addition to symptoms of CIC, patients with IBS-C also have stomach pain.']");
		verifyExactText(IBSCInfoBelowImg, IBSCInfoTextBelowImg);
		verifytextBackgroundColor(IBSCInfoBelowImg, IBSCInfoTextBelowImgclr);
		verifytextFamily(IBSCInfoBelowImg, IBSCInfoTextBelowFontFam);
		verifytextSize(IBSCInfoBelowImg, IBSCInfoTextBelowImgsize);
		verifytextWeight(IBSCInfoBelowImg, IBSCInfoTextBelowImgWeight);
		verifytextLineHeight(IBSCInfoBelowImg, IBSCInfoTextBelowImgHeight);

		return this;

	}
	public TrulanceOtherPages verifyBodyCopyInAboutTrulance(String BodyCopyInAboutTrulanceText,String BodyCopyInAboutTrulanceTextclr,String BodyCopyInAboutTrulanceTextFontFam,String BodyCopyInAboutTrulanceTextsize,String BodyCopyInAboutTrulanceTextWeight,String BodyCopyInAboutTrulanceStrongTextWeight) {
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		click(About_TrulanceMenu);
		WebElement BodyCopyInAboutTrulance = locateElement(Locators.XPATH, "//h1[text()='About Trulance']/following-sibling::p");
		verifyExactText(BodyCopyInAboutTrulance, BodyCopyInAboutTrulanceText);
		verifytextBackgroundColor(BodyCopyInAboutTrulance, BodyCopyInAboutTrulanceTextclr);
		verifytextFamily(BodyCopyInAboutTrulance, BodyCopyInAboutTrulanceTextFontFam);
		verifytextSize(BodyCopyInAboutTrulance, BodyCopyInAboutTrulanceTextsize);
		verifytextWeight(BodyCopyInAboutTrulance, BodyCopyInAboutTrulanceTextWeight);
		WebElement BodyCopyInAboutTrulanceStrongText = locateElement(Locators.XPATH, "//strong[text()='More regular, well formed bowel movements with less IBS-C related stomach pain and bloating*.']");
		verifytextWeight(BodyCopyInAboutTrulanceStrongText, BodyCopyInAboutTrulanceStrongTextWeight);

		return this;

	}
	public TrulanceOtherPages verifyAboutTrulanceHeader2BelowBodyCopy(String AboutTrulanceHeader2BelowBodyCopyText,String AboutTrulanceHeader2BelowBodyCopyTextclr,String AboutTrulanceHeader2BelowBodyCopyFontFam,String AboutTrulanceHeader2BelowBodyCopyTextsize,String AboutTrulanceHeader2BelowBodyCopyWeight,String AboutTrulanceHeader2BelowBodyCopyHeight){
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		click(About_TrulanceMenu);
		WebElement AboutTrulanceHeader2BelowBodyCopy = locateElement(Locators.XPATH, "//p[text()='Trulance is the first medication for IBS-C and ']");
		verifyExactText(AboutTrulanceHeader2BelowBodyCopy, AboutTrulanceHeader2BelowBodyCopyText);
		verifytextBackgroundColor(AboutTrulanceHeader2BelowBodyCopy, AboutTrulanceHeader2BelowBodyCopyTextclr);
		verifytextFamily(AboutTrulanceHeader2BelowBodyCopy, AboutTrulanceHeader2BelowBodyCopyFontFam);
		verifytextSize(AboutTrulanceHeader2BelowBodyCopy, AboutTrulanceHeader2BelowBodyCopyTextsize);
		verifytextWeight(AboutTrulanceHeader2BelowBodyCopy, AboutTrulanceHeader2BelowBodyCopyWeight);
		verifytextLineHeight(AboutTrulanceHeader2BelowBodyCopy, AboutTrulanceHeader2BelowBodyCopyHeight);
		return this;

	}
	public TrulanceOtherPages verifyWhyTrulanceHeader2BelowBodyCopy(String WhyTrulanceHeader2BelowBodyCopyText,String WhyTrulanceHeader2BelowBodyCopyTextclr,String WhyTrulanceHeader2BelowBodyCopyFontFam,String WhyTrulanceHeader2BelowBodyCopyTextsize,String WhyTrulanceHeader2BelowBodyCopyWeight,String WhyTrulanceHeader2BelowBodyCopyHeight){
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		click(About_TrulanceMenu);
		WebElement WhyTrulanceHeader2BelowBodyCopy = locateElement(Locators.XPATH, "//p[text()='Trulance is a prescription medicine used in adults to treat IBS-C or CIC. It can help provide more regular, well-formed bowel movements with less IBS-C related stomach pain and bloating.*']");
		verifyExactText(WhyTrulanceHeader2BelowBodyCopy, WhyTrulanceHeader2BelowBodyCopyText);
		verifytextBackgroundColor(WhyTrulanceHeader2BelowBodyCopy, WhyTrulanceHeader2BelowBodyCopyTextclr);
		verifytextFamily(WhyTrulanceHeader2BelowBodyCopy, WhyTrulanceHeader2BelowBodyCopyFontFam);
		verifytextSize(WhyTrulanceHeader2BelowBodyCopy, WhyTrulanceHeader2BelowBodyCopyTextsize);
		verifytextWeight(WhyTrulanceHeader2BelowBodyCopy, WhyTrulanceHeader2BelowBodyCopyWeight);
		verifytextLineHeight(WhyTrulanceHeader2BelowBodyCopy, WhyTrulanceHeader2BelowBodyCopyHeight);

		return this;

	}
	public TrulanceOtherPages verifyTakingTrulanceHeader2BelowBodyCopy(String TakingTrulanceHeader2BelowBodyCopyText,String TakingTrulanceHeader2BelowBodyCopyTextclr,String TakingTrulanceHeader2BelowBodyCopyFontFam,String TakingTrulanceHeader2BelowBodyCopyTextsize,String TakingTrulanceHeader2BelowBodyCopyWeight,String TakingTrulanceHeader2BelowBodyCopyHeight){
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		click(About_TrulanceMenu);
		WebElement TakingTrulanceHeader2BelowBodyCopy = locateElement(Locators.XPATH, "//p[text()='Simple dosing makes once-daily Trulance easy to take.']");
		scrollToElement(TakingTrulanceHeader2BelowBodyCopy);
		verifyExactText(TakingTrulanceHeader2BelowBodyCopy, TakingTrulanceHeader2BelowBodyCopyText);
		verifytextBackgroundColor(TakingTrulanceHeader2BelowBodyCopy, TakingTrulanceHeader2BelowBodyCopyTextclr);
		verifytextFamily(TakingTrulanceHeader2BelowBodyCopy, TakingTrulanceHeader2BelowBodyCopyFontFam);
		verifytextSize(TakingTrulanceHeader2BelowBodyCopy, TakingTrulanceHeader2BelowBodyCopyTextsize);
		verifytextWeight(TakingTrulanceHeader2BelowBodyCopy, TakingTrulanceHeader2BelowBodyCopyWeight);
		verifytextLineHeight(TakingTrulanceHeader2BelowBodyCopy, TakingTrulanceHeader2BelowBodyCopyHeight);


		return this;

	}
	public TrulanceOtherPages verifyTrulanceForCICHeader2BelowBodyCopy(String TrulanceForCICHeader2BelowBodyCopyText,String TrulanceForCICHeader2BelowBodyCopyTextclr,String TrulanceForCICHeader2BelowBodyCopyFontFam,String TrulanceForCICHeader2BelowBodyCopyTextsize,String TrulanceForCICHeader2BelowBodyCopyWeight,String TrulanceForCICHeader2BelowBodyCopyHeight){
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		click(About_TrulanceMenu);
		WebElement TrulanceForCIC_CTA = locateElement(Locators.XPATH, "(//a[@href='/about-trulance/efficacy-for-cic'])[2]");
		click(TrulanceForCIC_CTA);
		WebElement IBSCButton = locateElement(Locators.XPATH, "//a[text()='cic']/following-sibling::a");
		String IBSCMenu = IBSCButton.getText();
		Point location1 = IBSCButton.getLocation();
		System.out.println(location1);
		WebElement CICButton = locateElement(Locators.XPATH, "//div[contains(@class,'col-sm-12 col-md-12')]//a[1]");
		String CICMenu = CICButton.getText();
		Point location2 = CICButton.getLocation();
		System.out.println(location2);
		if(location1.toString().equals("(189, 168)")) {
			reportStep(IBSCMenu+"is Displayed in left side", "pass");
		}
		if(location2.toString().equals("(376, 168)")) {
			reportStep(CICMenu+"is Displayed in Right Side", "pass");
		}
		WebElement TrulanceForCICHeader2BelowBodyCopy = locateElement(Locators.XPATH, "//h2[text()='Trulance can help you find relief from the symptoms of your constipation']");
		scrollToElement(TrulanceForCICHeader2BelowBodyCopy);
		verifyExactText(TrulanceForCICHeader2BelowBodyCopy, TrulanceForCICHeader2BelowBodyCopyText);
		verifytextBackgroundColor(TrulanceForCICHeader2BelowBodyCopy, TrulanceForCICHeader2BelowBodyCopyTextclr);
		verifytextFamily(TrulanceForCICHeader2BelowBodyCopy, TrulanceForCICHeader2BelowBodyCopyFontFam);
		verifytextSize(TrulanceForCICHeader2BelowBodyCopy, TrulanceForCICHeader2BelowBodyCopyTextsize);
		verifytextWeight(TrulanceForCICHeader2BelowBodyCopy, TrulanceForCICHeader2BelowBodyCopyWeight);
		verifytextLineHeight(TrulanceForCICHeader2BelowBodyCopy, TrulanceForCICHeader2BelowBodyCopyHeight);

		return this;

	}
	public TrulanceOtherPages verifyBRISTOLSTOOLFORMSCALEAboveCont(String BodyCopyAboveBRISTOLText,String BodyCopyAboveBRISTOLTextClr,String BodyCopyAboveBRISTOLTextFontFam,String BodyCopyAboveBRISTOLTextSize,String BodyCopyAboveBRISTOLTextWeight,String BodyCopyAboveBRISTOLTextHeight,String BodyCopyAboveBRISTOLStrongTextWeight){
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		click(About_TrulanceMenu);
		WebElement TrulanceForCIC_CTA = locateElement(Locators.XPATH, "(//a[@href='/about-trulance/efficacy-for-cic'])[2]");
		click(TrulanceForCIC_CTA);
		WebElement BodyCopyAboveBRISTOL = locateElement(Locators.XPATH, "//div[@class='col-sm-12 col-md-12']//h2[1]");
		scrollToElement(BodyCopyAboveBRISTOL);
		verifyExactText(BodyCopyAboveBRISTOL, BodyCopyAboveBRISTOLText);
		verifytextBackgroundColor(BodyCopyAboveBRISTOL, BodyCopyAboveBRISTOLTextClr);
		verifytextFamily(BodyCopyAboveBRISTOL, BodyCopyAboveBRISTOLTextFontFam);
		verifytextSize(BodyCopyAboveBRISTOL, BodyCopyAboveBRISTOLTextSize);
		verifytextWeight(BodyCopyAboveBRISTOL, BodyCopyAboveBRISTOLTextWeight);
		verifytextLineHeight(BodyCopyAboveBRISTOL, BodyCopyAboveBRISTOLTextHeight);
		WebElement BodyCopyAboveBRISTOLStrongText = locateElement(Locators.XPATH, "//strong[text()=' “normal” (smooth, soft, sausage- or snake-shaped) bowel movements']");
		verifytextWeight(BodyCopyAboveBRISTOLStrongText, BodyCopyAboveBRISTOLStrongTextWeight);


		return this;

	}
	public TrulanceOtherPages verifyBelowContHeading3(String BelowContHeading3Text,String BelowContHeading3BodyCopyText,String BelowContHeading3BodyCopyClr,String BelowContHeading3BodyCopyFontFam,String BelowContHeading3BodyCopySize,String BelowContHeading3BodyCopyTextWeight,String BelowContHeading3BodyCopyTextHeight ,String BelowContHeading3BodyCopyli1Text,
			String BelowContHeading3BodyCopyLI1Clr,String BelowContHeading3BodyCopyLI1FontFam,String BelowContHeading3BodyCopyLI1Size,String BelowContHeading3BodyCopyLI1TextWeight,String BelowContHeading3BodyCopyLI1TextHeight,
			String BelowContHeading3BodyCopyli2Text,String BelowContHeading3BodyCopyLI2Clr,String BelowContHeading3BodyCopyLI2FontFam,String BelowContHeading3BodyCopyLI2Size,String BelowContHeading3BodyCopyLI2TextWeight,String BelowContHeading3BodyCopyLI2TextHeight){
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		click(About_TrulanceMenu);
		WebElement TrulanceForCIC_CTA = locateElement(Locators.XPATH, "(//a[@href='/about-trulance/efficacy-for-cic'])[2]");
		click(TrulanceForCIC_CTA);
		WebElement BodyCopyAboveBRISTOL = locateElement(Locators.XPATH, "//div[@class='col-sm-12 col-md-12']//h2[1]");
		scrollToElement(BodyCopyAboveBRISTOL);
		WebElement BelowContHeading3 = locateElement(Locators.XPATH, "//h2[text()='Identify your treatment goals with the Bristol Stool Form Scale']");
		verifyExactText(BelowContHeading3, BelowContHeading3Text);
		WebElement BelowContHeading3BodyCopy = locateElement(Locators.XPATH, "//p[text()='The Bristol Stool Form Scale is a visual representation of the 7 different types of bowel movements that you can have.']");
		verifyExactText(BelowContHeading3BodyCopy, BelowContHeading3BodyCopyText);
		verifytextBackgroundColor(BelowContHeading3BodyCopy, BelowContHeading3BodyCopyClr);
		verifytextFamily(BelowContHeading3BodyCopy, BelowContHeading3BodyCopyFontFam);
		verifytextSize(BelowContHeading3BodyCopy, BelowContHeading3BodyCopySize);
		verifytextWeight(BelowContHeading3BodyCopy, BelowContHeading3BodyCopyTextWeight);
		verifytextLineHeight(BelowContHeading3BodyCopy, BelowContHeading3BodyCopyTextHeight);
		WebElement BelowContHeading3BodyCopyLI1 = locateElement(Locators.XPATH, "//li[text()='Type 4 is considered a well-formed bowel movement—described as smooth, soft, sausage- or snake-shaped, and free of lumps or excess liquid']");
		verifyExactText(BelowContHeading3BodyCopyLI1, BelowContHeading3BodyCopyli1Text);
		verifytextBackgroundColor(BelowContHeading3BodyCopyLI1, BelowContHeading3BodyCopyLI1Clr);
		verifytextFamily(BelowContHeading3BodyCopyLI1, BelowContHeading3BodyCopyLI1FontFam);
		verifytextSize(BelowContHeading3BodyCopyLI1, BelowContHeading3BodyCopyLI1Size);
		verifytextWeight(BelowContHeading3BodyCopyLI1, BelowContHeading3BodyCopyLI1TextWeight);
		verifytextLineHeight(BelowContHeading3BodyCopyLI1, BelowContHeading3BodyCopyLI1TextHeight);
		WebElement BelowContHeading3BodyCopyLI2 = locateElement(Locators.XPATH, "//li[text()='Type 1 or 2 is often considered constipation, while Type 6 or 7 is often considered diarrhea']");
		verifyExactText(BelowContHeading3BodyCopyLI2, BelowContHeading3BodyCopyli2Text);
		verifytextBackgroundColor(BelowContHeading3BodyCopyLI2, BelowContHeading3BodyCopyLI2Clr);
		verifytextFamily(BelowContHeading3BodyCopyLI2, BelowContHeading3BodyCopyLI2FontFam);
		verifytextSize(BelowContHeading3BodyCopyLI2, BelowContHeading3BodyCopyLI2Size);
		verifytextWeight(BelowContHeading3BodyCopyLI2, BelowContHeading3BodyCopyLI2TextWeight);
		verifytextLineHeight(BelowContHeading3BodyCopyLI2, BelowContHeading3BodyCopyLI2TextHeight);
		return this;


	}
	public TrulanceOtherPages verifyRightSideCTACont(String reducepaintrulanceforibsc_CTAText,String reducepaintrulanceforibsc_CTATextClr,String reducepaintrulanceforibsc_CTATextFontFam,String reducepaintrulanceforibsc_CTATextSize,String reducepaintrulanceforibsc_CTATextWeight){
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		click(About_TrulanceMenu);
		WebElement TrulanceForIBSC_CTA = locateElement(Locators.ID, "for-ibsc-about-trulance");
		click(TrulanceForIBSC_CTA);
		WebElement reducepaintrulanceforibsc_CTA = locateElement(Locators.ID, "reduce-pain-trulance-for-ibsc");
		verifyDisplayed(reducepaintrulanceforibsc_CTA);
		verifyExactText(reducepaintrulanceforibsc_CTA, reducepaintrulanceforibsc_CTAText);
		verifytextBackgroundColor(reducepaintrulanceforibsc_CTA, reducepaintrulanceforibsc_CTATextClr);
		verifytextFamily(reducepaintrulanceforibsc_CTA, reducepaintrulanceforibsc_CTATextFontFam);
		verifytextSize(reducepaintrulanceforibsc_CTA, reducepaintrulanceforibsc_CTATextSize);
		verifytextWeight(reducepaintrulanceforibsc_CTA, reducepaintrulanceforibsc_CTATextWeight);


		return this;
	}
	public TrulanceOtherPages verifySubHeadOfTrulanceIBSC(String SubHeadOfTrulanceIBSCText,String SubHeadOfTrulanceIBSCTextClr,String SubHeadOfTrulanceIBSCFontFam,String SubHeadOfTrulanceIBSCTextSize,String SubHeadOfTrulanceIBSCTextWeight){
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		click(About_TrulanceMenu);
		WebElement TrulanceForIBSC_CTA = locateElement(Locators.ID, "for-ibsc-about-trulance");
		click(TrulanceForIBSC_CTA);
		WebElement SubHeadOfTrulanceIBSC = locateElement(Locators.XPATH, "//div[@class='anchor-heading']//h2[1]");
		verifyExactText(SubHeadOfTrulanceIBSC, SubHeadOfTrulanceIBSCText);
		verifytextBackgroundColor(SubHeadOfTrulanceIBSC, SubHeadOfTrulanceIBSCTextClr);
		verifytextFamily(SubHeadOfTrulanceIBSC, SubHeadOfTrulanceIBSCFontFam);
		verifytextSize(SubHeadOfTrulanceIBSC, SubHeadOfTrulanceIBSCTextSize);
		verifytextWeight(SubHeadOfTrulanceIBSC, SubHeadOfTrulanceIBSCTextWeight);


		return this;

	}
	public TrulanceOtherPages verifyTrulanceHelpedPeopleTrulanceIBSC(String TrulanceHelpedPeopleHeadText1,String TrulanceHelpedPeopleHeadTextClr,String TrulanceHelpedPeopleHeadTextFontFam,String TrulanceHelpedPeopleHeadTextSize,String TrulanceHelpedPeopleHeadTextWeight,String StrongTrulanceHelpedPeopleHeadTextWeight){
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		click(About_TrulanceMenu);
		WebElement TrulanceForIBSC_CTA = locateElement(Locators.ID, "for-ibsc-about-trulance");
		click(TrulanceForIBSC_CTA);
		WebElement TrulanceHelpedPeopleHeadText = locateElement(Locators.XPATH, "//div[@class='text']//h2");
		scrollToElement(TrulanceHelpedPeopleHeadText);
		verifyExactText(TrulanceHelpedPeopleHeadText, TrulanceHelpedPeopleHeadText1);
		verifytextBackgroundColor(TrulanceHelpedPeopleHeadText, TrulanceHelpedPeopleHeadTextClr);
		verifytextFamily(TrulanceHelpedPeopleHeadText, TrulanceHelpedPeopleHeadTextFontFam);
		verifytextSize(TrulanceHelpedPeopleHeadText, TrulanceHelpedPeopleHeadTextSize);
		verifytextWeight(TrulanceHelpedPeopleHeadText, TrulanceHelpedPeopleHeadTextWeight);
		WebElement StrongTrulanceHelpedPeopleHeadText = locateElement(Locators.XPATH, "//strong[text()='people with IBS-C have LESS stomach pain and bloating']");
		verifytextWeight(StrongTrulanceHelpedPeopleHeadText, StrongTrulanceHelpedPeopleHeadTextWeight);


		return this;

	}
	public TrulanceOtherPages verifySubHeadingLetterMORE(String MoreText,String LetterMORETextClr,String LetterMORETextFontFam,String LetterMORETextSize,String LetterMORETextWeight){
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		click(About_TrulanceMenu);
		WebElement TrulanceForIBSC_CTA = locateElement(Locators.ID, "for-ibsc-about-trulance");
		click(TrulanceForIBSC_CTA);
		WebElement LetterMORE = locateElement(Locators.XPATH, "//strong[contains(.,'MORE regular,well-formed bowel movements')]");
		scrollToElement(LetterMORE);
		verifyExactText(LetterMORE, MoreText);
		verifytextBackgroundColor(LetterMORE, LetterMORETextClr);
		verifytextFamily(LetterMORE, LetterMORETextFontFam);
		verifytextSize(LetterMORE, LetterMORETextSize);
		verifytextWeight(LetterMORE, LetterMORETextWeight);

		return this;

	}
	public TrulanceOtherPages verifyHowitsWorksSubMenu(String Head1BodyCopyText,String Head1BodyCopyextClr,String Head1BodyCopyFontFam,String Head1BodyCopyTextSize,String Head1BodyCopyTextWeight){
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		moveToElement(About_TrulanceMenu);
		WebElement howtrulanceworksMenu = locateElement(Locators.ID, "how-trulance-works-nav");
		click(howtrulanceworksMenu);
		WebElement Head1BodyCopy = locateElement(Locators.XPATH, "//p[text()='Trulance is the first medication for irritable bowel syndrome with constipation (IBS-C) and chronic idiopathic constipation (CIC) that’s designed to work like a natural peptide in your body called uroguanylin (pronounced “yur-oh-gwah-nih-lin”). To best understand how uroguanylin works, let’s take a closer look at what happens in your body during the process of digestion.']");
		verifyExactText(Head1BodyCopy, Head1BodyCopyText);
		verifytextBackgroundColor(Head1BodyCopy, Head1BodyCopyextClr);
		verifytextFamily(Head1BodyCopy, Head1BodyCopyFontFam);
		verifytextSize(Head1BodyCopy, Head1BodyCopyTextSize);
		verifytextWeight(Head1BodyCopy, Head1BodyCopyTextWeight);



		return this;

	}
	public TrulanceOtherPages verifyUroguanylinworksText(String UroguanylinworksText1,String UroguanylinworksTextClr,String UroguanylinworksTextFontFam,String UroguanylinworksTextSize,String UroguanylinworksTextWeight){
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		moveToElement(About_TrulanceMenu);
		WebElement howtrulanceworksMenu = locateElement(Locators.ID, "how-trulance-works-nav");
		click(howtrulanceworksMenu);
		WebElement UroguanylinworksText = locateElement(Locators.XPATH, "//li[text()='Uroguanylin works best in the small intestine, where—based on the changing pH levels—it provides the right amount of fluid to create well-formed stool*']");
		verifyExactText(UroguanylinworksText, UroguanylinworksText1);
		verifytextBackgroundColor(UroguanylinworksText, UroguanylinworksTextClr);
		verifytextFamily(UroguanylinworksText,UroguanylinworksTextFontFam);
		verifytextSize(UroguanylinworksText, UroguanylinworksTextSize);
		verifytextWeight(UroguanylinworksText, UroguanylinworksTextWeight);
		return this;

	}
	public TrulanceOtherPages verifyUroguanylinworks5Text(String Uroguanylinworks5TEXT1,String Uroguanylinworks5TextClr,String Uroguanylinworks5tFontFam,String Uroguanylinworks5TextSize,String Uroguanylinworks5TextWeight){
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		moveToElement(About_TrulanceMenu);
		WebElement howtrulanceworksMenu = locateElement(Locators.ID, "how-trulance-works-nav");
		click(howtrulanceworksMenu);
		WebElement Uroguanylinworks5Text = locateElement(Locators.XPATH, "//div[@id='ContentPane']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ol[1]/li[5]");
		verifyExactText(Uroguanylinworks5Text, Uroguanylinworks5TEXT1);
		verifytextBackgroundColor(Uroguanylinworks5Text, Uroguanylinworks5TextClr);
		verifytextFamily(Uroguanylinworks5Text,Uroguanylinworks5tFontFam);
		verifytextSize(Uroguanylinworks5Text, Uroguanylinworks5TextSize);
		verifytextWeight(Uroguanylinworks5Text, Uroguanylinworks5TextWeight);
		return this;

	}
	public TrulanceOtherPages verifyTalkingTrulancePage(String LiTextKeepTrulanceClr,String LiTextKeepTrulanceFontFam,String LiTextKeepTrulanceTextSize,String LiTextKeepTrulanceTextWeight){
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		moveToElement(About_TrulanceMenu);
		WebElement TalkingTrulanceMenu = locateElement(Locators.ID, "taking-trulance-nav");
		click(TalkingTrulanceMenu);
		WebElement QuestionNo4 = locateElement(Locators.XPATH, "//a[@href='#collapseFour']//div[1]");
		scrollToElement(QuestionNo4);
		click(QuestionNo4);
		WebElement LiTextKeepTrulanceChanges = locateElement(Locators.XPATH, "//div[@id=\"collapseFour\"]/div/ol/li[2]");
		System.out.println(LiTextKeepTrulanceChanges.getText());
		//		verifyExactText(LiTextKeepTrulanceChanges, LiTextKeepTrulanceText);
		verifytextBackgroundColor(LiTextKeepTrulanceChanges, LiTextKeepTrulanceClr);
		verifytextFamily(LiTextKeepTrulanceChanges,LiTextKeepTrulanceFontFam);
		verifytextSize(LiTextKeepTrulanceChanges, LiTextKeepTrulanceTextSize);
		verifytextWeight(LiTextKeepTrulanceChanges, LiTextKeepTrulanceTextWeight);

		return this;

	}
	public TrulanceOtherPages verifyCommonSideEffectsTextPage(String BodyCopyofHeading1Text,String BodyCopyofHeading1Clr,String BodyCopyofHeading1FontFam,String BodyCopyofHeading1TextSize,String BodyCopyofHeading1TextWeight){
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		moveToElement(About_TrulanceMenu);
		WebElement CommonSideEffectsMenu = locateElement(Locators.ID, "common-side-effects-nav");
		click(CommonSideEffectsMenu);
		WebElement BodyCopyofHeading1 = locateElement(Locators.XPATH, "//p[text()='Tell your doctor if you experience any side effects while taking Trulance. In clinical studies, 4.3% of people with irritable bowel syndrome with constipation (IBS-C) and 5% of people with chronic idiopathic constipation (CIC) taking Trulance experienced diarrhea versus 1% in placebo (sugar pill) group.']");
		verifyExactText(BodyCopyofHeading1, BodyCopyofHeading1Text);
		verifytextBackgroundColor(BodyCopyofHeading1, BodyCopyofHeading1Clr);
		verifytextFamily(BodyCopyofHeading1,BodyCopyofHeading1FontFam);
		verifytextSize(BodyCopyofHeading1, BodyCopyofHeading1TextSize);
		verifytextWeight(BodyCopyofHeading1, BodyCopyofHeading1TextWeight);


		return this;
	}
	public TrulanceOtherPages verifypatientstoriespage(String BodyCopyofHeading1Text,String BodyCopyofHeading1Clr,String BodyCopyofHeading1FontFam,String BodyCopyofHeading1TextSize,String BodyCopyofHeading1TextWeight){
		WebElement PatientStories = locateElement(Locators.ID, "patient-stories-nav");
		click(PatientStories);
		WebElement PatientStoriesBodyCopy = locateElement(Locators.XPATH, "//h1[text()='Patient stories']/following-sibling::p");
		verifyExactText(PatientStoriesBodyCopy, BodyCopyofHeading1Text);
		verifytextBackgroundColor(PatientStoriesBodyCopy, BodyCopyofHeading1Clr);
		verifytextFamily(PatientStoriesBodyCopy,BodyCopyofHeading1FontFam);
		verifytextSize(PatientStoriesBodyCopy, BodyCopyofHeading1TextSize);
		verifytextWeight(PatientStoriesBodyCopy, BodyCopyofHeading1TextWeight);
		WebElement StaceysIBSC = locateElement(Locators.XPATH, "//div[@class='col-md-6 patient-2']//h3[1]");
		String IBSCMenu = StaceysIBSC.getText();
		Point location1 = StaceysIBSC.getLocation();
		System.out.println(location1);
		WebElement StephaniesCIC = locateElement(Locators.XPATH, "//div[@class='col-md-6 patient-1']//h3[1]");
		String CICMenu = StephaniesCIC.getText();
		Point location2 = StephaniesCIC.getLocation();
		System.out.println(location2);
		if(location1.toString().equals("(189, 388)")) {
			reportStep(IBSCMenu+"is Displayed in left side", "pass");
		}
		if(location2.toString().equals("(774, 388)")) {
			reportStep(CICMenu+"is Displayed in Right Side", "pass");
		}

		return this;

	}
	public TrulanceOtherPages verifydoctordiscussionguidepageBody(String BodyCopyofHeading1Text,String BodyCopyofHeading1Clr,String BodyCopyofHeading1FontFam,String BodyCopyofHeading1TextSize,String BodyCopyofHeading1TextWeight){
		WebElement DoctorDiscussionGuidepage = locateElement(Locators.ID, "doctor-discussion-guide-nav");
		click(DoctorDiscussionGuidepage);
		WebElement BodyCopyOfHeading1 = locateElement(Locators.XPATH, "//p[text()='Talking to your doctor is an important first step to managing your IBS-C or CIC. Asking the right questions about constipation can help you and your doctor get closer to finding a treatment plan that works for you. Getting ready for that conversation is as easy as ']");
		verifyExactText(BodyCopyOfHeading1, BodyCopyofHeading1Text);
		verifytextBackgroundColor(BodyCopyOfHeading1, BodyCopyofHeading1Clr);
		verifytextFamily(BodyCopyOfHeading1,BodyCopyofHeading1FontFam);
		verifytextSize(BodyCopyOfHeading1, BodyCopyofHeading1TextSize);
		verifytextWeight(BodyCopyOfHeading1, BodyCopyofHeading1TextWeight);
		return this;

	}
	public TrulanceOtherPages verifydoctordiscussionguideStomachPainText(String StomachPainTextClr,String StomachPainTextFontFam,String StomachPainTextSize,String StomachPainTextWeight){
		WebElement DoctorDiscussionGuidepage = locateElement(Locators.ID, "doctor-discussion-guide-nav");
		click(DoctorDiscussionGuidepage);
		WebElement AnchorToQuestionPage= locateElement(Locators.ID, "btn-start");
		click(AnchorToQuestionPage);
		WebElement StomachPainText= locateElement(Locators.XPATH, "//span[text()='Stomach pain']");
//		verifyExactText(StomachPainText, StomachPainText1);
		verifytextBackgroundColor(StomachPainText, StomachPainTextClr);
		verifytextFamily(StomachPainText,StomachPainTextFontFam);
		verifytextSize(StomachPainText, StomachPainTextSize);
		verifytextWeight(StomachPainText, StomachPainTextWeight);


		return this;

	}
	public TrulanceOtherPages verifydoctordiscussionguideLessStomachPainText(String LessStomachPainTextClr,String LessStomachPainTextFontFam,String LessStomachPainTextSize,String LessStomachPainTextWeight){
		WebElement DoctorDiscussionGuidepage = locateElement(Locators.ID, "doctor-discussion-guide-nav");
		click(DoctorDiscussionGuidepage);
		WebElement AnchorToQuestionPage= locateElement(Locators.ID, "btn-start");
		click(AnchorToQuestionPage);
		WebElement LessStomachPainText= locateElement(Locators.XPATH, "//span[text()='Less stomach pain']");
		scrollToElement(LessStomachPainText);
//		verifyExactText(LessStomachPainText, LessStomachPainText1);
		verifytextBackgroundColor(LessStomachPainText, LessStomachPainTextClr);
		verifytextFamily(LessStomachPainText,LessStomachPainTextFontFam);
		verifytextSize(LessStomachPainText, LessStomachPainTextSize);
		verifytextWeight(LessStomachPainText, LessStomachPainTextWeight);
		
		return this;

	}
}
