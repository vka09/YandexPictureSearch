package org.example.yandex.pageobjects;

import org.example.yandex.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public static final String URL = "https://yandex.ru/";

    @FindBy(xpath = "//div[text()='Картинки']")
    public WebElement buttonImages;

    public void goToImagesSearch() {
        buttonImages.click();
    }
}
