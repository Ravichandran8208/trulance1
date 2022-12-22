package com.framework.selenium.api.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.selenium.api.design.Browser;
import com.framework.selenium.api.design.Element;
import com.framework.selenium.api.design.Locators;
import com.framework.utils.TrulanceReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class TrulanceSeleniumBase extends TrulanceReporter implements Browser, Element {
	protected Actions act;
	public static String projectId;
	public static String auctionRef;
	public static Robot robot;
	public static SimpleDateFormat sdf;
	public static Calendar cal;
	public Shadow shadow;
	public  String url = "";
	public String homePage="https://trulance-bhc.epidev.me/";
	 int respCode = 200;
	 int countBrokenLinks;
	


	protected String getAttribute(WebElement ele, String attributeValue) {
		String val = "";
		try {
			val = ele.getAttribute(attributeValue);
		} catch (WebDriverException e) {
			reportStep("Attribue value not able to fetch :" + e.getMessage(), "info");
		}
		return val;
	}

	protected void moveToElement(WebElement ele) {
		act = new Actions(getDriver());
		act.moveToElement(ele).perform();
	}

	protected void dragAndDrop(WebElement eleSoutce, WebElement eleTarget) {
		act = new Actions(getDriver());
		act.dragAndDrop(eleSoutce, eleTarget).perform();
	}

	protected void contextClick(WebElement ele) {
		act = new Actions(getDriver());
		act.contextClick(getWait().until(ExpectedConditions.elementToBeClickable(ele))).perform();
	}
	

	protected void contextClick() {
		act = new Actions(getDriver());
		act.contextClick().perform();
	}

	protected void hoverAndClick(WebElement ele) {
		act = new Actions(getDriver());
		act.moveToElement(getWait().until(ExpectedConditions.elementToBeClickable(ele))).pause(5000).click().perform();
	}

	protected void doubleTap(WebElement ele) {
		act = new Actions(getDriver());
		act.click(getWait().until(ExpectedConditions.elementToBeClickable(ele))).click().perform();
		reportStep("Element moved", "info");
	}

	protected void doubleClick(WebElement ele) {
		act = new Actions(getDriver());
		act.doubleClick(getWait().until(ExpectedConditions.elementToBeClickable(ele))).perform();
		reportStep("Element double clicked", "info");
	}

	public void waitForApperance(WebElement element) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			reportStep("Element did not appear after 20 seconds", "fail", false);

		}

	}

	@Override
	public void click(WebElement ele) {
		try {
			ele.isDisplayed(); // @FindBy return the proxy even if it does not exist !!
		} catch (NoSuchElementException e) {
			reportStep("The Element " + ele + " is not found", "fail");
		}

		String text = "";
		try {
			try {
				Thread.sleep(500);
				getWait().until(ExpectedConditions.elementToBeClickable(ele));
				text = ele.getText();
				if (ele.isEnabled()) {
					ele.click();
				} else {
					getDriver().executeScript("arguments[0].click()", ele);
				}
			} catch (Exception e) {
				boolean bFound = false;
				int totalTime = 0;
				while (!bFound && totalTime < 10000) {
					try {
						Thread.sleep(500);
						ele.click();
						bFound = true;

					} catch (Exception e1) {
						bFound = false;
					}
					totalTime = totalTime + 500;
				}
				if (!bFound)
					ele.click();
			}
		} catch (StaleElementReferenceException e) {
			System.err.println(e);
			reportStep("The Element " + text + " could not be clicked due to:" + e.getMessage(), "fail");
		} catch (WebDriverException e) {
			System.err.println(e);
			reportStep("The Element " + ele + " could not be clicked due to: " + e.getMessage(), "fail");
		} catch (Exception e) {
			System.err.println(e);
			reportStep("The Element " + ele + " could not be clicked due to: " + e.getMessage(), "fail");
		}
	}

	public void clickUsingJs(WebElement ele) {
		try {
			ele.isDisplayed(); // @FindBy return the proxy even if it does not exist !!
		} catch (NoSuchElementException e) {
			reportStep("The Element " + ele + " is not found", "fail");
		}

		String text = "";
		try {
			try {
				getDriver().executeScript("arguments[0].click()", ele);
			} catch (Exception e) {
				boolean bFound = false;
				int totalTime = 0;
				while (!bFound && totalTime < 10000) {
					try {
						Thread.sleep(500);
						getDriver().executeScript("arguments[0].click()", ele);
						bFound = true;

					} catch (Exception e1) {
						bFound = false;
					}
					totalTime = totalTime + 500;
				}
				if (!bFound)
					getDriver().executeScript("arguments[0].click()", ele);
			}
		} catch (StaleElementReferenceException e) {
			reportStep("The Element " + text + " could not be clicked due to:" + e.getMessage(), "fail");
		} catch (WebDriverException e) {
			reportStep("The Element " + ele + " could not be clicked due to: " + e.getMessage(), "fail");
		} catch (Exception e) {
			reportStep("The Element " + ele + " could not be clicked due to: " + e.getMessage(), "fail");
		}
	}

	public void click(Locators locatorType, String value) {
		String text = "";
		WebElement ele = locateElement(locatorType, value);
		try {
			try {
				Thread.sleep(500);
				getWait().until(ExpectedConditions.elementToBeClickable(ele));
				text = ele.getText();
				if (ele.isEnabled()) {
					ele.click();
				} else {
					getDriver().executeScript("arguments[0].click()", ele);
				}
			} catch (Exception e) {
				boolean bFound = false;
				int totalTime = 0;
				while (!bFound && totalTime < 10000) {
					try {
						Thread.sleep(500);
						ele = locateElement(locatorType, value);
						ele.click();
						bFound = true;

					} catch (Exception e1) {
						bFound = false;
					}
					totalTime = totalTime + 500;
				}
				if (!bFound)
					ele.click();
			}
		} catch (StaleElementReferenceException e) {
			reportStep("The Element " + text + " could not be clicked " + e.getMessage(), "fail");
		} catch (WebDriverException e) {
			reportStep("The Element " + ele + " could not be clicked \n" + e.getMessage(), "fail");
		} catch (Exception e) {
			reportStep("The Element " + ele + " could not be clicked \n" + e.getMessage(), "fail");
		}
	}

	public void clickWithNoSnap(WebElement ele) {
		// String text = ele.getText();
		try {
			getWait().until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
		} catch (StaleElementReferenceException e) {
			reportStep("The Element " + ele + " could not be clicked \n" + e.getMessage(), "fail", false);
		} catch (WebDriverException e) {
			reportStep("The Element " + ele + " could not be clicked \n" + e.getMessage(), "fail", false);
		} catch (Exception e) {
			reportStep("The Element " + ele + " could not be clicked \n" + e.getMessage(), "fail", false);
		}
	}

	
	@Override
	public void append(WebElement ele, String data) {
		try {
			String attribute = ele.getAttribute("value");
			if (attribute.length() > 1) {
				ele.sendKeys(data);
			} else {
				ele.sendKeys(data);
			}
		} catch (WebDriverException e) {
			reportStep("The Element " + ele + " could not be appended \n" + e.getMessage(), "fail");
		}
	}

	@Override
	public void clear(WebElement ele) {
		try {
			ele.clear();
		} catch (ElementNotInteractableException e) {
			reportStep("The field is not Interactable \n" + e.getMessage(), "fail");
		}
	}

	/**
	 * Overloaded method used to clear the existing value and type the data with
	 * keys for tab or enter kind of
	 * 
	 * @param ele  - WebElement from the DOM
	 * @param data - Use to type and pass Keys as many needed
	 */
	public void clearAndType(WebElement ele, CharSequence... data) {
		try {
			getWait().until(ExpectedConditions.visibilityOf(ele));
			ele.clear();
			ele.sendKeys(data);
		} catch (ElementNotInteractableException e) {
			reportStep("The Element " + ele + " is not Interactable \n" + e.getMessage(), "fail");
		} catch (WebDriverException e) { // retry - 1
			pause(500);
			try {
				ele.sendKeys(data);
			} catch (Exception e1) {
				reportStep("The Element " + ele + " did not allow to clear / type \n" + e.getMessage(), "fail");
			}
		}

	}

	@Override
	public void clearAndType(WebElement ele, String data) {
		try {
			getWait().until(ExpectedConditions.visibilityOf(ele));
			ele.clear();
			pause(2000);
			ele.sendKeys("", "", data);
		} catch (ElementNotInteractableException e) {
			reportStep("The Element " + ele + " is not Interactable \n" + e.getMessage(), "fail");
		} catch (WebDriverException e) { // retry - 1
			pause(500);
			try {
				ele.sendKeys(data);
			} catch (Exception e1) {
				reportStep("The Element " + ele + " did not allow to clear / type \n" + e.getMessage(), "fail");
			}
		}

	}

	public void typeAndTab(WebElement ele, String data) {
		try {
			getWait().until(ExpectedConditions.visibilityOf(ele));
			ele.clear();
			ele.sendKeys("", "", data, Keys.TAB);
		} catch (ElementNotInteractableException e) {
			reportStep("The Element " + ele + " is not Interactable \n" + e.getMessage(), "fail");
		} catch (WebDriverException e) {
			reportStep("The Element " + ele + " is not Interactable \n" + e.getMessage(), "fail");
		}

	}

	public void type(WebElement ele, String data) {
		try {
			getWait().until(ExpectedConditions.visibilityOf(ele));
			ele.clear();
			ele.sendKeys("", "", data);
		} catch (ElementNotInteractableException e) {
			reportStep("The Element " + ele + " is not Interactable \n" + e.getMessage(), "fail");
		} catch (WebDriverException e) {
			reportStep("The Element " + ele + " is not Interactable \n" + e.getMessage(), "fail");
		}

	}

	public void typeAndEnter(WebElement ele, String data) {
		try {
			getWait().until(ExpectedConditions.visibilityOf(ele));
			ele.clear();
			ele.sendKeys("", "", data, Keys.ENTER);
		} catch (ElementNotInteractableException e) {
			reportStep("The Element " + ele + " is not Interactable \n" + e.getMessage(), "fail");
		} catch (WebDriverException e) {
			reportStep("The Element " + ele + " is not Interactable \n" + e.getMessage(), "fail");
		}

	}

	@Override
	public String getElementText(WebElement ele) {
		try {
			String text = ele.getText();
			reportStep("Text has been retrieved " + text, "info");
			return text;
		} catch (WebDriverException e) {
			reportStep("Sorry! text is not available \n" + e.getMessage(), "fail");
		} catch (Exception e) {
			reportStep("Sorry! text is not available \n" + e.getMessage(), "fail");
		}
		return null;
	}

	@Override
	public String getBackgroundColor(WebElement ele) {
		String cssValue = null;
		try {
			cssValue = ele.getCssValue("color");
			reportStep("The background color is " + cssValue, "info");
		} catch (WebDriverException e) {
			reportStep("Not able to get the background color \n" + e.getMessage(), "fail");
		} catch (Exception e) {
			reportStep("Not able to get the background color \n" + e.getMessage(), "fail");
		}
		return cssValue;
	}

	@Override
	public String getTypedText(WebElement ele) {
		String attributeValue = null;
		try {
			attributeValue = ele.getAttribute("value");
			reportStep("The attribute value is " + attributeValue, "info");
		} catch (WebDriverException e) {
			reportStep("Not able to find attribute value \n" + e.getMessage(), "fail");
		}
		return attributeValue;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select sel = new Select(ele);
			sel.selectByVisibleText(value);
		} catch (WebDriverException e) {
			reportStep("Not able to select the drop down with text \n" + value, "fail");
		}
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			Select sel = new Select(ele);
			sel.selectByIndex(index);
		} catch (WebDriverException e) {
			reportStep("Not able to select the drop down with index " + index + " \n" + e.getMessage(), "fail");
		}
	}

	@Override
	public void selectDropDownUsingValue(WebElement ele, String value) {
		try {
			Select sel = new Select(ele);
			sel.selectByValue(value);
		} catch (WebDriverException e) {
			reportStep("Not able to select the drop down with value " + value + " \n" + e.getMessage(), "fail");
		}
	}

	@Override
	public boolean verifyExactText(WebElement ele, String expectedText) {
		try {
			String text = ele.getText();
			System.out.println(text);
			if (text.equals(expectedText)) {
				reportStep("The expected text " + text + " equals to the  " + expectedText, "pass");
				return true;
				
			} else {
				reportStep("The expected text " + text + " doesn't equals to the  " + expectedText, "warning");
			}
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while verifying the Text \n" + e.getMessage(), "fail");
		}

		return false;
	}
	public boolean verifyExactText1(WebElement ele, String expectedText) {
		try {
			String text = ele.getText();
			System.out.println(text);
			if (text.contains(expectedText)) {
				reportStep("The expected text " + text + " equals to the  " + expectedText, "pass");
				return true;
				
			} else {
				reportStep("The expected text " + text + "doesn't equals to the  " + expectedText, "warning");
			}
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while verifying the Text \n" + e.getMessage(), "fail");
		}

		return false;
	}

	@Override
	public boolean verifyPartialText(WebElement ele, String expectedText) {
		try {
			if (ele.getText().contains(expectedText)) {
				reportStep("The expected text contains the actual " + expectedText, "info");
				return true;
			} else {
				reportStep("The expected text doesn't contain the actual " + expectedText, "warning");
			}
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while verifying the Text \n" + e.getMessage(), "fail");
		}
		return false;
	}

	@Override
	public boolean verifyExactAttribute(WebElement ele, String attribute, String value) {
		try {
			System.out.println(ele.getAttribute(attribute));
			if (ele.getAttribute(attribute).equals(value)) {
				reportStep("The expected attribute :" + attribute + " value contains the actual " + value,
						"info");
				return true;
				
			} else {
				reportStep("The expected attribute :" + attribute + " value does not contains the actual " + value,
						"warning");
			}
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while verifying the Attribute Text \n" + e.getMessage(), "fail");
		}
		return false;
	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
			if (ele.getAttribute(attribute).contains(value)) {
				reportStep("The expected attribute :" + attribute + " value contains the actual " + value, "pass");
			} else {
				reportStep("The expected attribute :" + attribute + " value does not contains the actual " + value,
						"warning");
			}
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while verifying the Attribute Text \n" + e.getMessage(), "fail");
		}

	}

	@Override
	public boolean verifyDisplayed(WebElement ele) {
		try {
			if (ele.isDisplayed()) {
				reportStep("The element  is  visible", "info");
				return true;
				
			} else {
				reportStep("The element " + ele + " is not visible", "warnings");
			}
		} catch (WebDriverException e) {
			reportStep("WebDriverException : \n" + e.getMessage(), "fail");
		}
		return false;

	}

	@Override
	public boolean verifyDisappeared(WebElement ele) {
		try {
			Boolean until = getWait().until(ExpectedConditions.invisibilityOf(ele));
			reportStep("Waited for an element to disappear", "info");
			return until;
		} catch (org.openqa.selenium.TimeoutException e) {
			reportStep("Element not disappeared \n" + e.getMessage(), "fail");
		} catch (Exception e) {
			reportStep("Element not disappeared \n" + e.getMessage(), "fail");
		}
		return false;

	}

	@Override
	public boolean verifyEnabled(WebElement ele) {
		try {
			if (ele.isEnabled()) {
				return true;
			} else {
				reportStep("The element " + ele + " is not Enabled", "warning");
			}
		} catch (WebDriverException e) {
			reportStep("WebDriverException : \n" + e.getMessage(), "fail");
		}
		return false;
	}

	@Override
	public boolean verifySelected(WebElement ele) {
		try {
			if (ele.isSelected()) {
				return true;
			} else {
				reportStep("The element " + ele + " is not selected", "warning");
			}
		} catch (WebDriverException e) {
			reportStep("WebDriverException : \n" + e.getMessage(), "fail");
		}
		return false;

	}

	@Override
	public void startApp(String url, boolean headless) {
		try {
			setDriver("chrome", headless);
			setWait();
			act = new Actions(getDriver());
			getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
			getDriver().get(url);
			reportStep("The Browser Launched in chrome browser with URL " + url, "pass");
		} catch (Exception e) {
			reportStep("Something went wrong \n" + e.getMessage(), "fail");
		}

	}

	@Override
	public void startApp(String browser, boolean headless, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.silentOutput", "true");
				// System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				setDriver("chrome", headless);
			} else if (browser.equalsIgnoreCase("firefox")) {
				// System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				WebDriverManager.firefoxdriver().setup();
				setDriver("firefox", headless);
			} else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				// WebDriverManager.iedriver().setup();
				setDriver("ie", false);

			} else {

				WebDriverManager.edgedriver().setup();
				setDriver("edge", headless);
			}
			setWait();
			getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
			getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));
			getDriver().get(url);
		} catch (WebDriverException e) {
			e.printStackTrace();
			reportStep("The Browser Could not be Launched. Hence Failed \n" + e.getMessage(), "fail");
		} catch (Exception e) {
			e.printStackTrace();
			reportStep("The Browser Could not be Launched. Hence Failed \n" + e.getMessage(), "fail");
		}
	}

	@Override
	public WebElement locateElement(Locators locatorType, String value) {
		try {
			switch (locatorType) {
			case CLASS_NAME:
				return getDriver().findElement(By.className(value));
			case CSS:
				return getDriver().findElement(By.cssSelector(value));
			case ID:
				return getDriver().findElement(By.id(value));
			case LINK_TEXT:
				return getDriver().findElement(By.linkText(value));
			case NAME:
				return getDriver().findElement(By.name(value));
			case PARTIAL_LINKTEXT:
				return getDriver().findElement(By.partialLinkText(value));
			case TAGNAME:
				return getDriver().findElement(By.tagName(value));
			case XPATH:
				return getDriver().findElement(By.xpath(value));
			default:
				System.err.println("Locator is not Valid");
				break;
			}
		} catch (NoSuchElementException e) {
			reportStep("The Element with locator:" + locatorType + " Not Found with value: " + value + "\n"
					+ e.getMessage(), "fail");
		} catch (Exception e) {
			reportStep("The Element with locator:" + locatorType + " Not Found with value: " + value + "\n"
					+ e.getMessage(), "fail");
		}
		return null;
	}

	@Override
	public WebElement locateElement(String value) {
		try {
			WebElement findElementById = getDriver().findElement(By.id(value));
			return findElementById;
		} catch (NoSuchElementException e) {
			reportStep("The Element with locator id Not Found with value: " + value + "\n" + e.getMessage(), "fail");
		} catch (Exception e) {
			reportStep("The Element with locator id Not Found with value: " + value + "\n" + e.getMessage(), "fail");
		}
		return null;
	}

	@Override
	public List<WebElement> locateElements(Locators type, String value) {
		try {
			switch (type) {
			case CLASS_NAME:
				return getDriver().findElements(By.className(value));
			case CSS:
				return getDriver().findElements(By.cssSelector(value));
			case ID:
				return getDriver().findElements(By.id(value));
			case LINK_TEXT:
				return getDriver().findElements(By.linkText(value));
			case NAME:
				return getDriver().findElements(By.name(value));
			case PARTIAL_LINKTEXT:
				return getDriver().findElements(By.partialLinkText(value));
			case TAGNAME:
				return getDriver().findElements(By.tagName(value));
			case XPATH:
				return getDriver().findElements(By.xpath(value));
			default:
				System.err.println("Locator is not Valid");
				break;
			}
		} catch (NoSuchElementException e) {
			reportStep("The Element with locator:" + type + " Not Found with value: " + value + "\n" + e.getMessage(),
					"fail");
		}
		return null;
	}

	@Override
	public void switchToAlert() {
		try {
			getDriver().switchTo().alert();
			// reportStep("Focus has been switched to Alert", "info", false);
		} catch (NoAlertPresentException e) {
			// reportStep("There is no alert present.", "fail", false);
		} catch (WebDriverException e) {
			// reportStep("WebDriverException : " + e.getMessage(), "fail", false);
		}
	}

	@Override
	public void acceptAlert() {
		String text = "";
		try {
			getWait().until(ExpectedConditions.alertIsPresent());
			Alert alert = getDriver().switchTo().alert();
			text = alert.getText();
			System.out.println(text);
			alert.accept();
			reportStep("The alert " + text + " is accepted.", "pass", false);
		} catch (NoAlertPresentException e) {
			reportStep("There is no alert present.", "fail", false);
		} catch (WebDriverException e) {
			reportStep("WebDriverException : " + e.getMessage(), "fail", false);
		}

	}

	@Override
	public void dismissAlert() {
		String text = "";
		try {
			Alert alert = getDriver().switchTo().alert();
			text = alert.getText();
			alert.dismiss();
			reportStep("The alert " + text + " is accepted.", "pass", false);
		} catch (NoAlertPresentException e) {
			reportStep("There is no alert present.", "pass", false);
		} catch (WebDriverException e) {
			reportStep("WebDriverException : " + e.getMessage(), "fail", false);
		}

	}

	@Override
	public String getAlertText() {
		String text = "";
		try {
			Alert alert = getDriver().switchTo().alert();
			text = alert.getText();
			// reportStep("The alert text is " + text, "pass", false);
		} catch (NoAlertPresentException e) {
			// reportStep("There is no alert present.", "fail", false);
		} catch (WebDriverException e) {
			// reportStep("WebDriverException : \n" + e.getMessage(), "fail", false);
		}
		return text;
	}

	@Override
	public String getAlertTextWithAccept() {
		String text = "";
		try {
			Alert alert = getDriver().switchTo().alert();
			text = alert.getText();
			alert.accept();
			reportStep("The alert text is " + text, "pass", false);
		} catch (NoAlertPresentException e) {
			reportStep("There is no alert present.", "fail", false);
		} catch (WebDriverException e) {
			reportStep("WebDriverException : \n" + e.getMessage(), "fail", false);
		}
		return text;
	}

	@Override
	public void typeAlert(String data) {
		try {
			getDriver().switchTo().alert().sendKeys(data);
		} catch (NoAlertPresentException e) {
			reportStep("There is no alert present.", "fail", false);
		} catch (WebDriverException e) {
			reportStep("WebDriverException : \n" + e.getMessage(), "fail", false);
		}
	}

	@Override
	public void switchToWindow(int index) {
		try {
			Set<String> allWindows = getDriver().getWindowHandles();
			List<String> allhandles = new ArrayList<String>(allWindows);
			getDriver().switchTo().window(allhandles.get(index));
			System.out.println(getDriver().getTitle());
			reportStep("The Window With index: " + index + " switched successfully", "info", false);
			reportStep(getDriver().getTitle(), "info");
		} catch (NoSuchWindowException e) {
			reportStep("The Window With index: " + index + " not found\n" + e.getMessage(), "fail", false);
		} catch (Exception e) {
			reportStep("The Window With index: " + index + " not found\n" + e.getMessage(), "fail", false);
		}
	}

	@Override
	public boolean switchToWindow(String title) {
		try {
			String firstWindow = getDriver().getWindowHandle();
			Set<String> allWindows = getDriver().getWindowHandles();
			System.out.println(allWindows.size() + " --> No of windows");
			System.out.println(allWindows);
			for (String eachWindow : allWindows) {

				if (!eachWindow.equals(firstWindow)) {
					/*
					 * System.out.println(eachWindow); pause(10000);
					 * getDriver().switchTo().window(eachWindow);
					 */
					System.out.println(eachWindow);
					pause(20000);
					getDriver().switchTo().window(eachWindow);
					System.out.println("Switched to new window");
					break;
				}

				/*
				 * getDriver().switchTo().window(eachWindow);
				 * System.out.println(getDriver().getTitle()); if
				 * (getDriver().getTitle().equals(title)) {
				 * System.out.println(getDriver().getTitle()); break; }
				 */
			}
			reportStep("The Window With Title: " + title + "is switched ", "info");
			return true;
		} catch (NoSuchWindowException e) {
			reportStep("The Window With Title: " + title + " not found", "fail", false);
		}
		return false;
	}

	@Override
	public void switchToFrame(int index) {
		try {
			Thread.sleep(100);
			getDriver().switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			reportStep("No such frame " + e.getMessage(), "warning", false);
		} catch (Exception e) {
			reportStep("No such frame " + e.getMessage(), "fail", false);
		}

	}

	@Override
	public void switchToFrame(WebElement ele) {
		try {
			getDriver().switchTo().frame(ele);
		} catch (NoSuchFrameException e) {
			reportStep("No such frame " + e.getMessage(), "fail", false);
		} catch (Exception e) {
			reportStep("No such frame " + e.getMessage(), "fail", false);
		}

	}

	public void switchToFrameUsingXPath(String xpath) {
		try {
			getDriver().switchTo().frame(locateElement(Locators.XPATH, xpath));
		} catch (NoSuchFrameException e) {
			// reportStep("No such frame " + e.getMessage(), "warning", false);
		} catch (Exception e) {
			// reportStep("No such frame " + e.getMessage(), "fail", false);
		}

	}

	@Override
	public void switchToFrame(String idOrName) {
		try {
			getDriver().switchTo().frame(idOrName);
		} catch (NoSuchFrameException e) {
			reportStep("No such frame " + e.getMessage(), "fail", false);
		} catch (Exception e) {
			reportStep("No such frame " + e.getMessage(), "fail", false);
		}
	}

	@Override
	public void defaultContent() {
		try {
			getDriver().switchTo().defaultContent();
		} catch (Exception e) {
			reportStep("No such window " + e.getMessage(), "fail", false);
		}
	}

	@Override
	public boolean verifyUrl(String url) {
		System.out.println("URL"+getDriver().getCurrentUrl());
		String currentUrl = getDriver().getCurrentUrl();
		if (getDriver().getCurrentUrl().contains(url)) {
			reportStep(currentUrl+"Mtached to : " + url + " matched successfully", "pass");
			return true;
		} else {
			reportStep(currentUrl+"Doesn't Mtached to: " + url + " not matched", "fail");
		}
		return false;
	}
