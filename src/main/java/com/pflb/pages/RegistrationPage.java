package com.pflb.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {


    /**
     * Локаторы для работы со страницей
     */

    private SelenideElement openWindowAuth = $(By.xpath("//*[@id=\"header-lk-button\"]"));

    private SelenideElement registrationButton = $(By.xpath("//div[1]/section[1]/label"));

    private SelenideElement toBeClient = $(By.cssSelector("[ng-tr=\"WHE1.WHE12\"]"));

    private SelenideElement fieldName = $(By.xpath("//*[@id=\"name\"]"));

    private SelenideElement fieldPosition = $(By.xpath("//*[@id=\"position\"]"));

    private SelenideElement fieldCompany = $(By.xpath("//*[@id=\"company\"]"));

    private SelenideElement fieldEmail = $(By.xpath("//*[@id=\"emails\"]"));

    private SelenideElement fieldPhone = $(By.xpath("//*[@id=\"phoneNumber\"]"));

    private SelenideElement toRegisterButton = $(By.xpath("//*[@id=\"form_register_customer\"]/button"));

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
