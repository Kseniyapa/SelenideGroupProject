package com.pflb.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.visible;

public class CreateNewTestPage {
    /**
     * Локаторы для работы со страницей.
     */
    @FindBy(how = How.XPATH, using = "[ng-tr=\"MTP.MTP\"]")
    private SelenideElement buttonCreateNewTest; //  Кнопка "Новый тест".

    @FindBy(how = How.XPATH, using = "//*[css = \"[data-testid=\"Test name input\"]]")
    private SelenideElement fieldTestName; // Поле "Название теста".

    @FindBy(how = How.XPATH, using = "//*[css = \"[data-testid=\"Address site input\"]")
    private SelenideElement fieldWebSite; // Поле "Адрес сайта".

    @FindBy(how = How.XPATH, using = "//*[css = \"[data-testid=\"Information textarea\"]")
    private SelenideElement fieldInformationForRespondent; // Поле "Вводная информация для респондента".

    @FindBy(how = How.XPATH, using = "//*[css = \"[data-testid=\"Submit button\"]")
    private SelenideElement buttonSelectAudience; // Кнопка "К выбору аудитории".

    @FindBy(how = How.XPATH, using = "//*[css = \"[data-testid=\"Segment name input 0\"]")
    private SelenideElement fieldNameSegment; // Поле "Название сегмента".

    @FindBy(how = How.XPATH, using = "//*[css = \"[data-testid=\"Tasks button\"]")
    private SelenideElement buttonToTasks; // Кнопка "К заданиям".

    @FindBy(how = How.XPATH, using = "//*[css = \"[data-testid=\"Tasks button\"]")
    private SelenideElement fieldVoiceResponse; // Поле "Голосовой ответ".

    @FindBy(how = How.XPATH, using = "//*[css = \"[data-testid=\"Tasks submit task\"]")
    private SelenideElement buttonAdded; // Кнопка "Добавить".

    @FindBy(how = How.XPATH, using = "//*[css = \"[data-testid=\"Check button\"]")
    private SelenideElement buttonCheckAndRun; // Кнопка "Проверка и запуск".

    @FindBy(how = How.XPATH, using = "//*[css = \"[data-testid=\"Checkout start button\"]")
    private SelenideElement buttonRunFreeTest;// Кнопка "Запустиьть бесплатный тест".

    /**
     * Метод создания нового теста с параметрами:
     * @param testName -Имя теста
     * @param webSite -адрес сайта
     * @param nameSegment -название сегмента
     * @param voiceResponse - голосовой ответ
     */
    public void createNewTest(String testName, String webSite, String nameSegment, String voiceResponse) {
        buttonCreateNewTest();
        fieldTestName.setValue(testName);
        fieldWebSite.setValue(webSite);
        buttonSelectAudience.shouldBe(visible).pressEnter();
        fieldNameSegment.setValue(nameSegment);
        buttonToTasks.shouldBe(visible).pressEnter();
        fieldVoiceResponse.setValue(voiceResponse);
        buttonAdded.shouldBe(visible).pressEnter();
        buttonCheckAndRun.shouldBe(visible).pressEnter();
        buttonRunFreeTest.shouldBe(visible).pressEnter();
    }

    /**
     * Метод нажимает кнопку для создания нового теста.
     */
    private void buttonCreateNewTest() {
        buttonCreateNewTest.shouldBe(visible).click();
    }

}
