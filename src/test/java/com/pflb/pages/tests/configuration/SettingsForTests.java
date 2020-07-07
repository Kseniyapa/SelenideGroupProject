package com.pflb.pages.tests.configuration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class SettingsForTests {
    private static final String URL = "https://test.uxcrowd.ru/";

    @BeforeClass
    public void openSession() {
        open(URL);
    }


    @AfterClass
    public void closeSession() {
        closeWebDriver();
    }
}
