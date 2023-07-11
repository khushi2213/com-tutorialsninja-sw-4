package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By desktop = By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Desktops']");
    By allLaptopAndNoteBooks = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By component = By.xpath("//a[normalize-space()='Components']");
    By accountLogout = By.xpath("//h1[normalize-space()='Account Logout']");
    By myAccount = By.xpath("//h2[normalize-space()='My Account']");
    By currency = By.xpath("//span[contains(text(),'Currency')]");
    By currencyPound= By.xpath("//button[contains(text(),'£Pound Sterling')]");

    public void clickOnCurrencyChange(){

        clickOnElement(currency);
        clickOnElement(currencyPound);
    }


    public void selectMenu(String menu) {
        clickOnElement(By.xpath("//nav[@id='menu']//a[normalize-space()='" + menu + "']"));
    }

    public void mouseHoverAndClickOnDesktop() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(desktop);

    }

    public void mouseHoverAndClickOnLaptopAndNoteBooks() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(allLaptopAndNoteBooks);
    }

    public void mouseHoverAndClickOnComponent() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(component);
    }

    public String getAccountLogoutText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(accountLogout);
    }

    public String getMyAccountText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(myAccount);
    }

}