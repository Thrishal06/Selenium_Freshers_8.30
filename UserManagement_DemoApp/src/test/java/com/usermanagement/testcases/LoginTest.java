package com.usermanagement.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.usermanagement.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void loginPageElementsAreDisplayed() {

        loginPg.checkCreateLink();

        Assert.assertTrue(
                loginPg.checkUnTf(),
                "Username field is not displayed"
        );

        Assert.assertTrue(
                loginPg.checkPwdTf(),
                "Password field is not displayed"
        );

        Assert.assertTrue(
                loginPg.checkLoginBtn(),
                "Login button is not displayed"
        );
    }
}
