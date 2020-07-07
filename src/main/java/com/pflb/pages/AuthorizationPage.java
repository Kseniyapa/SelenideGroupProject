package com.pflb.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.visible;

public class AuthorizationPage {

    /**
     * Локаторы для работы со страницей
     */

    @FindBy(how = How.XPATH, using = "//*[@id=\"header-lk-button\"]")
    private SelenideElement openWindowAuth; // // Кнопка открытия окна "Вход/Регистрация".

    @FindBy(how = How.XPATH, using = "//*[@id=\"login\"]")
    private SelenideElement fieldEmail; // Поле для ввода почты клиента.

    @FindBy(how = How.XPATH, using = "//*[@id=\"form_auth\"]/input[2]")
    private SelenideElement fieldPassword; // Поле для ввода пароля клиента.

    @FindBy(how = How.XPATH, using = "//*[@id=\"form_auth\"]/button")
    private SelenideElement enterButton; // Кнопка "Войти" в профиль клиента.

    @FindBy(how = How.XPATH, using = "//*[@id=\"logout\"]")
    private SelenideElement logoutButton; // Кнопка "Выйти" в профиль клиента.


    /**
     * Метод проверяет отображается ли кнопка на странице профиля.
     */

    public boolean isLogoutButton() {
        return logoutButton.isDisplayed();
    }

    /**
     * Метод авторизации клиента
     * @param email - валидный емайл клиента
     * @param password- валидный пароль
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

    private void openFormAuth() {
        openWindowAuth.shouldBe(visible).click();
    }


}
