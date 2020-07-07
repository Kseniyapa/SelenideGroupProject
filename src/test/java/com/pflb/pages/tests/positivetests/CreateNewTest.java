package com.pflb.pages.tests.positivetests;

import com.pflb.pages.AuthorizationPage;
import com.pflb.pages.ProfilePage;
import com.pflb.pages.CreateNewTestPage;
import com.pflb.pages.tests.configuration.SettingsForTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.page;

public class CreateNewTest extends SettingsForTests {
    private static final String EXCEPTEDEMAIL = "testtempmail685@1secmail.org";
    private static final String PASSWORD = "NhBugH";
    /**
     * Заранее подготовленные данные
     */
    private final String testName = "test";
    private final String webSite = "test.com";
    private final String nameSegment = "Perfomance";
    private final String voiceResponse = "testTest";

    @BeforeClass
    public void authClient() {
        AuthorizationPage page = page(AuthorizationPage.class);
        page.authClient(EXCEPTEDEMAIL, PASSWORD);
    }

    @Test
    public void createNewTest() {
        CreateNewTestPage page = page(CreateNewTestPage.class);
        page.createNewTest(testName, webSite, nameSegment, voiceResponse);
    }

}

