package org.example.yandex.pageobjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class ImagesStartPage {
    private final SelenideElement buttonSearchByImage = $x("//button[contains(@class, 'input__cbir-button')]");
    private final SelenideElement fieldForInputFile = $x("//input[@type='file']");

    public void setPathToPicture(String path) {
        buttonSearchByImage.click();
        //fieldForInputFile.shouldBe(Condition.visible, Duration.ofSeconds(10));
        fieldForInputFile.sendKeys(path);
    }
}