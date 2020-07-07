package com.pflb.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.visible;

public class ProfilePage {


    /**
     * Локаторы для работы со страницей
     */

    @FindBy(how = How.XPATH, using = "//*[@id=\"top\"]//section[2]/div")
    private SelenideElement profileSettings;

    @FindBy(css = "[ng-model=\"customerProfile.username\"]")
    private SelenideElement fieldNameClient;

    @FindBy(css = "[ng-model=\"customerProfile.email\"]")
    private SelenideElement fieldEmailClient;

    @FindBy(css = "[required-error-message=\"Введите ФИО\"]")
    private SelenideElement fieldClientFIO;

    /**
     * Метод ожидает появление и нажимает на кнопку.
     */

    public void clickProfileSettings() {
        profileSettings.shouldBe(visible).click();
    }

    /**
     * Метод возвращает актуальный логин клиента.
     */

    public String getTextFromFiledNameClient() {
        return fieldNameClient.getValue();
    }

    /**
     * Метод возвращает актуальную почта клиента.
     */

    public String getTextFromFieldEmailClient() {
        return fieldEmailClient.getValue();
    }

    /**
     * Метод возвращает актуальное имя клиента.
     */

    public String getTextFromFiledClientFIO() {
        return fieldClientFIO.getValue();
    }

}
