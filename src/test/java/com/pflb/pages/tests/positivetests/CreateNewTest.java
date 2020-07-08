package com.pflb.pages.tests.positivetests;

import com.pflb.pages.AuthorizationPage;
import com.pflb.pages.CreateNewTestPage;
import com.pflb.pages.tests.configuration.SettingsForTests;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.page;

public class CreateNewTest extends SettingsForTests {
    private static final String EXCEPTEDTEXTAFTERCREATENEWTEST = "Ура! Тест создан и отправлен пользователям.";
    private static final String EXCEPTEDEMAIL = "fasdsfafs@1secmail.com";
    private static final String PASSWORD = "3g1WCq";
    private static final String NAMETEST = "AVANGARD";
    private static final String WEBSITE = "test.uxcrowd.ru";
    private static final String NAMESEGMENT = "SEGMENT";
    private static final String QUESTION = "added new question";

    @BeforeClass
    public void authClient() {
        AuthorizationPage page = page(AuthorizationPage.class);
        page.authClient(EXCEPTEDEMAIL, PASSWORD);
    }

    @Test
    public void createNewTest() {
        CreateNewTestPage page = page(CreateNewTestPage.class);
        page.createNewTest(NAMETEST, WEBSITE, NAMESEGMENT, QUESTION);
        String textAfterCreateNewTest = page.getTextAfterCreateNewTest();
        Assert.assertEquals(textAfterCreateNewTest, EXCEPTEDTEXTAFTERCREATENEWTEST);

    }

}

