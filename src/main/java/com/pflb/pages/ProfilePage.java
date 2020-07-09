package com.pflb.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ProfilePage {


    /**
     * Локаторы для работы со страницей
     */

    private SelenideElement profileSettings = $x("//*[@id=\"top\"]//section[2]/div"); // Кнопка "Профиль".

    private SelenideElement fieldLoginClient = $("[ng-model=\"customerProfile.username\"]"); // Поле логина клиента.

    private SelenideElement fieldEmailClient = $("[ng-model=\"customerProfile.email\"]"); // Поле почты клиента.

    private SelenideElement fieldClientFIO = $("[required-error-message=\"Введите ФИО\"]"); // Поле имени клиента.

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
        return fieldLoginClient.shouldBe(visible).getValue();
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
