package com.trulance.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.base.TrulanceSeleniumBase;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.TrulanceProjectSpecificMethods;

public class TrulanceHomePage extends TrulanceProjectSpecificMethods {
	public TrulanceHomePage verifyMainMenuDDChanges(String FirstDDinaboutTrulanceMenu1,String SecondDDinaboutTrulanceMenu1,String AltContent) {
		WebElement aboutTrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		pause(2000);		
		moveToElement(aboutTrulanceMenu);
		pause(2000);
		WebElement FirstDDinaboutTrulanceMenu = locateElement(Locators.LINK_TEXT, "TRULANCE FOR CIC");
		verifyExactText(FirstDDinaboutTrulanceMenu, FirstDDinaboutTrulanceMenu1);
		WebElement SecondDDinaboutTrulanceMenu = locateElement(Locators.LINK_TEXT, "TRULANCE FOR IBS-C");
		verifyExactText(SecondDDinaboutTrulanceMenu, SecondDDinaboutTrulanceMenu1);
		verifylist("//div[@class='dropdown-menu']/ul",prop.getProperty("aboutTrulance1stMenu"),prop.getProperty("aboutTrulance2ndMenu"),prop.getProperty("aboutTrulance3rdMenu"),prop.getProperty("aboutTrulance4thMenu"),prop.getProperty("aboutTrulance5thMenu"));
		WebElement BrandLogo = locateElement(Locators.XPATH, "//img[@class='lazy']");
		verifyExactAttribute(BrandLogo, "alt", AltContent);




		return this;

	}
	public TrulanceHomePage verifyFooterTextContainsYear2020(String FooterParahText,String FooterFontFamily,String FooterTextClr,String FooterTextSize,String FooterTextWeight) {
		WebElement Footer = locateElement(Locators.XPATH, "//div[@class='footerWrap container']");
		pause(1000);
		scrollToElement(Footer);
		WebElement FooterParah = locateElement(Locators.XPATH, "//section[@id='colophon']//p[1]");
		click(FooterParah);
		pause(1000);
		verifyPartialText(FooterParah, FooterParahText);
		verifytextFamily(FooterParah, FooterFontFamily);
		verifytextBackgroundColor(FooterParah, FooterTextClr);
		verifytextSize(FooterParah, FooterTextSize);
		verifytextWeight(FooterParah, FooterTextWeight);

		return this;
	}
	public TrulanceHomePage VerifyMetaTitle(String Title,String TitleDescription,String AltContent) {
		verifyTitle(Title);
		WebElement MetaDesc = locateElement(Locators.XPATH, "//meta[@name='description']");
		verifyExactAttribute(MetaDesc,"content", TitleDescription);
		WebElement TrulanceLogo = locateElement(Locators.XPATH, "//img[@class='lazy']");
		verifyExactAttribute(TrulanceLogo,"alt",AltContent);
		return this;
	}
	public TrulanceHomePage VerifyEyeBroTextInHeroArea(String  EyeBroText,String AlignmentOfText,String EyeBroTextWeight ) {
		WebElement  EyeBroTextInHeroArea= locateElement(Locators.XPATH, "//p[text()='For adults with irritable bowel syndrome with constipation (IBS-C) or chronic idiopathic constipation (CIC)']");
		verifyExactText(EyeBroTextInHeroArea, EyeBroText);
		verifytextAlign(EyeBroTextInHeroArea, AlignmentOfText);
		verifytextWeight(EyeBroTextInHeroArea, EyeBroTextWeight);


		return this;

	}
	public TrulanceHomePage VerifyHeader1(String HeaderText) {
		WebElement  Header1= locateElement(Locators.XPATH, "(//img[@class='lazy'])[2]");
		verifyExactAttribute(Header1,"src",HeaderText );
		return this;


	}
	public TrulanceHomePage VerifyBodyCopyTexts(String HeadcopyText1,String copyText1,String HeadCopyTextWeight,String copyText2,String copyText3,String FootNote1,String FootNote2txt,String FootNote2sup1) {
		WebElement  HeadcopyText= locateElement(Locators.XPATH, "//span[text()='Trulance can help you have*:']");
		verifyExactText(HeadcopyText, HeadcopyText1);
		WebElement  copyTxt1= locateElement(Locators.XPATH, "//div[@class='Orangeborder']//li[1]");
		WebElement  copyTxt2= locateElement(Locators.XPATH, "//div[@class='Orangeborder']//li[2]");
		WebElement  copyTxt3= locateElement(Locators.XPATH, "//div[@class='Orangeborder']//li[3]");

		verifyExactText(copyTxt2, copyText1);
		verifyExactText(copyTxt1, copyText2);
		verifyExactText(copyTxt3, copyText3);
		verifytextWeight(HeadcopyText, HeadCopyTextWeight);
		
		WebElement FootNote = locateElement(Locators.XPATH, "//p[@class='footnote']");
		WebElement FootNote2 = locateElement(Locators.XPATH, "(//p[@class='footnote'])[2]");
		WebElement FootNote2sup = locateElement(Locators.XPATH, "//sup[text()='†']");

		verifyExactText(FootNote, FootNote1);
		verifyExactText(FootNote2, FootNote2txt);
		verifyExactText(FootNote2sup, FootNote2sup1);
		WebElement StampInHomePage = locateElement(Locators.XPATH, "(//img[@class='lazy'])[2]");
		verifyDisplayed(StampInHomePage);

		return this;
	}
	public TrulanceHomePage VerifyHeaderText2(String subHeadofHeader2Text,String CopyText1ofHeader2,String newurl1) {
		click(locateElement(Locators.ID, "types-of-constipation-nav"));
		WebElement subHeadofHeader2 = locateElement(Locators.CLASS_NAME, "alt");
		verifyExactText(subHeadofHeader2, subHeadofHeader2Text);
		WebElement CopyTextofHeader2 = locateElement(Locators.XPATH, "(//div[@class='col-md-12']//p)[2]");
		verifyExactText(CopyTextofHeader2, CopyText1ofHeader2);
		verifyUrl(newurl1);

		//		click(Header2);


		return this;

	}
	public TrulanceHomePage VerifyTypesofconstipationCopyTxt(String CopyTextinHeader1) {
		click(locateElement(Locators.ID, "types-of-constipation-nav"));
		WebElement TypesofconstipationCopyTxt1 = locateElement(Locators.XPATH, "(//div[@class='col-md-12 desc']//p)[3]");
		verifyExactText(TypesofconstipationCopyTxt1, CopyTextinHeader1);

		return this;

	}
	public TrulanceHomePage VerifyEyeBroTextFontProp(String EyeBroTextFontFamily,String EyeBroTextSize,String EyeBroTextClr,String EyeBroTextWeight) {
		WebElement  EyeBroTextInHeroArea= locateElement(Locators.XPATH, "//p[text()='For adults with irritable bowel syndrome with constipation (IBS-C) or chronic idiopathic constipation (CIC)']");
		verifytextFamily(EyeBroTextInHeroArea, EyeBroTextFontFamily);
		verifytextSize(EyeBroTextInHeroArea, EyeBroTextSize);
		verifytextBackgroundColor(EyeBroTextInHeroArea, EyeBroTextClr);
		verifytextWeight(EyeBroTextInHeroArea, EyeBroTextWeight);


		return this;

	}
	public TrulanceHomePage verifyBodyCopyTxtProp(String HeadcopyTextFontFamily,String HeadcopyTexttSize,String HeadcopyTextClr,String HeadcopyTextWeight,
			String copyTxt1FontFamily,String copyTxt1Size,String copyTxt1Clr,String copyTxt1Weight,
			String copyTxt2FontFamily,String copyTxt2Size,String copyTxt2Clr,String copyTxt2Weight,
			String copyTxt3FontFamily,String copyTxt3Size,String copyTxt3Clr,String copyTxt3Weight,
			String FootNoteFontFamily) {
		WebElement  HeadcopyText= locateElement(Locators.XPATH, "//div[@class='Orangeborder']//span[1]");
		verifytextFamily(HeadcopyText, HeadcopyTextFontFamily);
		verifytextSize(HeadcopyText, HeadcopyTexttSize);
		verifytextBackgroundColor(HeadcopyText, HeadcopyTextClr);
		verifytextWeight(HeadcopyText, HeadcopyTextWeight);
		WebElement  copyTxt1= locateElement(Locators.XPATH, "(//div[@class='Orangeborder']//li)[1]/strong");
		verifytextFamily(copyTxt1, copyTxt1FontFamily);
		verifytextSize(copyTxt1, copyTxt1Size);
		verifytextBackgroundColor(copyTxt1, copyTxt1Clr);
		verifytextWeight(copyTxt1, copyTxt1Weight);
		WebElement  copyTxt2= locateElement(Locators.XPATH, "(//div[@class='Orangeborder']//li)[2]/strong");
		verifytextFamily(copyTxt2, copyTxt2FontFamily);
		verifytextSize(copyTxt2, copyTxt2Size);
		verifytextBackgroundColor(copyTxt2, copyTxt2Clr);
		verifytextWeight(copyTxt2, copyTxt2Weight);
		WebElement  copyTxt3= locateElement(Locators.XPATH, "(//div[@class='Orangeborder']//li)[3]/strong");
		verifytextFamily(copyTxt3, copyTxt3FontFamily);
		verifytextSize(copyTxt3, copyTxt3Size);
		verifytextBackgroundColor(copyTxt3, copyTxt3Clr);
		verifytextWeight(copyTxt3, copyTxt3Weight);
		WebElement FootNote = locateElement(Locators.XPATH, "//p[@class='footnote']");
		verifytextFamily(FootNote, FootNoteFontFamily);

		return this;

	}
	public TrulanceHomePage Verifyfunctionalitylink_CTAsection1() {
		WebElement RecomondationEle = locateElement(Locators.XPATH, "//a[@href='#recomondation']");
		scrollToElement(RecomondationEle);
		pause(500);
		click(RecomondationEle);
		reportStep("By clicking the link, it should anchor to the below 'The American College of Gastroenterology..' heading section", "pass");
		WebElement TalkToDoctorMenu = locateElement(Locators.XPATH, "//a[contains(@class,'btn btn-default')]");
		scrollToElement(TalkToDoctorMenu);
		click(TalkToDoctorMenu); 
		click(Locators.XPATH, "(//a[contains(@class,'btn btn-lg')])[2]");
		switchToWindow("See if Trulance® may be right for you"); //pause(2000);
		verifyTitle("See if Trulance® may be right for you");
		close();
		switchToWindow(0);
		click(locateElement(Locators.XPATH, "(//a[@href='/savings/'])[2]"));
		switchToWindow("Trulance (plecanatide) DTC | IBS-C Treatment and CIC Treatment - NOT FOR COMMERCIAL USE");

		System.out.println("something went wrong ");
	
		verifyTitle("Trulance (plecanatide) DTC | IBS-C Treatment and CIC Treatment - NOT FOR COMMERCIAL USE");
		System.out.println("nothing");
		//		defaultContent();
		//		getDriver().navigate().back();
		//		switchToWindow(0);
		click(Locators.XPATH, "//img[@alt='Trulance (plecanatide) DTC | IBS-C Treatment and CIC Treatment']");
		click(Locators.XPATH, "//img[@class='float-icon lazy']");
		click(Locators.XPATH, "(//a[contains(@class,'btn btn-lg')])[2]");
		switchToWindow("See if Trulance® may be right for you");
		verifyTitle("See if Trulance® may be right for you");
		close();
		switchToWindow(0);
		WebElement DOCTORDISCUSSIONGUIDE = locateElement(Locators.XPATH, "//span[text()='DOCTOR DISCUSSION GUIDE']");
		pause(1000);
		scrollToElement(DOCTORDISCUSSIONGUIDE);
		click(DOCTORDISCUSSIONGUIDE);
		switchToWindow("Constipation: Questions to Ask | Trulance (plecanatide) - NOT FOR COMMERCIAL USE");
		verifyTitle("Constipation: Questions to Ask | Trulance (plecanatide) - NOT FOR COMMERCIAL USE");
		click(Locators.XPATH, "//img[@alt='Trulance (plecanatide) DTC | IBS-C Treatment and CIC Treatment']");
		WebElement savings_home = locateElement(Locators.ID, "savings-home");
		scrollToElement(savings_home);
		click(savings_home);
		switchToWindow("Constipation: Questions to Ask | Trulance (plecanatide)");
		verifyTitle("Trulance (plecanatide) DTC | IBS-C Treatment and CIC Treatment - NOT FOR COMMERCIAL USE");
		switchToWindow(0);







		return this;

	}
	public TrulanceHomePage Verify_alttag_ACGGUIDELINES_STAMPSec1(String AlttagStampImgSec1) {
		WebElement StampImgSec1 = locateElement(Locators.XPATH, "//img[@alt='Read the recommendation for Trulance']");
		scrollToElement(StampImgSec1);
		if(verifyExactAttribute(StampImgSec1, "alt", AlttagStampImgSec1)){
          reportStep(AlttagStampImgSec1+"is SucessFully Matched", "pass");
		}
		else {
	          reportStep("there is no alt tag", "fail");

		}

		return this;

	}
	public TrulanceHomePage Verify_LayoutSec1(String layout) {
		WebElement layoutDimension = locateElement(Locators.XPATH, "//div[@class='container bannerCaption']");
		verifyImgSize(layoutDimension, layout);

		return this;

	}
	public  TrulanceHomePage VerifyFontPropInHeroSec(String Header2FontFamily,String Header2Size,String Header2Clr,String Header2Weight,String BodyTxtWeight) {
		click(locateElement(Locators.ID, "types-of-constipation-nav"));
		WebElement Header2inHeroSec = locateElement(Locators.CLASS_NAME, "alt");
		verifytextFamily(Header2inHeroSec, Header2FontFamily);
		verifytextSize(Header2inHeroSec, Header2Size);
		verifytextBackgroundColor(Header2inHeroSec, Header2Clr);
		verifytextWeight(Header2inHeroSec, Header2Weight);
		WebElement BodyCpyOfHeroSec = locateElement(Locators.XPATH, "//strong[text()=' irritable bowel syndrome with constipation (IBS-C) or chronic idiopathic constipation ']");
		verifytextWeight(BodyCpyOfHeroSec, BodyTxtWeight);
		
		
		return this;

	}
	public TrulanceHomePage verifyCICandIBS_CColumns() {
		click(locateElement(Locators.ID, "types-of-constipation-nav"));
		WebElement columns1 = locateElement(Locators.XPATH, "//h1[text()='What is CIC?']");
		String CICMenu = columns1.getText();
		Point location1 = columns1.getLocation();
		System.out.println(location1);
		WebElement columns2 = locateElement(Locators.XPATH, "//h1[text()='What is IBS-C?']");
		String IBSCMenu = columns2.getText();
		Point location2 = columns2.getLocation();
		System.out.println(location2);
		if(location1.toString().equals("(204, 383)")) {
			reportStep(CICMenu+"is Displayed in Right Side", "pass");
		}
		if(location2.toString().equals("(774, 383)")) {
			reportStep(IBSCMenu+"is Displayed in leftside Side", "pass");
		}

		return this;

	}
	public TrulanceHomePage VerifyRemainingSectionmenus() {
		
		WebElement ImportantSafetyMenu   = locateElement(Locators.ID, "isi-scroll-to");
		verifyDisplayed(ImportantSafetyMenu);
		WebElement ForHealthcareMenu   = locateElement(Locators.ID, "hcp-link");
		verifyDisplayed(ForHealthcareMenu);
		WebElement TypesofconstipationMenu= locateElement(Locators.ID, "types-of-constipation-nav");
		verifyDisplayed(TypesofconstipationMenu);
		WebElement AboutTrulanceMenu= locateElement(Locators.ID, "about-trulance-nav");
		verifyDisplayed(AboutTrulanceMenu);
		WebElement PatientStoriesMenu= locateElement(Locators.ID, "patient-stories-nav");
		verifyDisplayed(PatientStoriesMenu);


		
		
		return this;

	}
	public TrulanceHomePage VerifyCICandIBS_CImg(String IBS_CImgsrc,String CICImgsrc) {
		click(locateElement(Locators.ID, "types-of-constipation-nav"));
		WebElement IBS_CImg = locateElement(Locators.XPATH, "//img[@src='/siteassets/img/other-156x344-ibsc-people.png']");
		WebElement CICImg = locateElement(Locators.XPATH, "//img[@src='/siteassets/img/other-134x441-cic-people.png']");
		verifyExactAttribute(IBS_CImg, "src", IBS_CImgsrc);
		verifyExactAttribute(CICImg, "src", CICImgsrc);
		verifyDisplayed(IBS_CImg);
		verifyDisplayed(CICImg);




		return this;

	}
	public TrulanceHomePage VerifyIBS_CColumnBodyCopytxt(String IBS_CColumnBodyCopytxt1,String BodyCopytFontFamily,String BodyCopytSize,String BodyCopytClr,String BodyCopytWeight,
			String HeadingBodyCopytxt1,String HeadingFontFamily,String HeadingBodyCopytSize,String HeadingBodyCopytClr,String HeadingBodyCopytWeight) {
		click(locateElement(Locators.ID, "types-of-constipation-nav"));
        WebElement IBS_CColumnBodyCopytxt = locateElement(Locators.XPATH, "//p[text()='Irritable Bowel Syndrome with Constipation, or IBS-C, is a condition where one experiences long periods of constipation accompanied by stomach pain and bloating.']");
        verifyExactText(IBS_CColumnBodyCopytxt, IBS_CColumnBodyCopytxt1);
        verifytextFamily(IBS_CColumnBodyCopytxt, BodyCopytFontFamily);
		verifytextSize(IBS_CColumnBodyCopytxt, BodyCopytSize);
		verifytextBackgroundColor(IBS_CColumnBodyCopytxt, BodyCopytClr);
		verifytextWeight(IBS_CColumnBodyCopytxt,BodyCopytWeight);
        WebElement HeadingBodyCopytxt = locateElement(Locators.XPATH, "//h2[text()='In addition to symptoms of CIC, patients with IBS-C also have stomach pain.']");
        verifyExactText(HeadingBodyCopytxt, HeadingBodyCopytxt1);
        verifytextFamily(HeadingBodyCopytxt, HeadingFontFamily);
		verifytextSize(HeadingBodyCopytxt, HeadingBodyCopytSize);
		verifytextBackgroundColor(HeadingBodyCopytxt, HeadingBodyCopytClr);
		verifytextWeight(HeadingBodyCopytxt,HeadingBodyCopytWeight);
		return this;

}

