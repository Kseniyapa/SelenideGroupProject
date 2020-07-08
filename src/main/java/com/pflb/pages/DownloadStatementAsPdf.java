package com.pflb.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DownloadStatementAsPdf {
    private SelenideElement openWindowAuth = $(By.xpath("//*[@id=\"header-lk-button\"]"));
    private SelenideElement registrationButton = $(By.xpath("//div[1]/section[1]/label"));
    private SelenideElement toBeClient = $(By.cssSelector("[ng-tr=\"WHE1.WHE12\"]"));
    private SelenideElement transmittingInformation = $(By.cssSelector("a[href$=\"assets/files/tester_conditions.pdf\"]"));

    public void downloadStatementAsPdf() {
        openWindowAuth.shouldBe(visible).click();
        registrationButton.shouldBe(visible).click();
        toBeClient.shouldBe(visible).click();
        transmittingInformation.shouldBe(visible).click();
    }
}
