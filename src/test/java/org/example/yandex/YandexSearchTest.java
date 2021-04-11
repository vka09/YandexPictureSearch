package org.example.yandex;

import org.example.yandex.pageobjects.ImagesResultPage;
import org.example.yandex.pageobjects.ImagesStartPage;
import org.example.yandex.pageobjects.MainPage;
import org.junit.jupiter.api.Test;

import static org.example.yandex.PageObject.switchToNewTab;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YandexSearchTest extends DeclareClass {
    private static MainPage mainPage = new MainPage(driver);
    private static ImagesStartPage imagesStartPage = new ImagesStartPage(driver);
    private static ImagesResultPage imagesResultPage = new ImagesResultPage(driver);

    private static final String pathToFile = System.getProperty("user.dir") + "/src/test/resources/pictures/";
    private static final String pictureName = "Трактор.jpeg";
    private static final String expectedWord = "трактор";

    @Test
    public void searchPictureTest() {
        driver.get(MainPage.URL);
        mainPage.goToImagesSearch();
        switchToNewTab(driver);
        imagesStartPage.setPathToPicture(pathToFile + pictureName);
        assertTrue(imagesResultPage.getTextsFromBullet().stream().anyMatch(text -> text.contains(expectedWord.toLowerCase())));
    }
}
