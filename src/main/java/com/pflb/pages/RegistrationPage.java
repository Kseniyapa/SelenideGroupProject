package com.pflb.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.visible;

public class RegistrationPage {


    /**
     * Локаторы для работы со страницей
     */

    @FindBy(how = How.XPATH, using = "//*[@id=\"header-lk-button\"]")
    private SelenideElement openWindowAuth;

    @FindBy(how = How.XPATH, using = "//div[1]/section[1]/label")
    private SelenideElement registrationButton;

    @FindBy(how = How.CSS, using = "[ng-tr=\"WHE1.WHE12\"]")
    private SelenideElement toBeClient;

    @FindBy(how = How.XPATH, using = "//*[@id=\"name\"]")
    private SelenideElement fieldName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"position\"]")
    private SelenideElement fieldPosition;

    @FindBy(how = How.XPATH, using = "//*[@id=\"company\"]")
    private SelenideElement fieldCompany;

    @FindBy(how = How.XPATH, using = "//*[@id=\"emails\"]")
    private SelenideElement fieldEmail;

    @FindBy(how = How.XPATH, using = "//*[@id=\"phoneNumber\"]")
    private SelenideElement fieldPhone;

    @FindBy(how = How.XPATH, using = "//*[@id=\"form_register_customer\"]/button")
    private SelenideElement toRegisterButton;

    /**
     * Метод регистрирует нового клиента.
     * @param email - валидный емайл клиента
     * @param company - компания
     * @param phone - номер телефона клиента
     * @param position - должность
     * @param name - имя клиента
     */
    public void registrationNewClient(String name, String position, String company, String email, String phone) {
        openWindowAuth.shouldBe(visible).click();
        toBeClient.shouldBe(visible).click();
        fieldName.shouldBe(visible).setValue(name);
        fieldPosition.setValue(position);
        fieldCompany.setValue(company);
        fieldEmail.setValue(email);
        fieldPhone.setValue(phone);
        toRegisterButton.click();
    }
}
