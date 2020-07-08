package com.pflb.pages.tests.positivetests;

import com.pflb.pages.AuthorizationPage;
import com.pflb.pages.tests.configuration.SettingsForTests;
import io.qameta.allure.Features;
import io.qameta.allure.Stories;
import org.testng.Assert;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.page;

public class AuthorizationTest extends SettingsForTests {
    /**
     * Данные ранее зарегистрированного клиента
     */
    private final static String EMAIL = "wibddmtssk@1secmail.com";
    private final static String PASSWORD = "PqxPZR";

    @Test
    public void authClient() {
        AuthorizationPage page = page(AuthorizationPage.class);
        page.authClient(EMAIL, PASSWORD);
        page.logoutClient();
        boolean logoutButton = page.isLogoutButton();
        Assert.assertTrue(logoutButton);
    }
}