	public TrulanceHomePage VerifyAbout_TrulanceMenu(String BodyCopyTxtinAbout_TrulanceMenu1,String BodyCopyTxtinAbout_TrulanceMenuFontFamily,String BodyCopyTxtinAbout_TrulanceMenuSize,String BodyCopyTxtinAbout_TrulanceMenuClr,String BodyCopyTxtinAbout_TrulanceMenuWeight,String fontbelowBodyCopyWeight) {
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		click(About_TrulanceMenu);
		WebElement BodyCopyTxtinAbout_TrulanceMenu = locateElement(Locators.XPATH, "//div[@id='ContentPane']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]/span[1]");
		verifyExactText(BodyCopyTxtinAbout_TrulanceMenu, BodyCopyTxtinAbout_TrulanceMenu1);
		verifytextFamily(BodyCopyTxtinAbout_TrulanceMenu, BodyCopyTxtinAbout_TrulanceMenuFontFamily);
		verifytextSize(BodyCopyTxtinAbout_TrulanceMenu, BodyCopyTxtinAbout_TrulanceMenuSize);
		verifytextBackgroundColor(BodyCopyTxtinAbout_TrulanceMenu, BodyCopyTxtinAbout_TrulanceMenuClr);
		verifytextWeight(BodyCopyTxtinAbout_TrulanceMenu,BodyCopyTxtinAbout_TrulanceMenuWeight);
		WebElement fontbelowBodyCopy = locateElement(Locators.XPATH, "//strong[text()='More regular, well formed bowel movements with less IBS-C related stomach pain and bloating*.']");
		verifytextWeight(fontbelowBodyCopy,fontbelowBodyCopyWeight);

			return this;

}
	public TrulanceHomePage VerifyWhyTrulanceHeading(String WhyTrulanceHeadingTxt1,String WhyTrulanceBodyCopyTxtFontFamily,String WhyTrulanceBodyCopyTxtSize,String WhyTrulanceBodyCopyTxtClr,String WhyTrulanceBodyCopyTxtWeight) {
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		click(About_TrulanceMenu);
		WebElement WhyTrulanceHeadingTxt = locateElement(Locators.XPATH, "//h2[text()='Why Trulance?']");
		verifyExactText(WhyTrulanceHeadingTxt, WhyTrulanceHeadingTxt1);
		WebElement WhyTrulanceBodyCopyTxt = locateElement(Locators.XPATH, "//p[text()='Trulance is a prescription medicine used in adults to treat IBS-C or CIC. It can help provide more regular, well-formed bowel movements with less IBS-C related stomach pain and bloating.*']");
		verifytextFamily(WhyTrulanceBodyCopyTxt, WhyTrulanceBodyCopyTxtFontFamily);
		verifytextSize(WhyTrulanceBodyCopyTxt, WhyTrulanceBodyCopyTxtSize);
		verifytextBackgroundColor(WhyTrulanceBodyCopyTxt, WhyTrulanceBodyCopyTxtClr);
		verifytextWeight(WhyTrulanceBodyCopyTxt,WhyTrulanceBodyCopyTxtWeight);
		return this;

	}
	public TrulanceHomePage VerifyTakingTrulanceHeading(String TakingTrulanceHeadingTxt1,String TakingTrulanceBodyCopytxtFontFamily,String TakingTrulanceBodyCopytxtSize,String TakingTrulanceBodyCopytxtClr,String TakingTrulanceBodyCopytxtWeight) {
		WebElement TakingTrulanceHeadingTxt = locateElement(Locators.XPATH, "//h2[text()='Taking Trulance']");
		verifyExactText(TakingTrulanceHeadingTxt, TakingTrulanceHeadingTxt1);
		WebElement TakingTrulanceBodyCopyTxt = locateElement(Locators.XPATH, "//p[text()='Simple dosing makes once-daily Trulance easy to take.']");
		verifytextFamily(TakingTrulanceBodyCopyTxt, TakingTrulanceBodyCopytxtFontFamily);
		verifytextSize(TakingTrulanceBodyCopyTxt, TakingTrulanceBodyCopytxtSize);
		verifytextBackgroundColor(TakingTrulanceBodyCopyTxt, TakingTrulanceBodyCopytxtClr);
		verifytextWeight(TakingTrulanceBodyCopyTxt,TakingTrulanceBodyCopytxtWeight);

		return this;
	}
	public TrulanceHomePage VerifyHowItsWorksHeading(String HowItsWorksHeadingTxt1,String HowItsWorksBodyCopytxtFontFamily,String HowItsWorksBodyCopytxtSize,String HowItsWorksBodyCopytxtClr,String HowItsWorksBodyCopytxtWeight) {
		WebElement HowItsWorksHeadingTxt = locateElement(Locators.XPATH, "//h2[text()='How it works']");
		verifyExactText(HowItsWorksHeadingTxt, HowItsWorksHeadingTxt1);
		WebElement HowItsWorksBodyCopyTxt = locateElement(Locators.XPATH, "//p[text()='Trulance is the first medication for IBS-C and ']");
		verifytextFamily(HowItsWorksBodyCopyTxt, HowItsWorksBodyCopytxtFontFamily);
		verifytextSize(HowItsWorksBodyCopyTxt, HowItsWorksBodyCopytxtSize);
		verifytextBackgroundColor(HowItsWorksBodyCopyTxt, HowItsWorksBodyCopytxtClr);
		verifytextWeight(HowItsWorksBodyCopyTxt,HowItsWorksBodyCopytxtWeight);

		return this;

}
	public void VerifyIBSCandCICButtonLocation() {
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		click(About_TrulanceMenu);
		WebElement IBSCButton = locateElement(Locators.ID, "for-ibsc-about-trulance");
		String IBSCMenu = IBSCButton.getText();
		Point location1 = IBSCButton.getLocation();
		System.out.println(location1);
		WebElement CICButton = locateElement(Locators.ID, "for-cic-about-trulance");
		String CICMenu = CICButton.getText();
		Point location2 = CICButton.getLocation();
		System.out.println(location2);
		if(location1.toString().equals("(308, 467)")) {
			reportStep(IBSCMenu+"is Displayed in left side", "pass");
		}
		if(location2.toString().equals("(503, 467)")) {
			reportStep(CICMenu+"is Displayed in Right Side", "pass");
		}

	}
	public TrulanceHomePage VerifySubMenuOpenInSameTab(String TRULANCE_IBSCMenuTitle) {
		WebElement About_TrulanceMenu = locateElement(Locators.ID, "about-trulance-nav");
		moveToElement(About_TrulanceMenu);
		WebElement TRULANCE_IBSCMenu = locateElement(Locators.ID, "trulance-for-cic-nav");
		click(TRULANCE_IBSCMenu);
		verifyTitle(TRULANCE_IBSCMenuTitle);
		reportStep(TRULANCE_IBSCMenuTitle+"matched to the current tab title so its opened in same window", "pass");
		
		return this;

	}
}
