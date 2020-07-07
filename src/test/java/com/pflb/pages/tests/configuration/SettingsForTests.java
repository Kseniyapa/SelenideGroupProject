package com.pflb.pages.tests.configuration;

import com.codeborne.selenide.Config;
import com.codeborne.selenide.SelenideConfig;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class SettingsForTests {
    private static final String URL = "https://test.uxcrowd.ru/";

    @BeforeTest
    public void openSession() {
        open(URL);
    }


    @AfterTest
    public void closeSession() {
        closeWebDriver();
    }
}
