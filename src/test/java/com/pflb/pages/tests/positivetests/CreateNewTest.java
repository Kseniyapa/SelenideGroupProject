package com.pflb.pages.tests.positivetests;

import com.pflb.pages.AuthorizationPage;
import com.pflb.pages.CreateNewTestPage;
import com.pflb.pages.RegistrationPage;
import com.pflb.pages.tests.configuration.SettingsForTests;
import dataemail.TempMail;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.Random;

import static com.codeborne.selenide.Selenide.page;

public class CreateNewTest extends SettingsForTests {
    /**
     * Создание нового теста с подготовленными данными.
     */
    private static final String EXCEPTEDTEXTAFTERCREATENEWTEST = "Ура! Тест создан и отправлен пользователям.";
    private static final String NAMETEST = "AVANGARD";
    private static final String WEBSITE = "test.uxcrowd.ru";
    private static final String NAMESEGMENT = "SEGMENT";
    private static final String QUESTION = "added new question";
    private final int randomNumber = new Random().nextInt(1000);
    /**
     * Регистрация с заранее подготовленными данными
     */
    private final String name = "Ivan" + randomNumber;
    private final String position = "Junoir";
    private final String company = "Perfomance";
    private final String login = "testforregistration" + randomNumber + "@1secmail.com";
    private final String phone = "79999999999";


    @BeforeClass
    public void registrationNewClient() {
        RegistrationPage registrationPage = page(RegistrationPage.class);
        registrationPage.registrationNewClient(name, position, company, login, phone);

        TempMail tempmail = page(TempMail.class);
        String idMessage = tempmail.checkMail(login);
        String passwordFromMessage = tempmail.getPasswordFromMessage(login, idMessage);

        AuthorizationPage authorizationPage = page(AuthorizationPage.class);
        authorizationPage.authClient(login, passwordFromMessage);
    }


    @Test
    public void createNewTest() {
        CreateNewTestPage page = page(CreateNewTestPage.class);
        page.createNewTest(NAMETEST, WEBSITE, NAMESEGMENT, QUESTION);
        String textAfterCreateNewTest = page.getTextAfterCreateNewTest();
        Assert.assertEquals(textAfterCreateNewTest, EXCEPTEDTEXTAFTERCREATENEWTEST);

    }

}

