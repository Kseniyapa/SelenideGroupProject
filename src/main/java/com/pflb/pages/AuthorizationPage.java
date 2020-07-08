package com.pflb.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage {

    /**
     * Локаторы для работы со страницей
     */

    private SelenideElement openWindowAuth = $(By.xpath("//*[@id=\"header-lk-button\"]")); // Кнопка открытия окна "Вход/Регистрация".

    private SelenideElement fieldEmail = $(By.xpath("//*[@id=\"login\"]")); // Поле для ввода почты клиента.

    private SelenideElement fieldPassword = $(By.xpath("//*[@id=\"form_auth\"]/input[2]")); // Поле для ввода пароля клиента.

    private SelenideElement enterButton = $(By.xpath("//*[@id=\"form_auth\"]/button")); // Кнопка "Войти" в профиль клиента.

    private SelenideElement logoutButton = $(By.xpath("//*[@id=\"logout\"]")); // Кнопка "Выйти" в профиль клиента.


    /**
     * Метод проверяет отображается ли кнопка на странице профиля.
     *
     * @return true , если такая кнопка есть на странице
     */

    public boolean isLogoutButton() {
        return logoutButton.isDisplayed();
    }

    /**
     * Метод авторизации клиента
     * @param email     - валидный емайл клиента
     * @param password- валидный пароль
     * Метод авторизирует клиента.
     */

    public void authClient(String email, String password) {
        openFormAuth();
        fieldEmail.setValue(email);
        fieldPassword.setValue(password);
        enterButton.shouldBe(visible).pressEnter();
    }

    /**
     * Метод нажимает кнопку "Выйти".
     */

    public void logoutClient() {
        logoutButton.shouldBe(visible).click();
    }

    /**
     * Метод открывает форму для авторизации.
     */

    public void openFormAuth() {
        openWindowAuth.shouldBe(visible).click();
    }


}
