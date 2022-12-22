package com.framework.selenium.api.base;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrulanceDriverInstance {

	
	private static final ThreadLocal<RemoteWebDriver> remoteWebdriver = new ThreadLocal<RemoteWebDriver>();
	private static final ThreadLocal<WebDriverWait> wait = new ThreadLocal<WebDriverWait>();

	public static String folderName = "";
	public void setWait() {
		wait.set(new WebDriverWait(getDriver(), Duration.ofSeconds(60)));
	}

	public WebDriverWait getWait() {
		return wait.get();
	}

	public void setDriver(String browser, boolean headless) {
		//to create doc folder to keep download files
		String folderName = "doc";
		File folder = new File("./" + folderName); 
		if (!folder.exists()) { 
			folder.mkdir();
		}
		String property = System.getProperty("user.dir");
		System.out.println("Prp"+property);
		HashMap<String, Object> edgePrefs = new HashMap<String, Object>();
	    edgePrefs.put("download.default_directory", property+"\\"+folderName);		
		
		switch (browser) { 
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(false);
			options.addArguments("--start-maximized");
			options.addArguments("--disable-notifications");
			options.addArguments("--incognito");
			remoteWebdriver.set(new ChromeDriver(options));
			break;
		case "edge":
			EdgeOptions optionsEdge= new EdgeOptions();
			optionsEdge.setExperimentalOption("prefs", edgePrefs);
			remoteWebdriver.set(new EdgeDriver(optionsEdge));
			break;
		case "firefox":
			remoteWebdriver.set(new FirefoxDriver());
			break;
		case "ie":
			InternetExplorerOptions op = new InternetExplorerOptions();
			op.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
			op.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			op.introduceFlakinessByIgnoringSecurityDomains();
			op.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
			op.setCapability("browserstack.ie.enablePopups", "true");
			remoteWebdriver.set(new InternetExplorerDriver(op));
		default:
			break;
		}
	}

	public RemoteWebDriver getDriver() {
		return remoteWebdriver.get();
	}

}
