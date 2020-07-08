package com.pflb.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {


    /**
     * Локаторы для работы со страницей
     */

    private SelenideElement profileSettings = $(By.xpath("//*[@id=\"top\"]//section[2]/div"));

    private SelenideElement fieldNameClient = $(By.cssSelector("[ng-model=\"customerProfile.username\"]"));

    private SelenideElement fieldEmailClient = $(By.cssSelector("[ng-model=\"customerProfile.email\"]"));

    private SelenideElement fieldClientFIO = $(By.cssSelector("[required-error-message=\"Введите ФИО\"]"));

    /**
     * Метод ожидает появление и нажимает на кнопку.
     */

    public void clickProfileSettings() {
        profileSettings.shouldBe(visible).click();
    }

    /**
     * Метод возвращает строку.
     *
     * @return Актуальный логин клиента.
     */

    public String getTextFromFiledNameClient() {
        return fieldNameClient.shouldBe(visible).getValue();
    }

    /**
     * Метод возвращает строку.
     *
     * @return Актуальную почту клиента.
     */

    public String getTextFromFieldEmailClient() {
        return fieldEmailClient.getValue();
    }

    /**
     * Метод возвращает строку.
     *
     * @return Актуальное имя клиента.
     */

    public String getTextFromFiledClientFIO() {
        return fieldClientFIO.getValue();
    }

}
