package com.pflb.pages.tests.positivetests;

import com.pflb.pages.AuthorizationPage;
import com.pflb.pages.tests.configuration.SettingsForTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class AuthorizationTest extends SettingsForTests {
    private final String email = "wibddmtssk@1secmail.com";
    private final String password = "PqxPZR";

    @Test(priority = 1)
    public void authClient() {
        AuthorizationPage page = page(AuthorizationPage.class);
        page.authClient(email, password);
        boolean logoutButton = page.isLogoutButton();
        Assert.assertTrue(logoutButton);

    }

    @Test(priority = 2)
    public void auth() {
        $(By.xpath("//*[@id=\"header-lk-button\"]")).shouldBe(visible).click();
        $(By.xpath("//*[@id=\"login\"]")).setValue(email);
        $(By.xpath("//*[@id=\"form_auth\"]/input[2]")).setValue(password);
        $(By.xpath("//*[@id=\"form_auth\"]/button")).click();
    }

}
