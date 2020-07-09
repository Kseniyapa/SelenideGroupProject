package com.pflb.pages;

import com.codeborne.selenide.SelenideElement;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DownloadStatementAsPdf {
    private SelenideElement openWindowAuth = $x("//*[@id=\"header-lk-button\"]");

    private SelenideElement registrationButton = $("[ng-tr=\"WHE.WHE20\"]");

    private SelenideElement toBeClient = $("[ng-tr=\"WHE1.WHE12\"]");

    private SelenideElement transmittingInformation = $("a[href$=\"assets/files/tester_conditions.pdf\"]");


    public void downloadStatementAsPdf() throws FileNotFoundException {
        openWindowAuth.shouldBe(visible).click();
        registrationButton.shouldBe(visible).click();
        toBeClient.shouldBe(visible).click();
        transmittingInformation.shouldBe(visible).download();

    }

}
