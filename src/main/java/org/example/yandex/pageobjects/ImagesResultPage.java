package org.example.yandex.pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ImagesResultPage {

    private final SelenideElement tagPanel = $x("//section[@class='CbirSection CbirTags']");
    private final ElementsCollection suggestedNamesFirst = $$x(tagPanel + "//span");
    private final ElementsCollection suggestedNames = $$x("//section[@class='CbirSection CbirTags']//span");

    public List<String> getTextsFromBullet() {
        tagPanel.shouldBe(visible, Duration.ofSeconds(10));
        List<String> suggestedText = new ArrayList<>();
        for (SelenideElement name : suggestedNames) {
            suggestedText.add(name.getText().toLowerCase());
        }
        return suggestedText;
    }
}