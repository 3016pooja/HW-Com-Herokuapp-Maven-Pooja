package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By username=By.name("username");
    By password=By.name("password");
    By loginButton=By.xpath("//i[contains(text(),'Login')]");
    By verifytext2=By.xpath("//body[1]/div[2]/div[1]/div[1]/h2[1]");
    By invalidUsername=By.name("username");
    By errorMessage=By.xpath("//div[@class='flash error']");
    By invalidPassword=By.name("password");
    By verifyText3=By.xpath("//div[@class='flash error']");
    public void enterUserName(){
        sendTextToElement(username,"tomsmith");    //Enter “tomsmith” username
    }
    public void enterPassword(){
        sendTextToElement(password,"SuperSecretPassword!");//Enter “SuperSecretPassword!” password
    }
    public void clickonLoginButton(){
        clickOnElement(loginButton);   //Click on ‘LOGIN’ button
    }
    public String veirfyTextSecureArea(){
        return getTextFromElement(verifytext2);
        //	Verify the text “Secure Area”
    }
    public void enterInvalidUsername(){
        sendTextToElement(invalidUsername,"tomsmith1");
    }                                           //Enter “tomsmith1” username

    //	Enter “SuperSecretPassword!” password
    public void enterValidPassowrd(){
        sendTextToElement(password,"SuperSecretPassword!");
    }
    public void clickonLoginButton1(){
        clickOnElement(loginButton);   //Click on ‘LOGIN’ button
    }
    public String verifyErrorMessage(){//Verify the error message “Your username   is invalid!”
        return getTextFromElement(errorMessage);
    }
    public void enterInvalidPassword(){
        sendTextToElement(invalidPassword,"SuperSecretPassword");//	Enter “SuperSecretPassword” password
    }
   public String verfiyTxtInvalidPassword(){
        return getTextFromElement(invalidPassword);
   }

//Verify the error message “Your password   is invalid!”





}