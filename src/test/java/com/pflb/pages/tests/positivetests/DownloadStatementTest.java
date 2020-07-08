package com.pflb.pages.tests.positivetests;

import com.pflb.pages.DownloadStatementAsPdf;
import com.pflb.pages.RegistrationPage;
import com.pflb.pages.tests.configuration.SettingsForTests;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.page;

public class DownloadStatementTest extends SettingsForTests {
    @Test
    public void downloadPDF() {
        DownloadStatementAsPdf page = page(DownloadStatementAsPdf.class);
        page.downloadStatementAsPdf();
    }
}