//	public boolean verifytextUrl(WebElement ele, String url) {
//		if (((RemoteWebDriver) ele).getCurrentUrl().contains(url)) {
//			reportStep("The url: " + url + " matched successfully", "pass");
//			return true;
//		} else {
//			reportStep("The url: " + url + " not matched", "fail");
//		}
//		return false;
//	}

	@Override
	public boolean verifyTitle(String title) {
		pause(2000);
		String title2 = getDriver().getTitle();
		pause(2000);
		System.out.println("Title page: " + title2);
		if (getDriver().getTitle().equals(title)) {
			reportStep("Page title: " + title + " matched successfully", "pass");
			return true;
		} else {
			reportStep("Page title: " + title + " not matched", "fail");

		}
		return false;
	}
	public boolean verifytextBackgroundColor(WebElement clr, String color) {
		pause(2000);
			String s = clr.getCssValue("color");
			String hexvalue = Color.fromString(s).asHex();
			System.out.println(hexvalue);
			
			if (hexvalue.equals(color)) {
				reportStep("text color: " + color + " matched successfully", "pass");
				return true;
			} else {
				reportStep("text color: " + color + " not matched", "fail");

			}
			return false;
	}
	public boolean verifyBackgroundColor(WebElement clr, String color) {
		pause(2000);
			String s = clr.getCssValue("background-color");
			String hexvalue = Color.fromString(s).asHex();
			System.out.println(hexvalue);
			
			if (hexvalue.equals(color)) {
				reportStep("text background color: " + color + " matched successfully", "pass");
				return true;
			} else {
				reportStep("text background color: " + color + " not matched", "fail");

			}
			return false;
	}
	public boolean verifyImgSize(WebElement ele, String ExactSize) {
		pause(2000);
			Dimension size = ele.getSize();
			String ActualSize = size.toString();
			System.out.println(size);
			
			if (ActualSize.equals(ExactSize)) {
				reportStep(" size: " + ExactSize + " matched successfully", "pass");
				return true;
			} else {
				reportStep("The expected text " + size + "doesn't equals to the  " + ExactSize, "fail");

			}
			return false;
	}
	public boolean verifytextWeight(WebElement weight, String fontweight) {
		pause(2000);

			System.out.println("text font-weight : " + weight.getCssValue("font-weight"));
			
			if (weight.getCssValue("font-weight").equals(fontweight)) {
				reportStep("text font weight: " + fontweight + " matched successfully", "pass");
				return true;
			} else {
				reportStep("text font weight: " + fontweight + " not matched", "fail");

			}
			return false;
	}
	public boolean verifytextLineHeight(WebElement Height, String LineHeight) {
		pause(2000);

			System.out.println("text font-weight : " + Height.getCssValue("line-height"));
			
			if (Height.getCssValue("line-height").equals(LineHeight)) {
				reportStep("text font height: " + LineHeight + " matched successfully", "pass");
				return true;
			} else {
				reportStep("text font height: " + LineHeight + " not matched", "fail");

			}
			return false;
	}
	public boolean verifytextSize(WebElement txtSiize, String size) {
		pause(2000);
//		 cssValue1 = null;
			pause(2000);
			System.out.println("text size: " + txtSiize.getCssValue("font-size"));
			
			if (txtSiize.getCssValue("font-size").equals(size)) {
				reportStep("text size: " + size + " matched successfully", "pass");
				return true;
			} else {
				reportStep("text size: " + size + " not matched", "fail");

			}
			return false;
	}
	public boolean verifytextFamily(WebElement txtFamily, String Familyname) {
		pause(2000);
			pause(2000);
			System.out.println("text family: " + txtFamily.getCssValue("font-family"));
			
			if (txtFamily.getCssValue("font-family").equals(Familyname)) {
				reportStep("text family: " + Familyname + " matched successfully", "pass");
				return true;
			} else {
				reportStep("text family: " + Familyname + " not matched", "fail");

			}
			return false;
	}
	public boolean verifytextWidth(WebElement txtWidth, String Width) {
		pause(2000);
			pause(2000);
			System.out.println("text Width: " + txtWidth.getCssValue("font-Width"));
			
			if (txtWidth.getCssValue("font-Width").equals(Width)) {
				reportStep("text Width: " + Width + " matched successfully", "pass");
				return true;
			} else {
				reportStep("text Width: " + Width + " not matched", "fail");

			}
			return false;
	}
	public boolean verifytextHeight(WebElement txtHeight, String Height) {
		pause(2000);
			pause(2000);
			System.out.println("text Width: " + txtHeight.getCssValue("font-Height"));
			
			if (txtHeight.getCssValue("font-Width").equals(Height)) {
				reportStep("text Height: " + Height + " matched successfully", "pass");
				return true;
			} else {
				reportStep("text Height: " + Height + " not matched", "fail");

			}
			return false;
	}
	public boolean verifytextAlign(WebElement align, String placeofAlign) {
		pause(2000);
			pause(2000);
			System.out.println("text-align: " + align.getCssValue("text-align"));
			
			if (align.getCssValue("text-align").equals(placeofAlign)) {
				reportStep("text Align: " + placeofAlign + " matched successfully", "pass");
				return true;
			} else {
				reportStep("text Align: " + placeofAlign + " not matched", "fail");

			}
			return false;
	}

	public boolean verifytextLocation(WebElement Location, String loc) {
		pause(2000);
		System.out.println("text location: " + Location.getLocation());
		Point location2 = Location.getLocation();

		if (location2.toString().equals(loc)) {
			reportStep("text size: " + loc + " matched successfully", "pass");
			return true;
		} else {
			reportStep("text size: " + loc + " not matched", "fail");

		}
		return false;
	}
	@Override
	public String takeSnap() {
		String screenShot = "";
		try {
			screenShot = getDriver().getScreenshotAs(OutputType.BASE64);
		} catch (WebDriverException e) {
			reportStep("The browser has been closed." + e.getMessage(), "fail");
		} catch (Exception e) {
			reportStep("The snapshot could not be taken " + e.getMessage(), "warning");
		}
		return screenShot;
	}

	@Override
	public void close() {
		try {
			getDriver().close();
		} catch (Exception e) {
			reportStep("Browser cannot be closed " + e.getMessage(), "fail", false);
		}
	}

	@Override
	public void quit() {
		try {
			getDriver().quit();
			// reportStep("Browser is closed", "info", false);
		} catch (Exception e) {
			// reportStep("Browser cannot be closed " + e.getMessage(), "fail", false);
		}
	}

	public void waitForDisapperance(WebElement element) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
			wait.until(ExpectedConditions.invisibilityOf(element));
		} catch (Exception e) {
			reportStep("Element did not appear after 10 seconds", "fail", false);

		}

	}

	public void pause(int timeout) {
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void chooseDate(WebElement ele, String data) {
		try {
			getDriver().executeScript("arguments[0].setAttribute('value', '" + data + "')", ele);
			reportStep("The Data :" + data + " entered Successfully", "pass");
		} catch (ElementNotInteractableException e) {
			reportStep("The Element " + ele + " is not Interactable \n" + e.getMessage(), "fail");
		} catch (WebDriverException e) {
			reportStep("The Element " + ele + " is not Interactable \n" + e.getMessage(), "fail");
		}

	}

	public void fileUpload(WebElement ele, String data) {
		try {
			hoverAndClick(ele);
			pause(2000);

			// Store the copied text in the clipboard
			StringSelection stringSelection = new StringSelection(data);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

			// Paste it using Robot class
			Robot robot = new Robot();

			// Enter to confirm it is uploaded
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);

			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			reportStep("The file is selected Successfully", "pass");
		} catch (Exception e) {
			reportStep("The file is not selected Successfully", "fail");
		}

	}

	public void fileUploadWithJs(WebElement ele, String data) {
		try {

			clickUsingJs(ele);
			;
			pause(2000);

			// Store the copied text in the clipboard
			StringSelection stringSelection = new StringSelection(data);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

			// Paste it using Robot class
			Robot robot = new Robot();

			// Enter to confirm it is uploaded
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);

			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			reportStep("The file is selected Successfully", "pass");
		} catch (Exception e) {
			reportStep("The file is not selected Successfully", "fail");
		}

	}

	@Override
	public void executeTheScript(String js, WebElement ele) {
		getDriver().executeScript(js, ele);
	}

	public static void generateProjectAndAuctionIds() {
		int ranNum1 = (int) (Math.random() * 10000);
		int ranNum2 = ranNum1 + 9999;
		projectId = Integer.toString(ranNum1);
		auctionRef = Integer.toString(ranNum2);
	}

	public void scrollToElement(WebElement ele) {
		// TODO Auto-generated method stub
		try {
			getDriver().executeScript("arguments[0].scrollIntoView();", ele);
		} catch (Exception e) {
			reportStep("Scroll to othe Element is not Successfull " + e.getMessage(), "fail", false);
		}
	}

	public void subtractDate(int num) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		// displaying date
		System.out.println("Date: " + date);
		// subtract days from the current date
		LocalDate newDate = date.minusDays(56);
		System.out.println("New Date: " + newDate);

	}

	public int getWindowSize() {
		int size = 0;
		Set<String> allWindows = getDriver().getWindowHandles();
		size = allWindows.size();

		return size;
	}

	public void closeTabUsingAltF4() throws Exception {
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);
	}

	public void verifyAlertText(String expectedText) {
		try {

			getWait().until(ExpectedConditions.alertIsPresent());

			switchToAlert();
			String alertText = getAlertText();
			System.out.println(alertText);

			if (alertText.contains(expectedText)) {
				reportStep("The expected text " + alertText + " equals to the  " + expectedText, "info");
			} else {
				reportStep("The expected text " + alertText + "doesn't equals to the  " + expectedText, "fail");
			}
		} catch (NoAlertPresentException e) {
			reportStep("There is no alert present.", "fail", false);
		} catch (WebDriverException e) {
			reportStep("WebDriverException : \n" + e.getMessage(), "fail", false);
		}
	}

	public String getUrl() {

		try {
			String currentUrl = getDriver().getCurrentUrl();
			reportStep("Text has been retrieved " + currentUrl, "info");
			return currentUrl;
		} catch (WebDriverException e) {
			reportStep("Sorry! No Window is not available \n" + e.getMessage(), "fail");
		} catch (Exception e) {
			reportStep("Sorry! No Window  is not available \n" + e.getMessage(), "fail");
		}
		return null;
	}
	public String getAllUrl() {

		try {
			 List<WebElement> allLinks = getDriver().findElements(By.tagName("a"));
			 
			 //Traversing through the list and printing its text along with link address
			 for(WebElement link:allLinks){
			 System.out.println(link.getText() + " - " + link.getAttribute("href"));
				reportStep("Text has been retrieved " +link.getText() + " - " + link.getAttribute("href"), "info");

			 }
//			reportStep("Text has been retrieved " + allLinks+link.getText(), "info");
//			return link;
		} catch (WebDriverException e) {
			reportStep("Sorry! No Window is not available \n" + e.getMessage(), "fail");
		} catch (Exception e) {
			reportStep("Sorry! No Window  is not available \n" + e.getMessage(), "fail");
		}
		return null;
	}

	public void uploadFile(WebElement ele, String path) {
		String currDir = System.getProperty("user.dir");
		ele.sendKeys(currDir + path);
	}

	public String getDate(String inp, String data) {
		sdf = new SimpleDateFormat(inp);
		cal = Calendar.getInstance();
		cal.add(Calendar.DATE, Integer.parseInt(data));
		String format = sdf.format(cal.getTime());
		return format;

	}

	public String getTime(String timeFormat, String data) {
		sdf = new SimpleDateFormat(timeFormat);
		cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.HOUR_OF_DAY, Integer.parseInt(data));
		System.out.println("current time: " + sdf.format(cal.getTime()));
		return sdf.format(cal.getTime());
	}

	public WebElement locateElementUsingShadowDom(Locators locatorType, String value) {
		shadow = new Shadow(getDriver());
		try {
			switch (locatorType) {
			case CSS:
				return shadow.findElement(value);
			case XPATH:
				return shadow.findElementByXPath(value);
			default:
				System.err.println("Locator is not Valid");
				break;
			}
		} catch (NoSuchElementException e) {
			reportStep("The Element with locator:" + locatorType + " Not Found with value: " + value + "\n"
					+ e.getMessage(), "fail");
		} catch (Exception e) {
			reportStep("The Element with locator:" + locatorType + " Not Found with value: " + value + "\n"
					+ e.getMessage(), "fail");
		}
		return null;
	}

	public String subDate(int num) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, num);
		String format = sdf.format(cal.getTime());
		System.out.println(format);
		return format;

	}

	public void verifyDownloadedFileFormat(String data, String format) {

		try {
			File directory = new File("./doc");
			File[] files = directory.listFiles(File::isFile);
			long lastModifiedTime = Long.MIN_VALUE;

			for (File file : files) {
				if (file.lastModified() > lastModifiedTime && file.toString().contains(data)
						&& file.toString().contains(format)) {

					String fileName = file.toString();

					System.out.println(fileName);
					if (fileName.contains(format)) {
						reportStep("The Posting Data Report is downloaded in Excel format", "pass");
					} else
						reportStep("The Posting Data Report is Not downloaded in Excel format", "fail");

				}
			}
		} catch (Exception e) {
			reportStep("The File is not downloade in the doc folder", "fail");
		}
	}

	@Override
	public void switchToLastWin() {
		int WindowCount = 0;
		try {
			Set<String> allWindows = getDriver().getWindowHandles();
			List<String> allhandles = new ArrayList<String>(allWindows);
			WindowCount = allhandles.size();
			getDriver().switchTo().window(allhandles.get(WindowCount - 1));
			getDriver().manage().window().maximize();
			reportStep("The Window With index: " + WindowCount + " switched successfully", "info", false);
			reportStep(getDriver().getTitle(), "info");
		} catch (NoSuchWindowException e) {
			reportStep("The Window With index: " + WindowCount + " not found\n" + e.getMessage(), "fail", false);
		} catch (Exception e) {
			reportStep("The Window With index: " + WindowCount + " not found\n" + e.getMessage(), "fail", false);
		}
	}

	public void pressEscUsingRobot() throws AWTException {
		// TODO Auto-generated method stub
		robot = new Robot();

		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}

	@Override
	public String generateRandomNumber() {
		int Rnumber = (int) (Math.random() * 99999 + 100000);
		String Number = Rnumber + "";
		return Number;
	}

	public String addDate(int num) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, num);
		String format = sdf.format(cal.getTime());
		System.out.println(format);
		return format;
	}

	@SuppressWarnings("unused")
	protected boolean isAttribtueNotPresent(WebElement element, String attribute) {
		Boolean result = null;
		try {
			String value = element.getAttribute(attribute);
			System.out.println(value.length());
			if (value.length() <= 0) {
				result = true;
			} else {
				result = false;
			}
		} catch (Exception e) {
		}

		return result;
	}

	public void pressSaveUsingRobot() throws AWTException {
		// TODO Auto-generated method stub
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public int addHoursFromCurrentTime(int hours) {
		// TODO Auto-generated method stub
	   cal = Calendar.getInstance(); // creates calendar
		cal.setTime(new Date());               // sets calendar time/date
		cal.add(Calendar.HOUR_OF_DAY, hours);      // adds one hour
		cal.getTime();
		System.out.println(cal.getTime().getHours());
		 return cal.getTime().getHours();
	}

	public void pressEnterUsingRobot() throws AWTException {
		// TODO Auto-generated method stub
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public void verifyBrokenLink() {
        int count = 1;

		 List<WebElement> links = getDriver().findElements(By.tagName("a"));
	        
	        Iterator<WebElement> it = links.iterator();
	        
	        while(it.hasNext()){
	            
	        	url   = it.next().getAttribute("href");
	            
	            System.out.println(url);
	        
	            if(url == null || url.isEmpty()){
	System.out.println("URL is either not configured for anchor tag or it is empty");
	                continue;
	            }
	            
//	            if(!url.startsWith(homePage)){
//	                System.out.println("URL belongs to another domain, skipping it.");
//	                continue;
//	            }
	            
	            try {
	            	HttpURLConnection   huc = (HttpURLConnection)(new URL(url).openConnection());
	                
	                huc.setRequestMethod("HEAD");
	                
	                huc.connect();
	                
	                respCode = huc.getResponseCode();
	                
	                if(respCode >= 400){
	                    System.out.println(url+" is a broken link");
	                    reportStep(url+" is a broken link", "info");
	          

	                 
	                     countBrokenLinks = count++;
//	                    System.out.println(countBrokenLinks);

	                }
	                else{
	                    System.out.println(url+" is a valid link");
	                    reportStep(url+" is a valid link", "info");
	                    

	                }
	               
	                
	                    
	            } catch (MalformedURLException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }
            reportStep(countBrokenLinks+" Broken links available in this site", "info");
        
	}
	public void verifylist(String Value,String Listvalue1,String Listvalue2,String Listvalue3,String Listvalue4,String Listvalue5) {
		String text=null;
		
		WebElement list = getDriver().findElement(By.xpath(Value));
		List<WebElement> ListOfMenus = list.findElements(By.tagName("li"));
		System.out.println(ListOfMenus);
		
			
		
		for (WebElement webElement : ListOfMenus) {
			 text= webElement.getText();
//				reportStep(" DropDown Menus order Should be "+text,"info");

//			String indent = text.indent(0);
//			System.out.println(text);
				/*
				 * int count = text.length(); System.out.println(count);
				 */
			 List<String> ArrayList1= new LinkedList<String>();
			 ArrayList1.add(Listvalue1);
			 ArrayList1.add(Listvalue2);
			 ArrayList1.add(Listvalue3);
			 ArrayList1.add(Listvalue4);
			 ArrayList1.add(Listvalue5);
			 for (String webElement2 : ArrayList1) {
				 
				 try {
					 if(text.equals(webElement2)) {
						 
						 reportStep("The expected list " + text + " equals to the  " + webElement2, "info");
						} /*
							 * else { reportStep("The expected list " + text + "doesn't equals to the  " +
							 * webElement2, "fail"); }
							 */
					} catch (NoAlertPresentException e) {
						reportStep("There is no list present.", "fail", false);
					} catch (WebDriverException e) {
						reportStep("WebDriverException : \n" + e.getMessage(), "fail", false);
					}
			}
			
				reportStep(" DropDown Menus order Should be "+text,"info");

			}
			 
		
		
	}
		
		
	
}



