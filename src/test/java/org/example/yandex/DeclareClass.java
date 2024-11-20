package org.example.yandex;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


abstract public class DeclareClass {
  public static void setUp() {
    WebDriverManager.chromedriver().setup();
    Configuration.browser = "chrome";
    Configuration.browserSize = "1600x1000";
    Configuration.headless = false;
  }

  @BeforeAll
  public static void init() {
    setUp();
  }

  @AfterAll
  public static void tearDown() {
    Selenide.closeWebDriver();
  }
}