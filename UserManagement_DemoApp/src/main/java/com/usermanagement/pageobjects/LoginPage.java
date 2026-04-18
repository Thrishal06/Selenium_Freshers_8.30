package com.usermanagement.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class LoginPage {
	private WebDriver driver;
	final private By usnTF=By.id("username");
	final private By pwdTF=By.id("password");
	final private By loginBtn=By.id("button-login-submit");
	final private By createLink=By.id("link-login-to-register");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void checkCreateLink() {
		if(driver.findElement(createLink).isDisplayed()) {
			Reporter.log("Create link is displayed", true);
		}
		else{
//			Repolog("Craete link is not displayed", true);	
			Reporter.log("Create link is not displayed", true);
		}
	}
	public boolean checkUnTf() {
		return driver.findElement(usnTF).isDisplayed();
	}
	public boolean checkPwdTf() {
		return driver.findElement(pwdTF).isDisplayed();
	}
	public boolean checkLoginBtn() {
		return driver.findElement(loginBtn).isDisplayed();
	}
}

