package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By checkOutText = By.xpath("//h1[normalize-space()='Checkout']");
    By newCustomerText = By.xpath("//h2[normalize-space()='New Customer']");
    By guestCheckOut = By.xpath("//input[@value='guest']");
    By continueButton = By.xpath("//input[@id='button-account']");
    By firstName = By.xpath("//input[@id='input-payment-firstname']");
    By lastName = By.xpath("//input[@id='input-payment-lastname']");
    By email = By.xpath("//input[@id='input-payment-email']");
    By telephone = By.xpath("//input[@id='input-payment-telephone']");
    By address1 = By.xpath("//input[@id='input-payment-address-1']");
    By city = By.xpath("//input[@id='input-payment-city']");
    By postcode = By.xpath("//input[@id='input-payment-postcode']");
    By country = By.xpath("//select[@id='input-payment-country']");
    By region = By.xpath("//select[@id='input-payment-zone']");
    By comments = By.xpath("//textarea[@name='comment']");
    By agree = By.xpath("//input[@name='agree']");
    By warningText = By.xpath("//div[@class='alert alert-warning alert-dismissible']");
    By guestContinueButton = By.xpath("//input[@id='button-guest']");


    public String getCheckOutText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(checkOutText);
    }


    public String getNewCustomerText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(newCustomerText);
    }


    public void clickOnGuestCheckOut() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(guestCheckOut);
    }


    public void clickOnContinueButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(continueButton);
    }


    public void enterFirstName(String firstnNme) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(firstName, firstnNme);
    }


    public void enterLastName(String name) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(lastName, name);
    }


    public void enterEmail(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(email, value);
    }


    public void enterPhoneNumber(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(telephone, value);
    }


    public void enterAddress1(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(address1, value);
    }


    public void enterCity(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(city, value);
    }


    public void enterPostCode(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(postcode, value);
    }


    public void selectCountry(String value) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(country, value);
    }


    public void selectRegion(String value) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(region, value);
    }


    public void clickOnGuestContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(guestContinueButton);
    }


    public void enterComments(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(comments, value);
    }


    public void clickOnAgree() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(agree);
    }


    public String getPaymentWarningText() throws InterruptedException {
        Thread.sleep(2000);
        return  getTextFromElement(warningText);
    }
}
