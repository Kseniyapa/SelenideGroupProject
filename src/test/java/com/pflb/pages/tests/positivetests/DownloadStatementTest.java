package com.pflb.pages.tests.positivetests;

import com.pflb.pages.DownloadStatementAsPdf;
import com.pflb.pages.tests.configuration.SettingsForTests;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.page;


public class DownloadStatementTest extends SettingsForTests {
    // private static final String PAGEPDF = "Условия передачи информации";

    @Test
    public void downloadPDF() throws FileNotFoundException {
        DownloadStatementAsPdf page = page(DownloadStatementAsPdf.class);
        page.downloadStatementAsPdf();

    }
}
