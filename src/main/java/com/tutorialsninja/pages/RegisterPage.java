package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerAccount = By.xpath("//h1[normalize-space()='Register Account']");
    By accountCreatedText = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
    By firstName = By.xpath("//input[@id='input-firstname']");
    By lastName = By.xpath("//input[@id='input-lastname']");
    By email = By.xpath("//input[@id='input-email']");
    By telephone = By.xpath("//input[@id='input-telephone']");
    By password = By.xpath("//input[@id='input-password']");
    By confirmPassword = By.xpath("//input[@id='input-confirm']");
    By agree = By.xpath("//input[@name='agree']");
    By continueButton = By.xpath("//input[@value='Continue']");


    public String getRegisterAccountText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(registerAccount);
    }

    public void enterFirstName(String firstnNme) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(firstName, firstnNme);
    }

    public void enterLastName(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(lastName, value);
    }

    public void enterEmail(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(email, value);
    }

    public void enterPhoneNumber(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(telephone, value);
    }

    public void enterPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(password, value);
    }

    public void enterConfirmPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(confirmPassword, value);
    }

    public void selectSubscribeButton(String vaule) throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(By.xpath("//label[normalize-space()='" + vaule + "']"));
    }

    public void clickOnAgree() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(agree);
    }

    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(continueButton);
    }

    public String getAccountCreatedText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(accountCreatedText);
    }
}
