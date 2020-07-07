package com.pflb.pages.tests.positivetests;

import com.pflb.pages.AuthorizationPage;
import com.pflb.pages.CreateNewTestPage;
import com.pflb.pages.RegistrationPage;
import com.pflb.pages.tests.configuration.SettingsForTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.page;

public class CreateNewTest extends SettingsForTests {
    @BeforeClass
    public void auth(){}

    @Test
    public void createNewTest() {
        CreateNewTestPage page = page(CreateNewTestPage.class);
        page.createNewTest();
    }

}

