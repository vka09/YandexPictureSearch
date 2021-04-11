package org.example.yandex;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DeclareClass {
  protected  static WebDriver driver;

  @BeforeAll
  public static void createDriver() {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
    driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
  }

  @AfterAll
  public static void closeDriver() {
    driver.quit();
  }
}
