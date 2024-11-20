package org.example.yandex.pageobjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage  {
    private final SelenideElement touchBar = $x("//a[@aria-label='Сервисы']");
    private final SelenideElement buttonImages = $x("//a[@aria-label='Картинки']");

    public MainPage(String url) {
        Selenide.open(url);
    }

    public void goToImagesSearch() {
        touchBar.click();
        buttonImages.click();
        Selenide.switchTo().window(1);
    }
}
