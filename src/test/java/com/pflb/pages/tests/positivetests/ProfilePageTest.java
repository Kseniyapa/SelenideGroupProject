package com.pflb.pages.tests.positivetests;


import com.pflb.pages.AuthorizationPage;
import com.pflb.pages.ProfilePage;
import com.pflb.pages.tests.configuration.SettingsForTests;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.page;

public class ProfilePageTest extends SettingsForTests {

    private static final String EXCEPTEDLOGIN = "testtempmail685";
    private static final String EXCEPTEDEMAIL = "testtempmail685@1secmail.org";
    private static final String PASSWORD = "NhBugH";
    private static final String EXCEPTEDFIO = "Ivan685";


    @BeforeClass
    public void authClient() {
        AuthorizationPage page = page(AuthorizationPage.class);
        page.authClient(EXCEPTEDEMAIL, PASSWORD);
    }

    @Test(priority = 1)
    public void checkValidEmail() {
        ProfilePage page = page(ProfilePage.class);
        page.clickProfileSettings();
        String actualTextFromFiledNameClient = page.getTextFromFiledNameClient();
        String actualTextFromFieldEmailClient = page.getTextFromFieldEmailClient();
        String actualTextFromFiledClientFIO = page.getTextFromFiledClientFIO();
        Assert.assertEquals(actualTextFromFiledNameClient, EXCEPTEDLOGIN);
        Assert.assertEquals(actualTextFromFieldEmailClient, EXCEPTEDEMAIL);
        Assert.assertEquals(actualTextFromFiledClientFIO, EXCEPTEDFIO);
    }

}
