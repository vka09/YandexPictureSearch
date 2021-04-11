package org.example.yandex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class PageObject {
    protected static WebDriver driver;

    public PageObject (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void switchToNewTab(WebDriver driver) {
        String oldTab = driver.getWindowHandle();
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
    }
}
