package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;


public class ShoppingCartPage extends Utility {
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By productText = By.xpath("(//a[contains(text(),'HP LP3065')])[2]");
    By mackBookText = By.xpath("(//a[contains(text(),'MacBook')])[2]");
    By modelText = By.xpath("//td[normalize-space()='Product 21']");
    By deliveryDateText = By.xpath("(//small)[2]");
    By QuantityFieldclear = (By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]"));
    By quantity = By.xpath("//input[contains(@name,'quantity')]");
    By updateButton = By.xpath("//i[@class='fa fa-refresh']");
    By successText = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By priceText = By.xpath("(//td[@class='text-right'][normalize-space()='$122.00'])[4]");
    By mackBookPriceText = By.xpath("(//td[@class='text-right'][normalize-space()='$1,204.00'])[3]");
    By checkOut = By.xpath("//a[@class='btn btn-primary']");

    public String getShoppingCartText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(shoppingCartText);
    }

    public String getProductText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(productText);
    }

    public String getMackBookText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(mackBookText);
    }

    public String getModelText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(modelText);
    }

    public String getDeliveryDateText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(deliveryDateText);
    }

    public String getPriceText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(priceText);
    }

    public void updateQuantity(String value) throws InterruptedException {
        driver.findElement(QuantityFieldclear).clear();
        Thread.sleep(1000);
        sendTextToElement(quantity, value);
        clickOnElement(updateButton);
    }

    public String getSuccessText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(successText);
    }

    public String getMackBookPriceText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(mackBookPriceText);
    }

    public void clickOnCheckOutButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(checkOut);
    }
}
