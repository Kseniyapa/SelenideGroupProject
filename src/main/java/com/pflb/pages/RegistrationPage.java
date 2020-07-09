package com.pflb.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RegistrationPage {


    /**
     * Локаторы для работы со страницей
     */

    private SelenideElement openWindowAuth = $x("//*[@id=\"header-lk-button\"]"); // Открыть окно Вход/Регистрации.

    private SelenideElement registrationButton = $("[ng-tr=\"WHE.WHE20\"]"); // Кнопка "Зарегистрироваться"

    private SelenideElement toBeClient = $("[ng-tr=\"WHE1.WHE12\"]"); // Кнопка "Стать клиентом".

    private SelenideElement fieldName = $x("//*[@id=\"name\"]"); // Поле для ввода "Имени клиента".

    private SelenideElement fieldPosition = $x("//*[@id=\"position\"]"); // Поле для ввода "Позиции клиента".

    private SelenideElement fieldCompany = $x("//*[@id=\"company\"]"); // Поле для ввода "Компании клиента".

    private SelenideElement fieldEmail = $x("//*[@id=\"emails\"]"); // Поле для ввода "Почты клиента".

    private SelenideElement fieldPhone = $x("//*[@id=\"phoneNumber\"]"); // Поле для ввода "Телефона клиента".

    private SelenideElement toRegisterButton = $x("//*[@id=\"form_register_customer\"]/button"); // Кнопка "Заренистрироваться".

    private SelenideElement textAfterSuccessRegistrationClient = $x("//*[@id=\"top\"]/div[2]//div[2]/div/div"); // Текст псоле успешной регистрации.


    /**
     * Метод для возврата текста.
     *
     * @return Текст после успешной регистрации.
     */
    public String getTextAfterSuccessRegistration() {
        return textAfterSuccessRegistrationClient.shouldBe(visible).getText();
    }

    /**
     * Метод регистрирует нового клиента.
     *
     * @param name     Имя пользователя.
     * @param position Позиция пользователя.
     * @param company  Компания пользователя.
     * @param email    Почта пользователя.
     * @param phone    Телефон пользователя.
     */
    public void registrationNewClient(String name, String position, String company, String email, String phone) {
        openWindowAuth.shouldBe(visible).click();
        registrationButton.shouldBe(visible).click();
        toBeClient.shouldBe(visible).click();
        fieldName.shouldBe(visible).setValue(name);
        fieldPosition.setValue(position);
        fieldCompany.setValue(company);
        fieldEmail.setValue(email);
        fieldPhone.setValue(phone);
        toRegisterButton.click();
    }
}
