package com.usermanagement.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.usermanagement.base.BaseTest;

public class LoginTest extends BaseTest	{
	@Test
	public void validLoin() {
		loginPg.checkCreateLink();
		boolean checkUnTf = loginPg.checkUnTf();
		Assert.assertTrue(checkUnTf);
		Reporter.log("CheckUnTf test case is pass", true);
		
		boolean checkPwdTf = loginPg.checkPwdTf();
		Assert.assertTrue(checkPwdTf);
		Reporter.log("CheckPwdTf test case is pass", true);
		
		boolean checkLogin = loginPg.checkLoginBtn();
		Assert.assertTrue(checkLogin);
		Reporter.log("CheckLoginBtn test case is pass", true);
	}
}
