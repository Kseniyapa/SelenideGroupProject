package com.pflb.pages.tests.positivetests;


import com.pflb.pages.AuthorizationPage;
import com.pflb.pages.RegistrationPage;
import com.pflb.pages.tests.configuration.SettingsForTests;
import dataemail.TempMail;
import org.testng.annotations.Test;

import java.util.Random;

import static com.codeborne.selenide.Selenide.page;

public class RegistrationAndAuthorizationTest extends SettingsForTests {
    private final int randomNumber = new Random().nextInt(1000);
    /**
     * Регистрация с заранее подготовленными данными
     */
    private final String name = "Ivan" + randomNumber;
    private final String position = "Junoir";
    private final String company = "Perfomance";
    private final String login = "testforregistration" + randomNumber;
    private final String endMail = "@1secmail.com";
    private final String phone = "79999999999";


    @Test(priority = 1)
    public void registrationNewClient() {
        RegistrationPage page = page(RegistrationPage.class);
        page.registrationNewClient(name, position, company, login + endMail, phone);
    }

    @Test(priority = 2)
    public void authorizationNewClient() {
        TempMail tempmail = page(TempMail.class);
        String idMessage = tempmail.checkMail(login);
        String passwordFromMessage = tempmail.getPasswordFromMessage(login, idMessage);
        AuthorizationPage page = page(AuthorizationPage.class);
        page.authClient(login + endMail, passwordFromMessage);
    }
}
