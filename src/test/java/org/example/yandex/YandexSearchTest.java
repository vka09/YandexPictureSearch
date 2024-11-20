package org.example.yandex;

import org.example.yandex.pageobjects.ImagesResultPage;
import org.example.yandex.pageobjects.ImagesStartPage;
import org.example.yandex.pageobjects.MainPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class YandexSearchTest extends DeclareClass {
    private final static String URL = "https://ya.ru/";

    private static MainPage mainPage = new MainPage(URL);
    private static ImagesStartPage imagesStartPage = new ImagesStartPage();
    private static ImagesResultPage imagesResultPage = new ImagesResultPage();


    private static final String pathToFile = System.getProperty("user.dir") + "/src/test/resources/pictures/";
    private static final String pictureName = "Трактор.jpeg";
    private static final String expectedWord = "трактор";

    @Test
    public void searchPictureTest() {
        MainPage mainPage = new MainPage(URL);
        mainPage.goToImagesSearch();
        imagesStartPage.setPathToPicture(pathToFile + pictureName);
        assertTrue(imagesResultPage.getTextsFromBullet().stream().anyMatch(text -> text.contains(expectedWord.toLowerCase())));
    }
}