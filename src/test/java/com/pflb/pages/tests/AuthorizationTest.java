package com.pflb.pages.tests;

import com.pflb.pages.AuthorizationPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AuthorizationTest {
    private static final String URL = "https://test.uxcrowd.ru/";
    private final String email = "wibddmtssk@1secmail.com";
    private final String password = "PqxPZR";

    @Test(priority = 1)
    public void authClient() {
        AuthorizationPage authorizationPage = AuthorizationPage.openBrowser(URL);
        authorizationPage.authClient(email, password);
    }

    @Test(priority = 2)
    public void auth() {
        AuthorizationPage.openBrowser(URL);
        $(By.xpath("//*[@id=\"header-lk-button\"]")).shouldBe(visible).click();
        $(By.xpath("//*[@id=\"login\"]")).setValue(email);
        $(By.xpath("//*[@id=\"form_auth\"]/input[2]")).setValue(password);
        $(By.xpath("//*[@id=\"form_auth\"]/button")).click();
    }

}
