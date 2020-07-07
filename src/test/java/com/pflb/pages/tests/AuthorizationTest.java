package com.pflb.pages.tests;

import com.pflb.pages.AuthorizationPage;
import org.testng.annotations.Test;


public class AuthorizationTest {
    private static final String URL = "https://test.uxcrowd.ru/";
    private final String email = "wibddmtssk@1secmail.com";
    private final String password = "PqxPZR";

    @Test
    public void authClient() {
        AuthorizationPage authorizationPage = AuthorizationPage.openBrowser(URL);
        authorizationPage.authClient(email, password);

    }


}
