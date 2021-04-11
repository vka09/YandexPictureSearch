package org.example.yandex.pageobjects;

import org.example.yandex.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ImagesResultPage extends PageObject {

    public ImagesResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='CbirItem CbirTags']//span")
    public List<WebElement> suggestedNames;

    public List<String> getTextsFromBullet() {
        List<String> suggestedText = new ArrayList<>();
        for (WebElement name : suggestedNames) {
            suggestedText.add(name.getText().toLowerCase());
        }
        return suggestedText;
    }
}
