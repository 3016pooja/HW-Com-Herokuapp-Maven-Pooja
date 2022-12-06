package com.herokuapp.internet.testsuite;

import com.herokuapp.internet.pages.LoginPage;
import com.herokuapp.internet.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage=new LoginPage();



    @Test
    public void UserSholdLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickonLoginButton();
        loginPage.veirfyTextSecureArea();
        Assert.assertEquals(loginPage.veirfyTextSecureArea(),"Secure Area","Error message not displayed");

    }
    @Test
    public void verifyTheUsernameErrorMessage  (){
      loginPage.enterInvalidUsername();//Enter “tomsmith1” username
      loginPage.enterPassword();//Enter “SuperSecretPassword!” password
        loginPage.clickonLoginButton1();//Click on ‘LOGIN’ button
        loginPage.verifyErrorMessage(); //Verify the error message “Your username   is invalid!”
        String expectedErrorMessage = "Your username is invalid!\n" +
                "×";
        Assert.assertEquals(loginPage.verifyErrorMessage(),expectedErrorMessage,"Error message not displayed");
    }
    @Test
    public void verifyThePasswordErrorMessage(){
        loginPage.enterUserName();//Enter “tomsmith” username
        loginPage.enterInvalidPassword();//	Enter “SuperSecretPassword” password
        loginPage.clickonLoginButton1();//Click on ‘LOGIN’ button
        loginPage.verfiyTxtInvalidPassword();
        //Verify the error message “Your password   is invalid!”
        String expectedErrorMessage = "Your password is invalid!\n" +
                "×";
        Assert.assertEquals(loginPage.verifyErrorMessage(),expectedErrorMessage,"Error message not displayed");

    }

}
