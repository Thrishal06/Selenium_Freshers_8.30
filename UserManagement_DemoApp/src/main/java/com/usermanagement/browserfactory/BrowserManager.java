package com.usermanagement.browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BrowserManager {
	private WebDriver driver;
	public WebDriver initDriver(String BrowserName) {
		switch (BrowserName) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		default:
			Reporter.log("---Invalid Browser passed---");
			Reporter.log("---Supports only chrome / firefox / edge---");
			break;
		}
		return driver;
	}
}
