package com.pflb.pages.tests.positivetests;

import com.pflb.pages.RegistrationPage;
import com.pflb.pages.tests.configuration.SettingsForTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

import static com.codeborne.selenide.Selenide.page;

public class RegistrationTest extends SettingsForTests {
    private final int randomNumber = new Random().nextInt(1000);
    /**
     * Регистрация с заранее подготовленными данными
     */
    private final String name = "Ivan" + randomNumber;
    private final String position = "Junoir";
    private final String company = "Perfomance";
    private final String email = "testforregistration" + randomNumber + "@1secmail.com";
    private final String phone = "79999999999";
    private static final String EXCEPTEDTEXTAFTERREGISTRATION = "Спасибо за регистрацию на UXCrowd!";

    @Test
    public void registrationClient() {
        RegistrationPage page = page(RegistrationPage.class);
        page.registrationNewClient(name, position, company, email, phone);
        String textAfterSuccessRegistration = page.getTextAfterSuccessRegistration();
        Assert.assertEquals(textAfterSuccessRegistration, EXCEPTEDTEXTAFTERREGISTRATION);
    }

}
