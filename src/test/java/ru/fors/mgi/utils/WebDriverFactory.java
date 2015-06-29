package ru.fors.mgi.utils;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverFactory {

	/* Browsers constants */
	public static final String CHROME = "chrome";
	public static final String FIREFOX = "firefox";
	public static final String INTERNET_EXPLORER = "ie";
	public static final String PHANTOMJS = "phantomjs";
	public static final String HTML_UNIT = "htmlunit";

	private static WebDriver webDriver = null;


	public static WebDriver getInstance(Browser browser) {
		   	    
		DesiredCapabilities capability = new DesiredCapabilities();
		String browserName = browser.getName();
		capability.setJavascriptEnabled(true);
		
		if (webDriver != null) {
			return webDriver;
		}

		if (CHROME.equals(browserName)) {
			ChromeOptions options = new ChromeOptions();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("download.default_directory", "C:\\mgi_reports");
			options.addArguments("start-maximized");
			options.setExperimentalOption("prefs", prefs);
			capability = DesiredCapabilities.chrome();			
			capability.setCapability(ChromeOptions.CAPABILITY, options);
			webDriver = new ChromeDriver(capability);

		} else if (FIREFOX.equals(browserName)) {

			FirefoxProfile ffProfile = new FirefoxProfile();
			webDriver = new FirefoxDriver(ffProfile);

		} else if (INTERNET_EXPLORER.equals(browserName)) {
			webDriver = new InternetExplorerDriver();

		} else if (PHANTOMJS.equals(browserName)) {
			webDriver = new PhantomJSDriver();

		} else  {
				webDriver = new HtmlUnitDriver(true);
			}

		return webDriver;
	}

}