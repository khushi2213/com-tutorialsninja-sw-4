package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ComponentPage extends Utility {

    By componentText= By.xpath("//h2[normalize-space()='Components']");

    public String getComponentText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(componentText);
    }


}
