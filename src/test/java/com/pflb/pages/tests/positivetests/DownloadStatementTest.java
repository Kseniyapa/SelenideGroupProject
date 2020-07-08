package com.pflb.pages.tests.positivetests;

import com.pflb.pages.DownloadStatementAsPdf;
import com.pflb.pages.RegistrationPage;
import com.pflb.pages.tests.configuration.SettingsForTests;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.page;

public class DownloadStatementTest extends SettingsForTests {
    @Test
    public void registrationClient() {
        DownloadStatementAsPdf page = page(DownloadStatementAsPdf.class);
        page.downloadStatementAsPdf();
    }
}
