package org.example.yandex.pageobjects;

import org.example.yandex.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ImagesStartPage extends PageObject {

    public ImagesStartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class,'input__button')]")
    public WebElement buttonSearchByImage;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement fieldForInputFile;

    @FindBy(xpath = "//input[@placeholder='Введите адрес изображения']")
    public WebElement fieldForInputPath;


    public void setPathToPicture(String path) {
        buttonSearchByImage.click();
        fieldForInputFile.sendKeys(path);
    }

}
