package com.pflb.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class AuthorizationPage {


    @FindBy(how = How.XPATH, using = "//*[@id=\"header-lk-button\"]")
    private SelenideElement openWindowAuth;
    @FindBy(how = How.XPATH, using = "//*[@id=\"login\"]")
    private SelenideElement fieldEmail;
    @FindBy(how = How.XPATH, using = "//*[@id=\"form_auth\"]/input[2]")
    private SelenideElement fieldPassword;
    @FindBy(how = How.XPATH, using = "//*[@id=\"form_auth\"]/button")
    private SelenideElement buttonEnter;
    @FindBy(how = How.XPATH ,using = "//*[@id=\"logout\"]")
    private SelenideElement logoutClient;


    public void authClient(String email, String password) {
        openFormAuth();
        fieldEmail.setValue(email);
        fieldPassword.setValue(password);
        buttonEnter.shouldBe(visible).pressEnter();
        logoutClient.shouldBe(visible).click();
    }

    private void openFormAuth() {
        openWindowAuth.shouldBe(visible).click();
    }

    public static AuthorizationPage openBrowser(String url) {
        return open(url, AuthorizationPage.class);
    }


}
